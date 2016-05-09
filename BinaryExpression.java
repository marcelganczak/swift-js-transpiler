import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryExpression implements ExpressionResult {

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

    String code;
    AbstractType type;
    public BinaryExpression(String code, AbstractType type) {
        this.code = code;
        this.type = type;
    }
    public String code() {return code;}
    public AbstractType type() {return type;}

    static public BinaryExpression handle(SwiftParser.ExpressionContext ctx, TranspilerVisitor visitor) {

        List<SwiftParser.Binary_expressionContext> binaries = ctx.binary_expressions().binary_expression();
        ArrayList<ExpressionResult> elems = new ArrayList<ExpressionResult>();
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
                ExpressionResult L = elems.get(i);
                ExpressionResult R = elems.get(i + 1);
                ExpressionResult LR = compute(operator, L, R, visitor);
                elems.remove(i);
                elems.remove(i);
                elems.add(i, LR);
                operators.remove(i);
                i--;
            }
        }

        return new BinaryExpression(elems.get(0).code(), elems.get(0).type());
    }

    static private int priorityForOperator(ParserRuleContext operator) {
        String operatorAlias = BinaryExpression.operatorAlias(operator);
        return priorites.get(operatorAlias);
    }
    static public String operatorAlias(ParserRuleContext operator) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) return "?:";
        return operator.getText();
    }

    static private BinaryExpression compute(ParserRuleContext operator, ExpressionResult L, ExpressionResult R, TranspilerVisitor visitor) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) {
            SwiftParser.Conditional_operatorContext conditionalOperator = (SwiftParser.Conditional_operatorContext)operator;
            ExpressionResult passExpression = visitor.jsChain(conditionalOperator.expression());
            String code = L.code() + " ? " + passExpression.code() + " : " + R.code();
            AbstractType type = Type.alternative(passExpression, R);
            return new BinaryExpression(code, type);
        }
        else {
            BinaryExpression replacement = BinaryExpression.replacement(operator, L, R, visitor);
            if(replacement != null) return replacement;
            String code = L.code() + " " + operator.getText() + " " + R.code();
            AbstractType type = L.type();//TODO new type based on operator (eg bool for >)
            return new BinaryExpression(code, type);
        }
    }

    static private BinaryExpression replacement(ParserRuleContext operator, ExpressionResult L, ExpressionResult R, TranspilerVisitor visitor) {
        String alias = BinaryExpression.operatorAlias(operator);
        if(alias.equals("??")) {
            String code = "(" + L.code() + " != null ? " + L.code() + " : " + R.code() + ")";
            AbstractType type = Type.alternative(L, R);
            return new BinaryExpression(code, type);
        }
        if(alias.equals("=")) {
            if(L instanceof ChainResult && ((ChainResult) L).isDictionaryIndex()) {
                if(R.type().swiftType().equals("Void")) return new BinaryExpression("delete " + L.code(), new BasicType("Void"));
                if(R.type().isOptional) return new BinaryExpression("if((" + R.code() + ") != null) { " + L.code() + " = " + R.code() + " } else { delete " + L.code() + " }", new BasicType("Void"));
            }
            if(false/*L has ?.*/) {

            }
        }
        return null;
    }
}
