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

    @Override public String visitFunction_result(SwiftParser.Function_resultContext ctx) {
        return jsFunctionResult(ctx);
    }

    @Override public String visitFunction_call_expression(SwiftParser.Function_call_expressionContext ctx) {
        if(isSwiftishDictionaryConstructor(ctx)) return "{}";
        return visitChildren(ctx);
    }

    @Override public String visitType(SwiftParser.TypeContext ctx) {
        return toJsType(ctx) + " ";
    }

    @Override public String visitExplicit_member_expression2(SwiftParser.Explicit_member_expression2Context ctx) {
        boolean isOptional = ctx.getChild(1).getText().equals("?");
        String memberAccess = jsMemberAccess(ctx, isOptional);
        if(!isOptional) return memberAccess;
        String L = visit(ctx.getChild(0));
        return "(" + L + " != undefined ? " + memberAccess + " : undefined)";
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
