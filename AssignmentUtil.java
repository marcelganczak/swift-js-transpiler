import org.antlr.v4.runtime.ParserRuleContext;

public class AssignmentUtil {

    static public String augment(String code, AbstractType type, ParserRuleContext originalCtx, Visitor visitor) {
        if(type instanceof FunctionType) code = code.trim() + FunctionUtil.nameAugment((FunctionType)type);
        else if((type.swiftType().equals("Dictionary") || type.swiftType().equals("Array") || type.swiftType().equals("Set")) && !WalkerUtil.isDirectDescendant(SwiftParser.Literal_expressionContext.class, originalCtx) && !code.startsWith("new ")) {
            code = "_.clone(" + code + ")";
        }
        return code;
    }

    static public String handleInitializer(SwiftParser.Pattern_initializerContext ctx, Visitor visitor) {
        String varName = ctx.pattern().identifier_pattern().getText();
        AbstractType varType = visitor.cache.getType(varName, ctx);
        if(varType instanceof FunctionType) varName += FunctionUtil.nameAugment((FunctionType)varType);

        String transpiled = varName + ":" + varType.jsType();
        if(ctx.initializer() != null && ctx.initializer().expression() != null) {
            transpiled += " = " + augment(new Expression(ctx.initializer().expression(), varType, visitor).code, varType, ctx.initializer().expression(), visitor);
        }
        return transpiled;
    }
}
