import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

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
        if(isAssignment(ctx)) {
            String varName = ctx.postfix_expression().getText();
            String method = ctx.identifier().getText();
            String type = findType(varName, ctx);
            if(type.equals("Object")) return jsDictionaryMethod(varName, method, ctx);
        }
        return visitChildren(ctx);
    }

    @Override public String visitPattern_initializer(SwiftParser.Pattern_initializerContext ctx) {
        String type = toJsType(ctx.pattern().type_annotation().type());
        String identifier = ctx.pattern().identifier_pattern().getText();
        cacheType(identifier, type, ctx);

        return visitChildren(ctx);
    }
}
