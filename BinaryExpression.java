import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;

public class BinaryExpression {

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


    static public int priorityForOperator(ParserRuleContext operator) {
        String operatorAlias = BinaryExpression.operatorAlias(operator);
        return priorities.get(operatorAlias);
    }
    static public String operatorAlias(ParserRuleContext operator) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) return "?:";
        return operator.getText();
    }

    static public Expression compute(ParserRuleContext operator, PrefixOrExpression L, PrefixOrExpression R, Visitor visitor) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) {
            SwiftParser.Conditional_operatorContext conditionalOperator = (SwiftParser.Conditional_operatorContext)operator;
            Expression passExpression = new Expression(conditionalOperator.expression(), visitor);
            String code = L.code() + " ? " + passExpression.code + " : " + R.code();
            AbstractType type = Type.alternative(passExpression, R);
            return new Expression(code, type);
        }
        else {
            Expression replacement = BinaryExpression.replacement(operator, L, R, visitor);
            if(replacement != null) return replacement;
            String alias = BinaryExpression.operatorAlias(operator);
            String code = L.code() + " " + operator.getText() + " " + R.code();
            AbstractType type = L.type();//TODO new type based on operator (eg bool for >)
            return new Expression(code, type);
        }
    }

    static private Expression replacement(ParserRuleContext operator, PrefixOrExpression L, PrefixOrExpression R, Visitor visitor) {
        String alias = BinaryExpression.operatorAlias(operator);
        if(alias.equals("??")) {
            String code = "(" + L.code() + " != null ? " + L.code() + " : " + R.code() + ")";
            AbstractType type = Type.alternative(L, R);
            return new Expression(code, type);
        }
        if(isAssignment(alias) && L instanceof Prefix) {
            String lCode = ((Prefix)L).code(isAssignment(alias)), rCode = AssignmentUtil.augment(R), ifCode0 = null, ifCode1 = null, elseCode1 = null;
            if(((Prefix) L).isDictionaryIndex()) {
                if(R.type().swiftType().equals("Void")) {lCode = "delete " + lCode; rCode = null;}
                else if(R.type().isOptional) {ifCode1 = "(" + rCode + ") != null"; elseCode1 = "delete " + lCode;}
            }
            if(((Prefix) L).hasOptionals()) {
                ifCode0 = optionalsGuardingIf(((Prefix) L));
            }
            String lrCode = lCode + " " + operator.getText() + " " + rCode;
            if(ifCode1 != null) lrCode = "if(" + ifCode1 + ") { " + lrCode + " } else { " + elseCode1 + " }";
            if(ifCode0 != null) lrCode = "if(" + ifCode0 + ") { " + lrCode + " }";
            return new Expression(lrCode, new BasicType("Void"));
        }
        return null;
    }

    static private boolean isAssignment(String alias) {
        return alias.equals("=") || alias.equals("+=") || alias.equals("-=") || alias.equals("*=") || alias.equals("/=") || alias.equals("%=");
    }

    static private String optionalsGuardingIf(Prefix L) {
        String ifCode = "";
        for(int i = 0; i < L.elems.size(); i++) {
            if(L.elems.get(i).isOptional) ifCode += (ifCode.length() > 0 ? " && " : "") + L.code(true, i) + " != null";
        }
        return ifCode;
    }
}
