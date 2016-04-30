public class Visitor extends TranspilerVisitor {

    @Override public String visitStatement(SwiftParser.StatementContext ctx) {
        return visitChildren(ctx) + "\n";
    }

    @Override public String visitFor_in_statement(SwiftParser.For_in_statementContext ctx) {
        return jsForIn(ctx);
    }

    @Override public String visitDictionary_literal(SwiftParser.Dictionary_literalContext ctx) {
        return jsDictionaryLiteral(ctx);
    }

    @Override public String visitFunction_result(SwiftParser.Function_resultContext ctx) {
        return jsFunctionResult(ctx);
    }

    @Override public String visitPrefix_expression(SwiftParser.Prefix_expressionContext ctx) {
        //TODO if(isSwiftishDictionaryConstructor(ctx)) return "{}";
        String L = visit(ctx.getChild(0));
        return jsChain(ctx, 1, L, findType(L, ctx));
    }

    @Override public String visitType(SwiftParser.TypeContext ctx) {
        return toJsType(ctx) + " ";
    }

    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) {
        String condition = visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        if(isDirectDescendant(SwiftParser.Optional_binding_conditionContext.class, ctx.condition_clause())) {
            SwiftParser.Optional_binding_headContext ifLet = ctx.condition_clause().condition_list().condition(0).optional_binding_condition().optional_binding_head();
            String constVar = visitWithoutTerminals(ifLet.pattern());
            String var = visitWithoutTerminals(ifLet.initializer().expression());
            condition = var + " != null";
            beforeBlock = "const " + constVar + " = " + var + ";";
        }
        return "if(" + condition + ") {" + beforeBlock + visitWithoutStrings(ctx.code_block(), "{") + visitChildren(ctx.else_clause());
    }

    @Override public String visitNil_coalescing(SwiftParser.Nil_coalescingContext ctx) {
        String L = visit(ctx.getChild(0));
        String R = visit(ctx.getChild(3));
        return "(" + L + " != undefined ? " + L + " : " + R + ")";
    }

    @Override public String visitPattern_initializer_list(SwiftParser.Pattern_initializer_listContext ctx) {
        cacheTypes(ctx.pattern_initializer());
        return visitChildren(ctx);
    }
}
