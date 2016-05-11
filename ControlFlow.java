import org.antlr.v4.runtime.ParserRuleContext;

class IfLet {
    public String varName;
    public String varVal;
    public IfLet(ParserRuleContext ctx, TranspilerVisitor visitor) {
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

    static public String forIn(SwiftParser.For_in_statementContext ctx, TranspilerVisitor visitor) {
        SwiftParser.ExpressionContext expression = ctx.expression();
        if(expression != null && expression.binary_expressions() != null) {
            SwiftParser.Binary_expressionContext binary = expression.binary_expressions().binary_expression(0);
            String from = visitor.visit(expression.prefix_expression()),
                    to = visitor.visit(binary.prefix_expression()),
                    varName = ctx.pattern().getText().equals("_") ? "$" : ctx.pattern().getText(),
                    operator = BinaryExpression.operatorAlias(binary.binary_operator());
            return "for(let " + varName + " = " + from + "; " + varName + " " + (operator.equals("...") ? "<=" : "<") + " " + to + "; " + varName + "++) " + visitor.visit(ctx.code_block());
        }
        return "_.each(" + visitor.visit(ctx.expression()) + ", " + visitor.visit(ctx.pattern()) + " => " + visitor.visit(ctx.code_block()) + ")";
    }

    static public String whileRepeat(SwiftParser.While_statementContext ctx, TranspilerVisitor visitor) {
        return "while(" + visitor.visit(ctx.condition_clause()) + ") " + visitor.visit(ctx.code_block());
    }

    static public String repeatWhile(SwiftParser.Repeat_while_statementContext ctx, TranspilerVisitor visitor) {
        return "do " + visitor.visit(ctx.code_block()) + "while(" + visitor.visit(ctx.expression()) + ")";
    }

    static public String ifThen(SwiftParser.If_statementContext ctx, TranspilerVisitor visitor) {
        String condition = visitor.visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        IfLet ifLet = new IfLet(ctx, visitor);
        if(ifLet.varName != null) {
            condition = ifLet.varVal + " != null";
            beforeBlock = "const " + ifLet.varName + " = " + ifLet.varVal + ";";
        }
        return "if(" + condition + ") {" + beforeBlock + visitor.visitWithoutStrings(ctx.code_block(), "{") + visitor.visitChildren(ctx.else_clause());
    }
    static public String guard(SwiftParser.Guard_statementContext ctx, TranspilerVisitor visitor) {
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
