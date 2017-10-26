import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

//stuff like a.b.c or a[1] or a(), with optional prefix operator
public class Prefix implements PrefixOrExpression {

    private ParserRuleContext originalCtx;
    private SwiftParser.Prefix_operatorContext prefixOperatorContext;
    public ArrayList<PrefixElem> elems = new ArrayList<PrefixElem>();
    public ParserRuleContext originalCtx() {return originalCtx;}

    public Prefix(SwiftParser.Prefix_expressionContext prefixCtx, Instance knownType, Visitor visitor) {
        ArrayList<ParserRuleContext> chain = flattenChain(prefixCtx);
        originalCtx = prefixCtx;
        prefixOperatorContext = prefixCtx.prefix_operator();

        Instance currType = null;
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

            PrefixElem elem = PrefixElem.get(ctx, functionCallParams, chain, chainPos, currType, (chainPos + (functionCallParams != null ? 1 : 0) >= chain.size() - 1) ? knownType : null, visitor);
            boolean skip = elem.type.codeReplacement != null && elem.type.codeReplacement.containsKey(visitor.targetLanguage) && elem.type.codeReplacement.get(visitor.targetLanguage).equals("");

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

    public String code(ParseTree ctx, Visitor visitor) {
        return elemCode(elems, 0, initString(), false, prefixOperatorContext != null && prefixOperatorContext.getText().equals("&"), ctx, visitor);
    }
    public String code(boolean onAssignmentLeftHandSide, ParseTree ctx, Visitor visitor) {
        return elemCode(elems, 0, initString(), onAssignmentLeftHandSide, prefixOperatorContext != null && prefixOperatorContext.getText().equals("&"), ctx, visitor);
    }
    public String code(boolean onAssignmentLeftHandSide, int limit, ParseTree ctx, Visitor visitor) {
        return elemCode(elems.subList(0, limit), 0, initString(), onAssignmentLeftHandSide, prefixOperatorContext != null && prefixOperatorContext.getText().equals("&"), ctx, visitor);
    }
    private String initString() {
        return prefixOperatorContext != null && !prefixOperatorContext.getText().equals("&") ? prefixOperatorContext.getText() : "";
    }
    static private String elemCode(List<PrefixElem> elems, int chainPos, String L, boolean onAssignmentLeftHandSide, boolean isInOutExpression, ParseTree ctx, Visitor visitor) {
        PrefixElem elem = elems.get(chainPos);
        boolean isLast = chainPos + 1 >= elems.size();

        Map<String, String> codeReplacement =
            elem.type.codeReplacement != null ? elem.type.codeReplacement :
            elem.typeBeforeCallParams instanceof Instance ? ((Instance)elem.typeBeforeCallParams).codeReplacement :
            elem.typeBeforeCallParams instanceof FunctionDefinition ? ((FunctionDefinition)elem.typeBeforeCallParams).codeReplacement :
            null;

        String LR = codeReplacement != null && codeReplacement.containsKey(visitor.targetLanguage) ? codeReplacement.get(visitor.targetLanguage)
                  : elem.accessor.equals("_.()") ? "_.#R(#L" + (elem.functionCallParams != null ? ",#AA" : "") + ")"
                  : onAssignmentLeftHandSide && isLast && isGetAccessor(elem.accessor) ? "#L.put(" + (isCastGetAccessor(elem.accessor) ? "\"" : "") + "#R" + (isCastGetAccessor(elem.accessor) ? "\"" : "") + ","
                  : onAssignmentLeftHandSide && isLast && elem.type.isGetterSetter ? "#L" + (chainPos == 0 ? "" : ".") + "#R$set("
                  : onAssignmentLeftHandSide && isLast && elem.type.isInout ? "#L" + (chainPos == 0 ? "" : ".") + "#R.set("
                  : isCastGetAccessor(elem.accessor) ? elem.accessor.substring(0, elem.accessor.length() - 9) + "#L.get(\"#R\"))"
                  : "#L" + (chainPos == 0 ? "#R" : elem.accessor.equals(".") ? ".#R" : elem.accessor.equals(".get()") ? ".get(#R)" : "[#R]") + (elem.functionCallParams != null ? "(#AA)" : "");

        LR = LR.replaceAll("#L", Matcher.quoteReplacement(L)).replaceAll("#R", Matcher.quoteReplacement(elem.code));
        if(elem.functionCallParams != null) {
            String paramsJoined = "";
            for(int i = 0; i < elem.functionCallParams.size(); i++) paramsJoined += (i > 0 ? ", " : "") + elem.functionCallParams.get(i);
            LR = LR.replaceAll("#AA", Matcher.quoteReplacement(paramsJoined));
            for(int i = 0; i < elem.functionCallParams.size(); i++) LR = LR.replaceAll("#A" + i, Matcher.quoteReplacement(elem.functionCallParams.get(i)));
        }
        if(elem.type.generics != null) {
            for(String key : elem.type.generics.keySet()) LR = LR.replaceAll("#" + key, Matcher.quoteReplacement(elem.type.generics.get(key).targetType(visitor.targetLanguage, false, true)));
        }

        String nextCode =
                !isLast ? elemCode(elems, chainPos + 1, LR, onAssignmentLeftHandSide, isInOutExpression, ctx, visitor)
                : LR;

        if(elem.isOptional && !onAssignmentLeftHandSide) {
            nextCode = "(" + L + "!= null ? " + nextCode + " : null )";
        }

        if(isLast && elem.functionCallParams != null && elem.typeBeforeCallParams instanceof ClassDefinition) {
            nextCode = "new " + nextCode;
            if(Initializer.isFailable(elem, ctx, visitor)) {
                nextCode = "_.failableInit(" + nextCode + ")";
            }
        }

        if(!onAssignmentLeftHandSide && isLast && elem.type.isGetterSetter) {
            nextCode += "$get()";
        }
        if(!onAssignmentLeftHandSide && isLast && elem.type.isInout) {
            nextCode += ".get()";
        }

        if(isLast && isInOutExpression) {
            nextCode = "{get: () => " + nextCode + ", set: $val => " + nextCode + " = $val}";
        }

        return nextCode;
    }

    public Instance type() {
        return elems.get(elems.size() - 1).type.withoutPropertyInfo();
    }

    public boolean isDictionaryIndex() {
        return elems.size() >= 2 && elems.get(elems.size() - 2).type.uniqueId().equals("Dictionary") && (elems.get(elems.size() - 1).accessor.equals("[]") || isGetAccessor(elems.get(elems.size() - 1).accessor));
    }

    public boolean hasOptionals() {
        for(int i = 0; i < elems.size(); i++) {
            if(elems.get(i).isOptional) return true;
        }
        return false;
    }

    static private boolean isCastGetAccessor(String accessor) {
        return accessor.startsWith("((") && accessor.endsWith(")).get(\"\")");
    }
    static private boolean isGetAccessor(String accessor) {
        return accessor.equals(".get()") || isCastGetAccessor(accessor);
    }
    public boolean endsWithGetAccessor() {
        return isGetAccessor(this.elems.get(this.elems.size() - 1).accessor);
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
