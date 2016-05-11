public class TranspilerVisitor extends Visitor {

    public TranspilerVisitor(EntityCache cache) {
        super();
        this.cache = cache;
    }

    @Override public String visitFor_in_statement(SwiftParser.For_in_statementContext ctx) {
        return ControlFlow.forIn(ctx, this);
    }

    @Override public String visitWhile_statement(SwiftParser.While_statementContext ctx) {
        return ControlFlow.whileRepeat(ctx, this);
    }

    @Override public String visitRepeat_while_statement(SwiftParser.Repeat_while_statementContext ctx) {
        return ControlFlow.repeatWhile(ctx, this);
    }

    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) {
        return ControlFlow.ifThen(ctx, this);
    }

    @Override public String visitGuard_statement(SwiftParser.Guard_statementContext ctx) {
        return ControlFlow.guard(ctx, this);
    }

    @Override public String visitFunction_declaration(SwiftParser.Function_declarationContext ctx) {
        return FunctionUtil.functionDeclaration(ctx, this);
    }

    @Override public String visitClosure_expression(SwiftParser.Closure_expressionContext ctx) {
        return FunctionUtil.closureExpression(ctx, this);
    }

    @Override public String visitType(SwiftParser.TypeContext ctx) {
        return Type.fromDefinition(ctx).jsType();
    }

    @Override public String visitExpression(SwiftParser.ExpressionContext ctx) {
        return new Expression(ctx, this).code;
    }

    @Override public String visitPattern_initializer(SwiftParser.Pattern_initializerContext ctx) {
        return AssignmentUtil.handleInitializer(ctx, this);
    }

    @Override public String visitExpression_element(SwiftParser.Expression_elementContext ctx) {
        return visit(ctx.expression());
    }

    @Override public String visitStatement(SwiftParser.StatementContext ctx) {
        return visitChildren(ctx) + "\n";
    }

    @Override public String visitExternal_parameter_name(SwiftParser.External_parameter_nameContext ctx) {
        return "";
    }

    @Override public String visitImplicit_parameter(SwiftParser.Implicit_parameterContext ctx) {
        return "arguments[" + ctx.getText().substring(1) + "]";
    }
}
