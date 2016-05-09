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
        priorites.put("??",  7);
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

    static public ChainResult handle(SwiftParser.ExpressionContext ctx, TranspilerVisitor visitor) {

        List<SwiftParser.Binary_expressionContext> binaries = ctx.binary_expressions().binary_expression();
        ArrayList<ChainResult> elems = new ArrayList<ChainResult>();
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
                ChainResult L = elems.get(i);
                ChainResult R = elems.get(i + 1);
                ChainResult LR = compute(operator, L, R, visitor);
                elems.remove(i);
                elems.remove(i);
                elems.add(i, LR);
                operators.remove(i);
                i--;
            }
        }

        return new ChainResult(elems.get(0).code, elems.get(0).type);
    }

    static private int priorityForOperator(ParserRuleContext operator) {
        String operatorAlias = BinaryExpression.operatorAlias(operator);
        return priorites.get(operatorAlias);
    }
    static public String operatorAlias(ParserRuleContext operator) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) return "?:";
        return operator.getText();
    }

    static private ChainResult compute(ParserRuleContext operator, ChainResult L, ChainResult R, TranspilerVisitor visitor) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) {
            SwiftParser.Conditional_operatorContext conditionalOperator = (SwiftParser.Conditional_operatorContext)operator;
            ChainResult passExpression = visitor.jsChain(conditionalOperator.expression());
            String code = L.code + " ? " + passExpression.code + " : " + R.code;
            AbstractType type = Type.alternative(passExpression, R);
            return new ChainResult(code, type);
        }
        else {
            ChainResult replacement = BinaryExpression.replacement(operator, L, R, visitor);
            if(replacement != null) return replacement;
            String code = L.code + " " + operator.getText() + " " + R.code;
            AbstractType type = L.type;//TODO new type based on operator (eg bool for >)
            return new ChainResult(code, type);
        }
    }

    static private ChainResult replacement(ParserRuleContext operator, ChainResult L, ChainResult R, TranspilerVisitor visitor) {
        String alias = BinaryExpression.operatorAlias(operator);
        if(alias.equals("??")) {
            String code = "(" + L.code + " != null ? " + L.code + " : " + R.code + ")";
            AbstractType type = Type.alternative(L, R);
            return new ChainResult(code, type);
        }
        if(alias.equals("=")) {
            boolean lIsDictionaryIndex = L.elems.size() >= 2 && L.elems.get(L.elems.size() - 2).type.swiftType().equals("Dictionary") && L.elems.get(L.elems.size() - 1).accessorType.equals("[]");
            if(lIsDictionaryIndex) {
                if(R.type.swiftType().equals("Void")) return new ChainResult("delete " + L.code, new BasicType("Void"));
                if(R.type.isOptional) return new ChainResult("if((" + R.code + ") != null) {" + L.code + " = " + R.code + "} else { delete " + L.code + " }", new BasicType("Void"));
            }
            if(false/*L has ?.*/) {

            }
        }
        return null;
    }
}
