public class JsType {

    public static String translate(SwiftParser.TypeContext ctx) {
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) return "Object";
        if(WalkerUtil.isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) return "Array";
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

    public static String infer(SwiftParser.ExpressionContext ctx) {
        if(WalkerUtil.isDirectDescendant(SwiftParser.Numeric_literalContext.class, ctx)) return "number";
        if(WalkerUtil.isDirectDescendant(SwiftParser.String_literalContext.class, ctx)) return "string";
        if(WalkerUtil.isDirectDescendant(SwiftParser.Boolean_literalContext.class, ctx)) return "boolean";
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_literalContext.class, ctx)) return "Object";
        if(WalkerUtil.isDirectDescendant(SwiftParser.Array_literalContext.class, ctx)) return "Array";
        return null;
    }
}
