import org.antlr.v4.runtime.ParserRuleContext;

public class TranspilerVisitor extends NativeOverriddenVisitor {

    protected EntityCache cache = new EntityCache();

    public String getDeclaredEntityForType(SwiftParser.TypeContext ctx) {
        SwiftParser.Pattern_initializerContext initializer = ctx.getParent().getParent().getParent() instanceof SwiftParser.Pattern_initializerContext ? (SwiftParser.Pattern_initializerContext) ctx.getParent().getParent().getParent() : null;
        if(initializer != null) {
            SwiftParser.IdentifierContext identifier = initializer.pattern().identifier_pattern().identifier();
            if(identifier != null) return identifier.getText();
        }
        return null;
    }

    public String getDeclaredEntityForChain(ParserRuleContext/*expression or prefix_expression*/ ctx) {
        ParserRuleContext baseParent = ctx instanceof SwiftParser.ExpressionContext ? ctx : ctx.getParent();
        ParserRuleContext patternInitializer = baseParent.getParent().getParent();
        if(patternInitializer instanceof SwiftParser.Pattern_initializerContext) {
            SwiftParser.IdentifierContext identifier = ((SwiftParser.Pattern_initializerContext) patternInitializer).pattern().identifier_pattern().identifier();
            if(identifier != null) return identifier.getText();
        }
        if(patternInitializer instanceof SwiftParser.ExpressionContext && baseParent.getChild(0).getText().equals("=")) {
            SwiftParser.Postfix_expressionContext postfix = ((SwiftParser.ExpressionContext) patternInitializer).prefix_expression().postfix_expression();
            if(postfix.primary_expression() != null) return postfix.primary_expression().getText();
        }
        return null;
    }

    public String jsType(SwiftParser.TypeContext ctx) {
        AbstractType type = Type.fromDefinition(ctx);

        String declaredEntity = getDeclaredEntityForType(ctx);
        if(declaredEntity != null) cache.cacheOne(declaredEntity, type, ctx);

        return type.jsType();
    }
}
