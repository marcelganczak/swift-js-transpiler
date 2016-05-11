public class AssignmentUtil {

    static public String augment(Expression expression) {
        String augmented = expression.code;
        if(expression.type instanceof FunctionType) augmented = augmented.trim() + FunctionUtil.nameAugment((FunctionType)expression.type);
        return augmented;
    }

    static public String handleInitializer(SwiftParser.Pattern_initializerContext ctx, Visitor visitor) {
        String varName = ctx.pattern().identifier_pattern().getText();
        AbstractType varType = visitor.cache.getType(varName, ctx);
        if(varType instanceof FunctionType) varName += FunctionUtil.nameAugment((FunctionType)varType);

        String transpiled = varName + ":" + varType.jsType();
        if(ctx.initializer() != null && ctx.initializer().expression() != null) {
            transpiled += " = " + augment(new Expression(ctx.initializer().expression(), visitor));
        }
        return transpiled;
    }
}
