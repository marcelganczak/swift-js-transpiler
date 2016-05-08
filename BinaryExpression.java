import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryExpression {

    static private HashMap<String, Integer> priorites;
    static {
        priorites = new HashMap<String, Integer>();
        priorites.put("*=",  9);
        priorites.put("+=",  9);
        priorites.put("-=",  9);
        priorites.put("=",   9);
        priorites.put("?:",  8);
        priorites.put("&&",  7);
        priorites.put("||",  7);
        priorites.put("===", 6);
        priorites.put("==",  6);
        priorites.put("!==", 6);
        priorites.put("!=",  6);
        priorites.put("<",   6);
        priorites.put("<=",  6);
        priorites.put(">",   6);
        priorites.put(">=",  6);
        priorites.put("+",   5);
        priorites.put("-",   5);
        priorites.put("*",   4);
        priorites.put("/",   4);
        priorites.put("%",   4);
    }

    static public ChainElem handle(SwiftParser.ExpressionContext ctx, TranspilerVisitor visitor) {

        List<SwiftParser.Binary_expressionContext> binaries = ctx.binary_expressions().binary_expression();
        ArrayList<ChainElem> elems = new ArrayList<ChainElem>();
        ArrayList<ParserRuleContext> operators = new ArrayList<ParserRuleContext>();
        for(int i = -1; i < binaries.size(); i++) {
            if(i >= 0) {
                SwiftParser.Binary_expressionContext binary = binaries.get(i);
                elems.add(visitor.jsChain(binary.prefix_expression()));
                operators.add(binary.binary_operator() != null ? binary.binary_operator() : binary.conditional_operator());
            }
            else {
                elems.add(visitor.jsChain(ctx.prefix_expression()));
            }
        }

        for(int priority = 4; priority <= 9; priority++) {
            for(int i = 0; i < operators.size(); i++) {
                ParserRuleContext operator = operators.get(i);
                if(priorityForOperator(operator) != priority) continue;
                ChainElem L = elems.get(i);
                ChainElem R = elems.get(i + 1);
                ChainElem LR = compute(operator, L, R, visitor);
                elems.remove(i);
                elems.remove(i);
                elems.add(i, LR);
                operators.remove(i);
                i--;
            }
        }

        return new ChainElem(elems.get(0).code, "", elems.get(0).type, null);
    }

    static private int priorityForOperator(ParserRuleContext operator) {
        String operatorAlias = BinaryExpression.operatorAlias(operator);
        return priorites.get(operatorAlias);
    }
    static public String operatorAlias(ParserRuleContext operator) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) return "?:";
        return operator.getText();
    }

    static private ChainElem compute(ParserRuleContext operator, ChainElem L, ChainElem R, TranspilerVisitor visitor) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) {
            SwiftParser.Conditional_operatorContext conditionalOperator = (SwiftParser.Conditional_operatorContext)operator;
            ChainElem passExpression = visitor.jsChain(conditionalOperator.expression());
            String code = L.code + " ? " + passExpression.code + " : " + R.code;
            AbstractType type = R.type;//TODO check passExpression and R: if one returns null, the type is the other and optional
            return new ChainElem(code, "", type, null);
        }
        else {
            String code = L.code + " " + operator.getText() + " " + R.code;
            AbstractType type = L.type;//TODO new type based on operator (eg bool for >)
            return new ChainElem(code, "", type, null);
        }
    }
}
