public class AssignmentUtil {

    static public String augment(PrefixOrExpression expression, AbstractType assignmentType, Visitor visitor) {
        String augmented = expression.code();
        AbstractType type = assignmentType == null ? expression.type() : expression.type() == null ? assignmentType : assignmentType instanceof FunctionType ? expression.type() : assignmentType;
        if(type instanceof FunctionType) augmented = augmented.trim() + FunctionUtil.nameAugment((FunctionType)type);
        else if((type.swiftType().equals("Dictionary") || type.swiftType().equals("Array") || type.swiftType().equals("Set")) && !WalkerUtil.isDirectDescendant(SwiftParser.Literal_expressionContext.class, expression.originalCtx()) && !expression.code().startsWith("new ")) {
            augmented = "_.clone(" + augmented + ")";
        }
        else if(type.swiftType().equals("Set") && !expression.code().startsWith("new ")) {
            augmented = "new Set(" + augmented + ")";
        }
        else if(type instanceof NestedByIndexType && WalkerUtil.isDirectDescendant(SwiftParser.Parenthesized_expressionContext.class, expression.originalCtx())) {
            augmented = PrefixElem.getTuple(((SwiftParser.ExpressionContext)expression.originalCtx()).prefix_expression().postfix_expression().primary_expression(), visitor, type).code;
        }
        return augmented;
    }

    static public String handleInitializer(SwiftParser.Pattern_initializerContext ctx, Visitor visitor) {
        String varName = ctx.pattern().identifier_pattern().getText();
        AbstractType varType = visitor.cache.getType(varName, ctx);
        if(varType instanceof FunctionType) varName += FunctionUtil.nameAugment((FunctionType)varType);

        String transpiled = varName + ":" + varType.jsType();
        if(ctx.initializer() != null && ctx.initializer().expression() != null) {
            transpiled += " = " + augment(new Expression(ctx.initializer().expression(), visitor), varType, visitor);
        }
        return transpiled;
    }
}
