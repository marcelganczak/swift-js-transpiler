import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

class Replacement {
    public boolean skip;
    public PrefixElem elem;
    public Replacement(PrefixElem elem, boolean skip) {
        this.elem = elem;
        this.skip = skip;
    }
}
public class Prefix implements PrefixOrExpression {
    static private JSONObject definitions;
    static {
        InputStream is = Prefix.class.getResourceAsStream("prefix-elems.json");
        String jsonTxt = null;
        try { jsonTxt = IOUtils.toString(is); } catch (IOException e) { }
        try { definitions = new JSONObject(jsonTxt); } catch (JSONException e) { }
    }

    private ParserRuleContext originalCtx;
    private SwiftParser.Prefix_operatorContext prefixOperatorContext;
    public ArrayList<PrefixElem> elems = new ArrayList<PrefixElem>();
    public ParserRuleContext originalCtx() {return originalCtx;}

    public Prefix(SwiftParser.Prefix_expressionContext prefixCtx, AbstractType type, Visitor visitor) {
        ArrayList<ParserRuleContext> chain = flattenChain(prefixCtx);
        originalCtx = prefixCtx;
        prefixOperatorContext = prefixCtx.prefix_operator();

        AbstractType currType = null;
        boolean nextIsOptional = false;
        
        for(int chainPos = 0; chainPos < chain.size(); chainPos++) {
            ParserRuleContext ctx = chain.get(chainPos);

            List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams = null;
            if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_expressionContext) {
                SwiftParser.Function_call_expressionContext functionCall = (SwiftParser.Function_call_expressionContext) chain.get(chainPos + 1);
                functionCallParams = new ArrayList<ParserRuleContext>();
                if(functionCall.parenthesized_expression().expression_element_list() != null) for(int i = 0; i < functionCall.parenthesized_expression().expression_element_list().expression_element().size(); i++) functionCallParams.add(functionCall.parenthesized_expression().expression_element_list().expression_element().get(i));
            }
            else if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_with_closure_expressionContext) {
                SwiftParser.Function_call_with_closure_expressionContext functionCall = (SwiftParser.Function_call_with_closure_expressionContext) chain.get(chainPos + 1);
                functionCallParams = new ArrayList<ParserRuleContext>();
                if(functionCall.parenthesized_expression() != null && functionCall.parenthesized_expression().expression_element_list() != null) for(int i = 0; i < functionCall.parenthesized_expression().expression_element_list().expression_element().size(); i++) functionCallParams.add(functionCall.parenthesized_expression().expression_element_list().expression_element().get(i));
                functionCallParams.add(functionCall.trailing_closure().explicit_closure_expression());
            }

            PrefixElem elem;
            boolean skip = false;
            Replacement replacement = Prefix.replacement(currType, ctx instanceof SwiftParser.Explicit_member_expressionContext ? ((SwiftParser.Explicit_member_expressionContext) ctx).identifier().getText() : ctx.getText(), functionCallParams, visitor);
            if(replacement != null) {
                elem = replacement.elem;
                if(replacement.skip) skip = true;
            }
            else {
                elem = PrefixElem.get(ctx, functionCallParams, chain, chainPos, currType, (chainPos + (functionCallParams != null ? 1 : 0) >= chain.size() - 1) ? type : null, visitor);
            }

            if(functionCallParams != null) chainPos++;

            if(!skip) {
                elems.add(elem);
                currType = elem.type;
            }

            if(nextIsOptional) {
                nextIsOptional = false;
                elem.isOptional = true;
            }
            if(ctx.getChild(0).getText().equals("?")) {
                if(!skip) elem.isOptional = true;
                else nextIsOptional = true;
            }
        }
    }

    public String code() {
        return elemCode(elems, 0, initString(), false);
    }
    public String code(boolean onAssignmentLeftHandSide) {
        return elemCode(elems, 0, initString(), onAssignmentLeftHandSide);
    }
    public String code(boolean onAssignmentLeftHandSide, int limit) {
        return elemCode(elems.subList(0, limit), 0, initString(), onAssignmentLeftHandSide);
    }
    private String initString() {
        return prefixOperatorContext != null ? prefixOperatorContext.getText() : "";
    }
    static private String elemCode(List<PrefixElem> elems, int chainPos, String L, boolean onAssignmentLeftHandSide) {
        PrefixElem elem = elems.get(chainPos);

        String LR = elem.accessor.equals("_.()") ? "_." + elem.code + "(" + L + (elem.functionCallParams != null ? "," + elem.functionCallParams : "") + ")"
                  : L + (chainPos == 0 ? elem.code : elem.accessor.equals(".") ? "." + elem.code : "[" + elem.code + "]") + (elem.functionCallParams != null ? "(" + elem.functionCallParams + ")" : "");

        String nextCode =
                chainPos + 1 < elems.size() ? elemCode(elems, chainPos + 1, LR, onAssignmentLeftHandSide)
                : LR;

        if(elem.isOptional && !onAssignmentLeftHandSide) {
            nextCode = "(" + L + "!= null ? " + nextCode + " : null )";
        }

        return nextCode;
    }

    static private Replacement replacement(AbstractType lType, String R, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {
        if(R == null) return null;
        if(definitions.optJSONObject(lType == null ? "top-level" : lType.swiftType()) == null) return null;
        JSONObject definition = definitions.optJSONObject(lType == null ? "top-level" : lType.swiftType()).optJSONObject(R);
        if(definition == null) return null;

        if(definition.optBoolean("skip")) return new Replacement(null, true);

        String strFunctionCallParams = null;
        JSONArray definitionFunctionCallParams = definition.optJSONArray("params");
        if(definitionFunctionCallParams != null) {
            String[] strArrFunctionCallParams = new String[definition.optInt("numParams", definitionFunctionCallParams.length())];
            for(int i = 0; i < definitionFunctionCallParams.length(); i++) {
                JSONObject definitionFunctionCallParam = definitionFunctionCallParams.optJSONObject(i);
                AbstractType type = Type.fromDefinition(definitionFunctionCallParam.optString("type"), lType);
                strArrFunctionCallParams[definitionFunctionCallParam.optInt("index", i)] = (functionCallParams.get(i) instanceof SwiftParser.Explicit_closure_expressionContext ? FunctionUtil.explicitClosureExpression((SwiftParser.Explicit_closure_expressionContext) functionCallParams.get(i), (FunctionType) type, visitor) : new Expression(((SwiftParser.Expression_elementContext)functionCallParams.get(i)).expression(), type, visitor).code);
            }
            if(definition.optJSONArray("defaultParams") != null) {
                for(int i = 0; i < definition.optJSONArray("defaultParams").length(); i++) {
                    JSONObject definitionFunctionCallParam = definition.optJSONArray("defaultParams").optJSONObject(i);
                    strArrFunctionCallParams[definitionFunctionCallParam.optInt("index", i)] = definitionFunctionCallParam.optString("value");
                }
            }
            strFunctionCallParams = "";
            for(int i = 0; i < strArrFunctionCallParams.length; i++) strFunctionCallParams += (i > 0 ? ", " : "") + strArrFunctionCallParams[i];
        }

        AbstractType type = definition.optString("type").equals("#L") ? lType : definition.optString("type").equals("#valueType") ? ((NestedType)lType).valueType : definition.optString("type").equals("#keyType") ? ((NestedType)lType).keyType : new BasicType(definition.optString("type"));
        return new Replacement(new PrefixElem(definition.optString("code", R), definition.optString("accessor", "."), type, strFunctionCallParams), false);
    }

    public AbstractType type() {
        return elems.get(elems.size() - 1).type;
    }

    public boolean isDictionaryIndex() {
        return elems.size() >= 2 && elems.get(elems.size() - 2).type.swiftType().equals("Dictionary") && elems.get(elems.size() - 1).accessor.equals("[]");
    }

    public boolean hasOptionals() {
        for(int i = 0; i < elems.size(); i++) {
            if(elems.get(i).isOptional) return true;
        }
        return false;
    }

    static private ArrayList<ParserRuleContext> flattenChain(SwiftParser.Prefix_expressionContext ctx) {
        ArrayList<ParserRuleContext> flattened = new ArrayList<ParserRuleContext>();
        SwiftParser.Postfix_expressionContext postfix = ctx.postfix_expression();
        while(postfix.postfix_expression() != null) {
            if(postfix.chain_postfix_expression() != null && !(postfix.chain_postfix_expression() instanceof SwiftParser.Chain_postfix_operatorContext)) {
                flattened.add(0, postfix.chain_postfix_expression());
                if(postfix.chain_postfix_expression() instanceof SwiftParser.Explicit_member_expression_number_doubleContext) flattened.add(0, postfix.chain_postfix_expression());
            }
            postfix = postfix.postfix_expression();
        }
        flattened.add(0, postfix.primary_expression());
        return flattened;
    }
}
