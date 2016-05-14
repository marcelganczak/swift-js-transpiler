import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.io.IOUtils;
import org.json.*;

import java.io.IOException;
import java.io.InputStream;

public class BinaryExpression {

    static private JSONObject definitions;
    static {
        InputStream is = BinaryExpression.class.getResourceAsStream("binary-expressions.json");
        String jsonTxt = null;
        try { jsonTxt = IOUtils.toString(is); } catch (IOException e) { }
        definitions = new JSONObject(jsonTxt);
    }


    static public int priorityForOperator(ParserRuleContext operator) {
        String operatorAlias = BinaryExpression.operatorAlias(operator);
        return definitions.getJSONObject(operatorAlias).getInt("priority");
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
            String alias = BinaryExpression.operatorAlias(operator);

            Expression replacement = BinaryExpression.replacement(alias, L, R, visitor);
            if(replacement != null) return replacement;

            JSONObject definition = definitions.getJSONObject(alias).getJSONObject("compute").optJSONObject(L.type().swiftType() + "-" + R.type().swiftType());
            if(definition == null) definition = definitions.getJSONObject(alias).getJSONObject("compute").getJSONObject("default");
            String definitionCode = definition.opt("code") != null ? definition.getString("code") : "L " + alias + " R";
            String definitionType = definition.opt("type") != null ? definition.getString("type") : "L/R";

            String code = definitionCode.replaceAll("L", L.code()).replaceAll("R", R.code());
            AbstractType type = definitionType.equals("L/R") ? Type.alternative(L, R) : new BasicType(definitionType);
            return new Expression(code, type);
        }
    }

    static private Expression replacement(String alias, PrefixOrExpression L, PrefixOrExpression R, Visitor visitor) {
        if(isAssignment(alias) && L instanceof Prefix) {
            String lCode = ((Prefix)L).code(isAssignment(alias)), rCode = AssignmentUtil.augment(R, L.type(), visitor), ifCode0 = null, ifCode1 = null, elseCode1 = null;
            if(((Prefix) L).isDictionaryIndex()) {
                if(R.type().swiftType().equals("Void")) {lCode = "delete " + lCode; rCode = null;}
                else if(R.type().isOptional) {ifCode1 = "(" + rCode + ") != null"; elseCode1 = "delete " + lCode;}
            }
            if(((Prefix) L).hasOptionals()) {
                ifCode0 = optionalsGuardingIf(((Prefix) L));
            }
            String lrCode = lCode + " " + alias + " " + rCode;
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
