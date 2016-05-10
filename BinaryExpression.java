import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryExpression implements ExpressionResult {

    static private HashMap<String, Integer> priorities;
    static {
        priorities = new HashMap<String, Integer>();
        priorities.put("=",   9);
        priorities.put("+=",  9);
        priorities.put("-=",  9);
        priorities.put("*=",  9);
        priorities.put("/=",  9);
        priorities.put("%=",  9);
        priorities.put("?:",  8);
        priorities.put("&&",  7);
        priorities.put("||",  7);
        priorities.put("??",  7);
        priorities.put("===", 6);
        priorities.put("==",  6);
        priorities.put("!==", 6);
        priorities.put("!=",  6);
        priorities.put("<",   6);
        priorities.put("<=",  6);
        priorities.put(">",   6);
        priorities.put(">=",  6);
        priorities.put("+",   5);
        priorities.put("-",   5);
        priorities.put("*",   4);
        priorities.put("/",   4);
        priorities.put("%",   4);
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
        return priorities.get(operatorAlias);
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
            String alias = BinaryExpression.operatorAlias(operator);
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
        if(isAssignment(alias) && L instanceof ChainResult) {
            String lCode = ((ChainResult)L).code(isAssignment(alias)), rCode = R.code(), ifCode0 = null, ifCode1 = null, elseCode1 = null;
            if(((ChainResult) L).isDictionaryIndex()) {
                if(R.type().swiftType().equals("Void")) {lCode = "delete " + lCode; rCode = null;}
                else if(R.type().isOptional) {ifCode1 = "(" + rCode + ") != null"; elseCode1 = "delete " + lCode;}
            }
            if(((ChainResult) L).hasOptionals()) {
                ifCode0 = optionalsGuardingIf(((ChainResult) L));
            }
            String lrCode = lCode + " " + operator.getText() + " " + rCode;
            if(ifCode1 != null) lrCode = "if(" + ifCode1 + ") { " + lrCode + " } else { " + elseCode1 + " }";
            if(ifCode0 != null) lrCode = "if(" + ifCode0 + ") { " + lrCode + " }";
            return new BinaryExpression(lrCode, new BasicType("Void"));
        }
        return null;
    }

    static private boolean isAssignment(String alias) {
        return alias.equals("=") || alias.equals("+=") || alias.equals("-=") || alias.equals("*=") || alias.equals("/=") || alias.equals("%=");
    }

    static private String optionalsGuardingIf(ChainResult L) {
        String ifCode = "";
        for(int i = 0; i < L.elems.size(); i++) {
            if(L.elems.get(i).isOptional) ifCode += (ifCode.length() > 0 ? " && " : "") + L.code(true, i) + " != null";
        }
        return ifCode;
    }
}
