import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

class Replacement {
    public int skip = 0;
    public ChainElem elem;
    public Replacement(ChainElem elem) {
        this.elem = elem;
    }
    public Replacement(ChainElem elem, int skip) {
        this.elem = elem;
        this.skip = skip;
    }
}
public class ChainResult implements ExpressionResult {
    public ArrayList<ChainElem> elems = new ArrayList<ChainElem>();

    public ChainResult(AbstractType declaredType, ArrayList<ParserRuleContext> chain, TranspilerVisitor visitor) {
        AbstractType currType = null;
        
        for(int chainPos = 0; chainPos < chain.size(); chainPos++) {
            ParserRuleContext ctx = chain.get(chainPos);

            SwiftParser.Function_call_expressionContext functionCall = null;
            List<SwiftParser.Expression_elementContext> functionCallParams = null;
            if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_expressionContext) {
                functionCall = (SwiftParser.Function_call_expressionContext) chain.get(chainPos + 1);
                functionCallParams = functionCall.parenthesized_expression().expression_element_list() != null ? functionCall.parenthesized_expression().expression_element_list().expression_element() : null;
            }

            ChainElem elem;
            Replacement replacement = ChainResult.replacement(chainPos == 0, currType, ctx instanceof SwiftParser.Explicit_member_expressionContext ? ((SwiftParser.Explicit_member_expressionContext) ctx).identifier().getText() : ctx.getText(), functionCallParams, visitor);
            if(replacement != null) {
                elem = replacement.elem;
                chainPos += replacement.skip;
            }
            else {
                elem = ChainElem.get(ctx, declaredType, functionCall, functionCallParams, chain, chainPos, currType, visitor);
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
    static private String elemCode(List<ChainElem> elems, int chainPos, String L, boolean onAssignmentLeftHandSide) {
        ChainElem elem = elems.get(chainPos);

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

    static private Replacement replacement(boolean isStart, AbstractType lType, String R, List<SwiftParser.Expression_elementContext> functionCallParams, TranspilerVisitor visitor) {
        if(R == null) return null;
        if(lType != null && lType.swiftType().equals("Dictionary")) {
            if(R.equals("count")) {
                return new Replacement(new ChainElem("size", "_.()", new BasicType("Int"), null));
            }
            if(R.equals("updateValue")) {
                return new Replacement(new ChainElem("updateValue", "_.()", new BasicType("Void"), null/*TODO*/));
            }
        }
        if(lType != null && lType.swiftType().equals("Array")) {
            if(R.equals("count")) {
                return new Replacement(new ChainElem("length", ".", new BasicType("Int"), null));
            }
        }
        if(lType != null && lType.swiftType().equals("Set")) {
            if(R.equals("count")) {
                return new Replacement(new ChainElem("size", ".", new BasicType("Int"), null));
            }
            if(R.equals("insert")) {
                return new Replacement(new ChainElem("add", ".", new BasicType("Void"), visitor.visit(functionCallParams.get(0))));
            }
        }
        if(lType != null && lType.swiftType().equals("String")) {
            if(R.equals("characters")) {
                return new Replacement(new ChainElem("length", ".", new BasicType("Int"), null), 1);
            }
        }
        if(isStart) {
            if(R.equals("print")) return new Replacement(new ChainElem("console.log", "", new BasicType("Void"), visitor.visit(functionCallParams.get(0))));
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
}
