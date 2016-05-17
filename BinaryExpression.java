import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class BinaryExpression implements PrefixOrExpression {

    static private JSONObject definitions;
    static {
        InputStream is = BinaryExpression.class.getResourceAsStream("binary-expressions.json");
        String jsonTxt = null;
        try { jsonTxt = IOUtils.toString(is); } catch (IOException e) { }
        try { definitions = new JSONObject(jsonTxt); } catch (JSONException e) { }
    }

    AbstractType type;
    String code;
    ParserRuleContext originalCtx;
    public String code() {return code;}
    public AbstractType type() {return type;}
    public ParserRuleContext originalCtx() {return originalCtx;}
    private Object L;
    private Object R;
    private ParserRuleContext operator;

    public BinaryExpression(Object L, Object R, ParserRuleContext operator) {
        this.L = L; this.R = R; this.operator = operator;
    }

    public void compute(AbstractType type, Visitor visitor) {
        String alias = BinaryExpression.operatorAlias(operator);

        PrefixOrExpression L, R;
        if(this.L instanceof SwiftParser.Prefix_expressionContext) {
            this.L = new Prefix((SwiftParser.Prefix_expressionContext) this.L, type, visitor);
            if(type == null && isAssignment(alias)) type = ((Prefix)this.L).type();
        }
        else ((BinaryExpression)this.L).compute(type, visitor);
        if(this.R instanceof SwiftParser.Prefix_expressionContext) {
            this.R = new Prefix((SwiftParser.Prefix_expressionContext) this.R, type, visitor);
        }
        else if(this.R != null) ((BinaryExpression)this.R).compute(type, visitor);
        L = (PrefixOrExpression)this.L;
        R = (PrefixOrExpression)this.R;

        if(operator instanceof SwiftParser.Conditional_operatorContext) {
            SwiftParser.Conditional_operatorContext conditionalOperator = (SwiftParser.Conditional_operatorContext)operator;
            Expression passExpression = new Expression(conditionalOperator.expression(), R.type(), visitor);
            this.type = Type.alternative(passExpression, R);
            this.code = L.code() + " ? " + passExpression.code + " : " + R.code();
        }
        else if(operator instanceof SwiftParser.Type_casting_operatorContext) {
            AbstractType castType = Type.fromDefinition(((SwiftParser.Type_casting_operatorContext) operator).type());
            if(operator.getChild(0).getText().equals("as")) {
                this.type = castType;
                this.code = L.code();// + " as " + this.type.jsType();
            }
            else {
                this.type = new BasicType("Bool");
                this.code = L.code() + " instanceof " + this.type.jsType();
            }
        }
        else {
            String lCode = isAssignment(alias) ? ((Prefix)L).code(true) : L.code(), rCode = R.code(),
                   ifCode0 = null, ifCode1 = null, elseCode1 = null;

            if(isAssignment(alias)) {
                if(((Prefix) L).isDictionaryIndex()) {
                    if(R.type().swiftType().equals("Void")) {lCode = "delete " + lCode; rCode = "";}
                    else if(R.type().isOptional) {ifCode1 = "(" + rCode + ") != null"; elseCode1 = "delete " + lCode;}
                }
                if(((Prefix) L).hasOptionals()) {
                    ifCode0 = optionalsGuardingIf(((Prefix) L));
                }

                if(type instanceof FunctionType && R.type() != null) type = R.type();
                rCode = AssignmentUtil.augment(rCode, type, R.originalCtx(), visitor);
            }

            JSONObject definition = definitions.optJSONObject(alias).optJSONObject("compute").optJSONObject(L.type().swiftType() + "-" + R.type().swiftType());
            if(definition == null) definition = definitions.optJSONObject(alias).optJSONObject("compute").optJSONObject("default");
            String definitionCode = definition.opt("code") != null ? definition.optString("code") : "L " + alias + " R";
            String definitionType = definition.opt("type") != null ? definition.optString("type") : "L/R";

            this.code = definitionCode.replaceAll("L", lCode.replaceAll("\\$", "\\\\\\$")).replaceAll("R", rCode.replaceAll("\\$", "\\\\\\$"));
            this.type = definitionType.equals("L/R") ? Type.alternative(L, R) : new BasicType(definitionType);
            if(ifCode1 != null) this.code = "if(" + ifCode1 + ") { " + this.code + " } else { " + elseCode1 + " }";
            if(ifCode0 != null) this.code = "if(" + ifCode0 + ") { " + this.code + " }";
        }
    }

    static public int priorityForOperator(ParserRuleContext operator) {
        String operatorAlias = BinaryExpression.operatorAlias(operator);
        return definitions.optJSONObject(operatorAlias).optInt("priority");
    }
    static public String operatorAlias(ParserRuleContext operator) {
        if(operator instanceof SwiftParser.Conditional_operatorContext) return "?:";
        if(operator instanceof SwiftParser.Type_casting_operatorContext) return operator.getChild(0).getText();
        return operator.getText();
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
