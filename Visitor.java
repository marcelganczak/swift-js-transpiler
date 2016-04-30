import org.antlr.v4.runtime.ParserRuleContext;

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

    @Override public String visitFunction_declaration(SwiftParser.Function_declarationContext ctx) {
        return jsFunctionDeclaration(ctx);
    }

    @Override public String visitFunction_result(SwiftParser.Function_resultContext ctx) {
        return jsFunctionResult(ctx);
    }

    @Override public String visitPrefix_expression(SwiftParser.Prefix_expressionContext ctx) {
        //TODO if(isSwiftishDictionaryConstructor(ctx)) return "{}";
        ArrayList<ParserRuleContext> flattenedChain = flattenChain(ctx);
        return jsChain(flattenedChain, 0, "", null);
    }

    @Override public String visitType(SwiftParser.TypeContext ctx) {
        return JsType.translate(ctx) + " ";
    }

    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) {
        return toJsIf(ctx);
    }

    @Override public String visitExpression_element(SwiftParser.Expression_elementContext ctx) {
        return visit(ctx.expression());
    }

    @Override public String visitNil_coalescing(SwiftParser.Nil_coalescingContext ctx) {
        String L = visit(ctx.getChild(0));
        String R = visit(ctx.getChild(3));
        return "(" + L + " != undefined ? " + L + " : " + R + ")";
    }

    @Override public String visitPattern_initializer_list(SwiftParser.Pattern_initializer_listContext ctx) {
        cache.cacheInitializers(ctx.pattern_initializer());
        return visitChildren(ctx);
    }
}
