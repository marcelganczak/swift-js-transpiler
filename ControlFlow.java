import org.antlr.v4.runtime.ParserRuleContext;

class IfLet {
    public String varName;
    public String varVal;
    public IfLet(ParserRuleContext ctx, Visitor visitor) {
        SwiftParser.Condition_clauseContext conditionClause = ctx instanceof SwiftParser.If_statementContext ? ((SwiftParser.If_statementContext)ctx).condition_clause() : ((SwiftParser.Guard_statementContext)ctx).condition_clause();
        if(!(WalkerUtil.isDirectDescendant(SwiftParser.Optional_binding_conditionContext.class, conditionClause))) return;
        SwiftParser.Optional_binding_headContext ifLet = conditionClause.condition_list().condition(0).optional_binding_condition().optional_binding_head();
        varName = visitor.visitWithoutTerminals(ifLet.pattern()).trim();
        Expression varVal = new Expression(ifLet.initializer().expression(), visitor);
        SwiftParser.Code_blockContext block = ctx instanceof SwiftParser.If_statementContext ? ((SwiftParser.If_statementContext)ctx).code_block() : ((SwiftParser.Guard_statementContext)ctx).code_block();
        visitor.cache.cacheOne(varName, varVal.type, block);
        this.varVal = varVal.code;
    }
}

public class ControlFlow {

    static public String forIn(SwiftParser.For_in_statementContext ctx, Visitor visitor) {
        SwiftParser.ExpressionContext expression = ctx.expression();

        if(expression != null && expression.binary_expressions() != null) {
            SwiftParser.Binary_expressionContext binary = expression.binary_expressions().binary_expression(0);
            String from = visitor.visit(expression.prefix_expression()),
                    to = visitor.visit(binary.prefix_expression()),
                    varName = ctx.pattern().getText().equals("_") ? "$" : ctx.pattern().getText(),
                    operator = BinaryExpression.operatorAlias(binary.binary_operator());
            visitor.cache.cacheOne(varName, new BasicType("Int"), ctx.code_block());
            return "for(let " + varName + " = " + from + "; " + varName + " " + (operator.equals("...") ? "<=" : "<") + " " + to + "; " + varName + "++) " + visitor.visit(ctx.code_block());
        }

        Expression iteratedObject = new Expression(expression, visitor);
        NestedType iteratedType = (NestedType)iteratedObject.type;
        String indexVar = null, valueVar = null;
        if(ctx.pattern().tuple_pattern() != null) {
            indexVar = ctx.pattern().tuple_pattern().tuple_pattern_element_list().tuple_pattern_element(0).getText();
            valueVar = ctx.pattern().tuple_pattern().tuple_pattern_element_list().tuple_pattern_element(1).getText();
        }
        else {
            valueVar = ctx.pattern().identifier_pattern().getText();
        }
        String iterator;
        if(iteratedType.swiftType().equals("Array")) {
            if(indexVar == null) indexVar = "$";
            iterator = "for(let " + indexVar + " = 0; " + indexVar + " < (" + iteratedObject.code + ").length; " + indexVar + "++) { let " + valueVar + " = (" + iteratedObject.code + ")[" + indexVar + "];";
        }
        else {
            if(indexVar == null) iterator = "for(let " + valueVar + " of " + iteratedObject.code + ") {";
            else iterator = "for(let " + indexVar + " in " + iteratedObject.code + ") { let " + valueVar + " = (" + iteratedObject.code + ")[" + indexVar + "];";
        }
        if(indexVar != null) visitor.cache.cacheOne(indexVar, iteratedType.keyType, ctx.code_block());
        visitor.cache.cacheOne(valueVar, iteratedType.valueType, ctx.code_block());

        return iterator + visitor.visitWithoutStrings(ctx.code_block(), "{");
    }

    static public String whileRepeat(SwiftParser.While_statementContext ctx, Visitor visitor) {
        return "while(" + visitor.visit(ctx.condition_clause()) + ") " + visitor.visit(ctx.code_block());
    }

    static public String repeatWhile(SwiftParser.Repeat_while_statementContext ctx, Visitor visitor) {
        return "do " + visitor.visit(ctx.code_block()) + "while(" + visitor.visit(ctx.expression()) + ")";
    }

    static public String ifThen(SwiftParser.If_statementContext ctx, Visitor visitor) {
        String condition = visitor.visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        IfLet ifLet = new IfLet(ctx, visitor);
        if(ifLet.varName != null) {
            condition = ifLet.varVal + " != null";
            beforeBlock = "const " + ifLet.varName + " = " + ifLet.varVal + ";";
        }
        return "if(" + condition + ") {" + beforeBlock + visitor.visitWithoutStrings(ctx.code_block(), "{") + visitor.visitChildren(ctx.else_clause());
    }
    static public String guard(SwiftParser.Guard_statementContext ctx, Visitor visitor) {
        String condition = visitor.visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        IfLet ifLet = new IfLet(ctx, visitor);
        if(ifLet.varName != null) {
            condition = ifLet.varVal + " != null";
            beforeBlock = "const " + ifLet.varName + " = " + ifLet.varVal + ";";
        }
        return "if(!(" + condition + ")) {" + beforeBlock + visitor.visitWithoutStrings(ctx.code_block(), "{");
    }
}
