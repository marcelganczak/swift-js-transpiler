import java.util.ArrayList;
import java.util.List;

public class TranspilerVisitor extends UtilVisitor {

    protected String toJsType(SwiftParser.TypeContext ctx) {
        if(isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) return "Object";
        if(isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) return "Array";
        String text = ctx.getText();
        if(text.equals("String")) {
            return "string";
        }
        else if(text.equals("Int") || text.equals("Float") || text.equals("Double")) {
            return "number";
        }
        else if(text.equals("Bool")) {
            return "boolean";
        }
        return text;
    }

    protected String inferJsType(SwiftParser.ExpressionContext ctx) {
        if(isDirectDescendant(SwiftParser.Numeric_literalContext.class, ctx)) return "number";
        if(isDirectDescendant(SwiftParser.String_literalContext.class, ctx)) return "string";
        if(isDirectDescendant(SwiftParser.Boolean_literalContext.class, ctx)) return "boolean";
        if(isDirectDescendant(SwiftParser.Dictionary_literalContext.class, ctx)) return "Object";
        if(isDirectDescendant(SwiftParser.Array_literalContext.class, ctx)) return "Array";
        return null;
    }

    public String jsForIn(SwiftParser.For_in_statementContext ctx) {
        return "_.each(" + visit(ctx.expression()) + ", " + visit(ctx.pattern()) + " => " + visit(ctx.code_block()) + ")";
    }

    public String jsDictionaryLiteral(SwiftParser.Dictionary_literalContext ctx) {
        if(isDirectDescendant(SwiftParser.Empty_dictionary_literalContext.class, ctx)) return "{}";
        ArrayList<Integer> withoutNodes = new ArrayList<Integer>(); withoutNodes.add(0); withoutNodes.add(ctx.getChildCount() - 1);
        return '{' + visitChildren(ctx, withoutNodes) + '}';
    }

    public String jsFunctionResult(SwiftParser.Function_resultContext ctx) {
        return ":" + visit(ctx.type());
    }

    public boolean isSwiftishDictionaryConstructor(SwiftParser.Function_call_expressionContext ctx) {
        return isDirectDescendant(SwiftParser.Dictionary_literalContext.class, ctx.postfix_expression());
    }

    public String jsMemberAccess(SwiftParser.Explicit_member_expression2Context ctx, boolean isOptional) {
        String varName = ctx.postfix_expression().getText();
        String method = ctx.identifier().getText();
        String type = findType(varName, ctx);
        if(type != null && type.equals("Object")) return jsDictionaryMethod(varName, method, ctx);

        ArrayList<Integer> withoutNodes = new ArrayList<Integer>();
        if(isOptional) withoutNodes.add(1);
        return visitChildren(ctx, withoutNodes);
    }

    public String jsDictionaryMethod(String varName, String method, SwiftParser.Explicit_member_expression2Context ctx) {
        if(method.equals("count")) {
            return "_.count(" + varName + ")";
        }
        return visitChildren(ctx);
    }

    public void cacheTypes(List<SwiftParser.Pattern_initializerContext> initializers) {
        int numInitializers = initializers.size();
        if(numInitializers == 0) return;

        String type;
        SwiftParser.Pattern_initializerContext lastInitializer = initializers.get(numInitializers - 1);
        if(lastInitializer.pattern().type_annotation() == null) {
            type = inferJsType(lastInitializer.initializer().expression());
            if(type == null) return;
        }
        else {
            type = toJsType(lastInitializer.pattern().type_annotation().type());
        }

        for(int i = 0; i < numInitializers; i++) {
            String identifier = initializers.get(i).pattern().identifier_pattern().getText();
            System.out.println("Caching " + identifier + " as " + type);
            cacheType(identifier, type, initializers.get(i));
        }
    }
};
