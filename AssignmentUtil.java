public class AssignmentUtil {

    static public String augment(PrefixOrExpression expression) {
        String augmented = expression.code();
        if(expression.type() instanceof FunctionType) augmented = augmented.trim() + FunctionUtil.nameAugment((FunctionType)expression.type());
        else if((expression.type().swiftType().equals("Dictionary") || expression.type().swiftType().equals("Array") || expression.type().swiftType().equals("Set")) && !WalkerUtil.isDirectDescendant(SwiftParser.Literal_expressionContext.class, expression.originalCtx())) {
            augmented = "_.clone(" + augmented + ")";
        }
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
