import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

class Replacement {
    public int skip = 0;
    public PrefixElem elem;
    public Replacement(PrefixElem elem) {
        this.elem = elem;
    }
    public Replacement(PrefixElem elem, int skip) {
        this.elem = elem;
        this.skip = skip;
    }
}
public class Prefix implements PrefixOrExpression {
    public ArrayList<PrefixElem> elems = new ArrayList<PrefixElem>();

    public Prefix(SwiftParser.Prefix_expressionContext prefixCtx, Visitor visitor) {
        ArrayList<ParserRuleContext> chain = flattenChain(prefixCtx);
        
        AbstractType currType = null;
        
        for(int chainPos = 0; chainPos < chain.size(); chainPos++) {
            ParserRuleContext ctx = chain.get(chainPos);

            SwiftParser.Function_call_expressionContext functionCall = null;
            List<SwiftParser.Expression_elementContext> functionCallParams = null;
            if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_expressionContext) {
                functionCall = (SwiftParser.Function_call_expressionContext) chain.get(chainPos + 1);
                functionCallParams = functionCall.parenthesized_expression().expression_element_list() != null ? functionCall.parenthesized_expression().expression_element_list().expression_element() : null;
            }

            PrefixElem elem;
            Replacement replacement = Prefix.replacement(chainPos == 0, currType, ctx instanceof SwiftParser.Explicit_member_expressionContext ? ((SwiftParser.Explicit_member_expressionContext) ctx).identifier().getText() : ctx.getText(), functionCallParams, visitor);
            if(replacement != null) {
                elem = replacement.elem;
                chainPos += replacement.skip;
            }
            else {
                elem = PrefixElem.get(ctx, null/*declaredType*/, functionCall, functionCallParams, chain, chainPos, currType, visitor);
            }

            elem.isOptional = ctx.getChild(0).getText().equals("?");

            if(elem.type == null) {
                elem.type = Type.resulting(currType, elem.code, chain.get(0), visitor);
                if(functionCall != null && elem.type instanceof FunctionType) elem.type = elem.type.resulting("()");
            }

            if(functionCall != null) chainPos++;

            elems.add(elem);
            currType = elem.type;
        }
    }

    public String code() {
        return elemCode(elems, 0, "", false);
    }
    public String code(boolean onAssignmentLeftHandSide) {
        return elemCode(elems, 0, "", onAssignmentLeftHandSide);
    }
    public String code(boolean onAssignmentLeftHandSide, int limit) {
        return elemCode(elems.subList(0, limit), 0, "", onAssignmentLeftHandSide);
    }
    static private String elemCode(List<PrefixElem> elems, int chainPos, String L, boolean onAssignmentLeftHandSide) {
        PrefixElem elem = elems.get(chainPos);

        String LR = elem.accessorType.equals("_.()") ? "_." + elem.code + "(" + L + (elem.functionCallParams != null ? "," + elem.functionCallParams : "") + ")"
                  : L + (L.length() == 0 ? elem.code : elem.accessorType.equals(".") ? "." + elem.code : "[" + elem.code + "]") + (elem.functionCallParams != null ? "(" + elem.functionCallParams + ")" : "");

        String nextCode =
                chainPos + 1 < elems.size() ? elemCode(elems, chainPos + 1, LR, onAssignmentLeftHandSide)
                : LR;

        if(elem.isOptional && !onAssignmentLeftHandSide) {
            nextCode = "(" + L + "!= null ? " + nextCode + " : null )";
        }

        return nextCode;
    }

    static private Replacement replacement(boolean isStart, AbstractType lType, String R, List<SwiftParser.Expression_elementContext> functionCallParams, Visitor visitor) {
        if(R == null) return null;
        if(lType != null && lType.swiftType().equals("Dictionary")) {
            if(R.equals("count")) {
                return new Replacement(new PrefixElem("size", "_.()", new BasicType("Int"), null));
            }
            if(R.equals("updateValue")) {
                return new Replacement(new PrefixElem("updateValue", "_.()", new BasicType("Void"), null/*TODO*/));
            }
        }
        if(lType != null && lType.swiftType().equals("Array")) {
            if(R.equals("count")) {
                return new Replacement(new PrefixElem("length", ".", new BasicType("Int"), null));
            }
        }
        if(lType != null && lType.swiftType().equals("Set")) {
            if(R.equals("count")) {
                return new Replacement(new PrefixElem("size", ".", new BasicType("Int"), null));
            }
            if(R.equals("insert")) {
                return new Replacement(new PrefixElem("add", ".", new BasicType("Void"), visitor.visit(functionCallParams.get(0))));
            }
        }
        if(lType != null && lType.swiftType().equals("String")) {
            if(R.equals("characters")) {
                return new Replacement(new PrefixElem("length", ".", new BasicType("Int"), null), 1);
            }
        }
        if(isStart) {
            if(R.equals("print")) return new Replacement(new PrefixElem("console.log", "", new BasicType("Void"), visitor.visit(functionCallParams.get(0))));
        }
        return null;
    }

    public AbstractType type() {
        return elems.get(elems.size() - 1).type;
    }

    public boolean isDictionaryIndex() {
        return elems.size() >= 2 && elems.get(elems.size() - 2).type.swiftType().equals("Dictionary") && elems.get(elems.size() - 1).accessorType.equals("[]");
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
            if(postfix.chain_postfix_expression() != null && !(postfix.chain_postfix_expression() instanceof SwiftParser.Forced_value_expressionContext)) {
                flattened.add(0, postfix.chain_postfix_expression());
                if(postfix.chain_postfix_expression() instanceof SwiftParser.Explicit_member_expression_number_doubleContext) flattened.add(0, postfix.chain_postfix_expression());
            }
            postfix = postfix.postfix_expression();
        }
        flattened.add(0, postfix.primary_expression());
        return flattened;
    }
}
