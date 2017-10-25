import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

class IfLet {
    public ArrayList<String> varNames = new ArrayList<String>();
    public ArrayList<String> varVals = new ArrayList<String>();
    public ArrayList<Instance> varTypes = new ArrayList<Instance>();
    public IfLet(ParserRuleContext ctx, Visitor visitor) {
        SwiftParser.Condition_clauseContext conditionClause = ctx instanceof SwiftParser.If_statementContext ? ((SwiftParser.If_statementContext)ctx).condition_clause() : ((SwiftParser.Guard_statementContext)ctx).condition_clause();
        if(!(WalkerUtil.isDirectDescendant(SwiftParser.Optional_binding_conditionContext.class, conditionClause))) return;

        ArrayList<SwiftParser.Optional_binding_headContext> ifLets = new ArrayList<SwiftParser.Optional_binding_headContext>();
        ifLets.add(conditionClause.condition_list().condition(0).optional_binding_condition().optional_binding_head());
        if(conditionClause.condition_list().condition(0).optional_binding_condition().optional_binding_continuation_list() != null) {
            List<SwiftParser.Optional_binding_headContext> moreIfLets = conditionClause.condition_list().condition(0).optional_binding_condition().optional_binding_continuation_list().optional_binding_head();
            for(int i = 0; i < moreIfLets.size(); i++) ifLets.add(moreIfLets.get(i));
        }
        for(int i = 0; i < ifLets.size(); i++) {
            String varName = visitor.visitWithoutTerminals(ifLets.get(i).pattern()).trim();
            Expression varVal = new Expression((ifLets.get(i).initializer()).expression(), null, visitor);
            varNames.add(varName);
            varVals.add(varVal.code);
            varTypes.add(varVal.type);
        }
    }
}
public class ControlFlow {

    static public String forIn(SwiftParser.For_in_statementContext ctx, Visitor visitor) {
        SwiftParser.ExpressionContext expression = ctx.expression();

        if(expression != null && expression.binary_expressions() != null) {
            SwiftParser.Binary_expressionContext binary = expression.binary_expressions().binary_expression(0);
            String from = visitor.visit(expression.prefix_expression()),
                   to = new Expression(expression, null, true, visitor).code,
                   varName = ctx.pattern().getText().equals("_") ? "$" : ctx.pattern().getText(),
                   operator = BinaryExpression.operatorAlias(binary.binary_operator());
            return "for(" + (visitor.targetLanguage.equals("ts") ? "let" : "int") + " " + varName + " = " + from + "; " + varName + " " + (operator.equals("...") ? "<=" : "<") + " " + to + "; " + varName + "++) " + visitor.visit(ctx.code_block());
        }

        Expression iteratedObject = new Expression(expression, null, visitor);
        Instance iteratedType = iteratedObject.type;
        String indexVar = null, valueVar;
        if(ctx.pattern().tuple_pattern() != null) {
            indexVar = ctx.pattern().tuple_pattern().tuple_pattern_element_list().tuple_pattern_element(0).getText();
            valueVar = ctx.pattern().tuple_pattern().tuple_pattern_element_list().tuple_pattern_element(1).getText();
        }
        else {
            valueVar = ctx.pattern().identifier_pattern().getText();
        }

        String iterator;
        if(visitor.targetLanguage.equals("ts")) {
            if(iteratedType.typeName().equals("Array") || iteratedType.typeName().equals("Set") || iteratedType.typeName().equals("String")) {
                if(indexVar == null) indexVar = "$";
                iterator = "for(let " + indexVar + " = 0; " + indexVar + " < (" + iteratedObject.code + ").length; " + indexVar + "++) { let " + valueVar + " = (" + iteratedObject.code + ")[" + indexVar + "];";
            }
            else {
                if(indexVar == null) iterator = "for(let " + valueVar + " of " + iteratedObject.code + ") {";
                else iterator = "for(let " + indexVar + " in " + iteratedObject.code + ") { let " + valueVar + " = (" + iteratedObject.code + ")[" + indexVar + "];";
            }
        }
        else {
            if(iteratedType.typeName().equals("Array") || iteratedType.typeName().equals("Set") || iteratedType.typeName().equals("String")) {
                if(indexVar == null) indexVar = "$";
                String targetType = iteratedType.typeName().equals("String") ? new Instance("String", ctx, visitor.cache).targetType("java") : iteratedType.generics.get("Value").targetType("java");
                iterator = "for(int " + indexVar + " = 0; " + indexVar + " < (" + iteratedObject.code + ").size(); " + indexVar + "++) { " + targetType + " " + valueVar + " = (" + iteratedObject.code + ").get(" + indexVar + ");";
            }
            else {
                String[] iteratedTypeChunks = iteratedType.targetType("java").split("<");
                iterator = "for(" + iteratedTypeChunks[0] + ".Entry<" + iteratedTypeChunks[1] + " $ : (" + iteratedObject.code + ").entrySet()) {";
                if(indexVar != null) iterator += iteratedType.generics.get("Key").targetType("java") + " " + indexVar + " = $.getKey();";
                iterator += iteratedType.generics.get("Value").targetType("java") + " " + valueVar + " = $.getValue();";
            }
        }

        return iterator + visitor.visitWithoutStrings(ctx.code_block(), "{");
    }

    static public String whileRepeat(SwiftParser.While_statementContext ctx, Visitor visitor) {
        return "while(" + visitor.visit(ctx.condition_clause()) + ") " + visitor.visit(ctx.code_block());
    }

    static public String repeatWhile(SwiftParser.Repeat_while_statementContext ctx, Visitor visitor) {
        return "do " + visitor.visit(ctx.code_block()) + "while(" + visitor.visit(ctx.expression()) + ")";
    }

    static private String ifOrGuard(ParserRuleContext ctx, Visitor visitor) {
        String condition = "", beforeBlock = "";
        IfLet ifLet = new IfLet(ctx, visitor);
        if(ifLet.varNames.size() > 0) {
            for(int i = 0; i < ifLet.varNames.size(); i++) {
                condition +=
                        (condition.length() > 0 ? " && " : "") +
                        (visitor.targetLanguage.equals("ts") ? "(_.$ifLet" + i + " = " + ifLet.varVals.get(i) + ")" : ifLet.varVals.get(i)) +
                        " != null";
                beforeBlock +=
                    visitor.targetLanguage.equals("ts") ? (beforeBlock.length() > 0 ? ", " : "") + ifLet.varNames.get(i) + ":" + ifLet.varTypes.get(i).targetType(visitor.targetLanguage) + " = _.$ifLet" + i
                    : ifLet.varTypes.get(i).targetType(visitor.targetLanguage) + " " + ifLet.varNames.get(i) + " = " + ifLet.varVals.get(i) + ";";
            }
            if(visitor.targetLanguage.equals("ts")) beforeBlock = "const " + beforeBlock + ";";
        }
        else {
            condition = visitor.visitWithoutStrings(ctx instanceof SwiftParser.If_statementContext ? ((SwiftParser.If_statementContext)ctx).condition_clause() : ((SwiftParser.Guard_statementContext)ctx).condition_clause(), "()");
        }
        if(ctx instanceof SwiftParser.Guard_statementContext) condition = "!(" + condition + ")";
        return "if(" + condition + ") {" + beforeBlock + visitor.visitWithoutStrings(ctx instanceof SwiftParser.If_statementContext ? ((SwiftParser.If_statementContext)ctx).code_block() : ((SwiftParser.Guard_statementContext)ctx).code_block(), "{") + (ctx instanceof SwiftParser.If_statementContext ? visitor.visitChildren(((SwiftParser.If_statementContext)ctx).else_clause()) : "");
    }

    static public String ifThen(SwiftParser.If_statementContext ctx, Visitor visitor) {
        return ifOrGuard(ctx, visitor);
    }
    static public String guard(SwiftParser.Guard_statementContext ctx, Visitor visitor) {
        return ifOrGuard(ctx, visitor);
    }
}
