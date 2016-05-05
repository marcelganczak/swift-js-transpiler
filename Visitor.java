public class Visitor extends TranspilerVisitor {

    @Override public String visitStatement(SwiftParser.StatementContext ctx) {
        return visitChildren(ctx) + "\n";
    }

    @Override public String visitFor_in_statement(SwiftParser.For_in_statementContext ctx) {
        return jsForIn(ctx);
    }

    //TODO needed?
    @Override public String visitDictionary_literal(SwiftParser.Dictionary_literalContext ctx) {
        return jsDictionaryLiteral(ctx);
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

    @Override public String visitPrefix_expression(SwiftParser.Prefix_expressionContext ctx) {
        return jsChain(ctx).code;
    }

    @Override public String visitType(SwiftParser.TypeContext ctx) {
        AbstractType type = Type.fromDefinition(ctx);

        String declaredEntity = getDeclaredEntityForType(ctx);
        if(declaredEntity != null) cache.cacheOne(declaredEntity, type, ctx);

        return type.jsType();
    }

    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) {
        return toJsIf(ctx);
    }

    @Override public String visitExpression_element(SwiftParser.Expression_elementContext ctx) {
        return visit(ctx.expression());
    }

    @Override public String visitImplicit_parameter(SwiftParser.Implicit_parameterContext ctx) {
        return "arguments[" + ctx.getText().substring(1) + "]";
    }

    @Override public String visitNil_coalescing(SwiftParser.Nil_coalescingContext ctx) {
        String L = visit(ctx.getChild(0));
        String R = visit(ctx.getChild(3));
        return "(" + L + " != undefined ? " + L + " : " + R + ")";
    }

    @Override public String visitTuple_pattern(SwiftParser.Tuple_patternContext ctx) {
        return "[" + visitWithoutStrings(ctx, "()") + "]";
    }
}
