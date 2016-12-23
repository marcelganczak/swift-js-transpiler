import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class AssignmentUtil {

    static public String augment(String code, AbstractType type, ParserRuleContext originalCtx, Visitor visitor) {
        if((type.sourceType().equals("Dictionary") || type.sourceType().equals("Array") || type.sourceType().equals("Set")) && !WalkerUtil.isDirectDescendant(SwiftParser.Literal_expressionContext.class, originalCtx) && !code.startsWith("new ")) {
            code = "_.clone(" + code + ")";
        }
        return code;
    }

    static public String handleInitializer(SwiftParser.Pattern_initializerContext ctx, Visitor visitor) {
        String varName = ctx.pattern().identifier_pattern().getText();
        AbstractType varType = visitor.cache.getType(varName, ctx);
        if(varType instanceof FunctionType) varName += FunctionUtil.nameAugment((FunctionType)varType);

        String transpiled =
            visitor.targetLanguage.equals("ts") ? varName + ":" + varType.targetType(visitor.targetLanguage)
            : varType.targetType(visitor.targetLanguage) + " " + varName;
        if(ctx.initializer() != null && ctx.initializer().expression() != null) {
            transpiled += " = " + augment(new Expression(ctx.initializer().expression(), varType, visitor).code, varType, ctx.initializer().expression(), visitor);
        }
        return transpiled;
    }

    static public String handleInitializerList(SwiftParser.Pattern_initializer_listContext ctx, Visitor visitor) {
        if(visitor.targetLanguage.equals("ts")) return visitor.visitChildren(ctx);

        List<SwiftParser.Pattern_initializerContext> declarations = ctx.pattern_initializer();
        String transpiled = "";
        for(int i = 0; i < declarations.size(); i++) {
            transpiled += handleInitializer(declarations.get(i), visitor) + (i < declarations.size() - 1 ? ";\n" : "");
        }
        return transpiled;
    }

    static public String handleConstantDeclaration(SwiftParser.Constant_declarationContext ctx, Visitor visitor) {
        return
            (visitor.targetLanguage.equals("ts") ? "const " : "") +
            visitor.visitWithoutStrings(ctx, "let");
    }

    static public String handleVariableDeclaration(SwiftParser.Variable_declarationContext ctx, Visitor visitor) {
        return
            (visitor.targetLanguage.equals("ts") ? "let " : "") +
            visitor.visitWithoutClasses(ctx, SwiftParser.Variable_declaration_headContext.class);
    }
}
