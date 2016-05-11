public class Visitor extends TranspilerVisitor {

    @Override public String visitStatement(SwiftParser.StatementContext ctx) {
        return visitChildren(ctx) + "\n";
    }

    @Override public String visitFor_in_statement(SwiftParser.For_in_statementContext ctx) {
        return jsForIn(ctx);
    }

    @Override public String visitWhile_statement(SwiftParser.While_statementContext ctx) {
        return jsWhile(ctx);
    }

    @Override public String visitRepeat_while_statement(SwiftParser.Repeat_while_statementContext ctx) {
        return jsRepeatWhile(ctx);
    }

    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) {
        return toJsIf(ctx);
    }

    @Override public String visitGuard_statement(SwiftParser.Guard_statementContext ctx) {
        return toJsGuard(ctx);
    }

    @Override public String visitFunction_declaration(SwiftParser.Function_declarationContext ctx) {
        return jsFunctionDeclaration(ctx);
    }

    @Override public String visitClosure_expression(SwiftParser.Closure_expressionContext ctx) {
        return jsClosureExpression(ctx);
    }

    @Override public String visitFunction_result(SwiftParser.Function_resultContext ctx) {
        return jsFunctionResult(ctx);
    }

    @Override public String visitExternal_parameter_name(SwiftParser.External_parameter_nameContext ctx) {
        return "";
    }

    @Override public String visitExpression(SwiftParser.ExpressionContext ctx) {
        return new Expression(ctx, this).code;
    }

    @Override public String visitType(SwiftParser.TypeContext ctx) {
        return jsType(ctx);
    }

    @Override public String visitExpression_element(SwiftParser.Expression_elementContext ctx) {
        return visit(ctx.expression());
    }

    @Override public String visitImplicit_parameter(SwiftParser.Implicit_parameterContext ctx) {
        return "arguments[" + ctx.getText().substring(1) + "]";
    }
}
