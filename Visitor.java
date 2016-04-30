import java.util.ArrayList;

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
        ArrayList<SwiftParser.Chain_postfix_expressionContext> oneLevelChain = new ArrayList<SwiftParser.Chain_postfix_expressionContext>();
        SwiftParser.Postfix_expressionContext postfix = ctx.postfix_expression();
        while(postfix.postfix_expression() != null) {
            if(postfix.chain_postfix_expression() != null) oneLevelChain.add(0, postfix.chain_postfix_expression());
            postfix = postfix.postfix_expression();
        }
        String L = visit(postfix.primary_expression());
        return jsChain(oneLevelChain, 0, L, findType(L, ctx));
    }

    @Override public String visitType(SwiftParser.TypeContext ctx) {
        return toJsType(ctx) + " ";
    }

    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) {
        return toJsIf(ctx);
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
