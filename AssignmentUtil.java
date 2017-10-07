import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class AssignmentUtil {

    static public String augment(String code, AbstractType type, ParserRuleContext originalCtx, Visitor visitor) {

        boolean isCopied =
            type.copiedOnAssignment() &&
            !WalkerUtil.isDirectDescendant(SwiftParser.Literal_expressionContext.class, originalCtx) &&
            !code.startsWith("new ");

        if(isCopied) {
            code = visitor.targetLanguage.equals("ts") ? "_.clone(" + code + ")" : "new " + type.targetType(visitor.targetLanguage, true, false) + "(" + code + ")";
        }
        return code;
    }

    static public String handleInitializer(SwiftParser.Pattern_initializerContext ctx, Visitor visitor) {
        String varName = ctx.pattern().identifier_pattern().getText();
        EntityCache.CacheBlockAndObject cache = visitor.cache.findLoose(varName, ctx);
        AbstractType varType = cache != null ? cache.object.type : null;
        if(varType instanceof FunctionType) varName += FunctionUtil.nameAugment((FunctionType)varType);

        String transpiled =
            visitor.targetLanguage.equals("ts") ? varName + ":" + varType.targetType(visitor.targetLanguage)
            : varType.targetType(visitor.targetLanguage) + " " + varName;
        if(ctx.initializer() != null && ctx.initializer().expression() != null) {
            transpiled += " = " + augment(new Expression(ctx.initializer().expression(), varType, visitor).code, varType, ctx.initializer().expression(), visitor);
        }
        else if(visitor.targetLanguage.equals("java")) {
            transpiled += " = null";
        }
        return transpiled;
    }

    static public String handleInitializerList(SwiftParser.Pattern_initializer_listContext ctx, Visitor visitor) {
        boolean isInClass = ctx.parent != null && ctx.parent.parent != null && ctx.parent.parent.parent instanceof SwiftParser.DeclarationsContext;

        if(visitor.targetLanguage.equals("ts") && !isInClass) return visitor.visitChildren(ctx);

        List<SwiftParser.Pattern_initializerContext> declarations = ctx.pattern_initializer();
        String transpiled = "";
        for(int i = 0; i < declarations.size(); i++) {
            transpiled += handleInitializer(declarations.get(i), visitor) + (i < declarations.size() - 1 ? ";\n" : "");
        }
        return transpiled;
    }

    static public String handleConstantDeclaration(SwiftParser.Constant_declarationContext ctx, Visitor visitor) {
        return handleDeclaration("const", "let", ctx, visitor);
    }
    static public String handleVariableDeclaration(SwiftParser.Variable_declarationContext ctx, Visitor visitor) {
        return handleDeclaration("let", "var", ctx, visitor);
    }
    static private String handleDeclaration(String tsDeclarationHead, String swiftDeclarationHead, ParserRuleContext ctx, Visitor visitor) {
        boolean isInClass = ctx.parent != null && ctx.parent.parent instanceof SwiftParser.DeclarationsContext;
        return
            (visitor.targetLanguage.equals("ts") && !isInClass ? tsDeclarationHead + " " : "") +
            visitor.visitWithoutStrings(ctx, swiftDeclarationHead);
    }

    static public String handlePropertyDeclaration(SwiftParser.Property_declarationContext ctx, Visitor visitor) {
        if(ctx.property_declaration_body() instanceof SwiftParser.Computed_property_declarationContext) {
            return handleComputedPropertyDeclaration(ctx, visitor);
        }
        if(ctx.property_declaration_body() instanceof SwiftParser.Read_only_computed_property_declarationContext) {
            return handleReadOnlyComputedPropertyDeclaration(ctx, visitor);
        }
        if(ctx.property_declaration_body() instanceof SwiftParser.WillSet_didSet_property_declarationContext) {
            return handleWillSetDidSetPropertyDeclaration(ctx, visitor);
        }
        return visitor.visitChildren(ctx);
    }

    static public String setterArgumentName(SwiftParser.Setter_clauseContext ctx) {
        return ctx.setter_name() != null ? ctx.setter_name().identifier().getText() : "newValue";
    }
    static private String handleComputedPropertyDeclaration(SwiftParser.Property_declarationContext ctx, Visitor visitor) {

        SwiftParser.Getter_setter_blockContext getterSetterBlock = ((SwiftParser.Computed_property_declarationContext)ctx.property_declaration_body()).getter_setter_block();
        String setterArgument = setterArgumentName(getterSetterBlock.setter_clause());
        EntityCache.CacheBlockAndObject property = visitor.cache.findLoose(setterArgument, getterSetterBlock.setter_clause().code_block());
        String propertyType = property.object.type.targetType(visitor.targetLanguage, false, true);

        return
            visitor.visitChildren(ctx.variable_name()) + ": {\n" +
                "get: function(): " + propertyType + " " + visitor.visit(getterSetterBlock.getter_clause().code_block()) + ",\n" +
                "set: function(" +
                    setterArgument + ":" + propertyType +
                ") " + visitor.visit(getterSetterBlock.setter_clause().code_block()) + "\n" +
            "}";
    }
    static private String handleReadOnlyComputedPropertyDeclaration(SwiftParser.Property_declarationContext ctx, Visitor visitor) {

        SwiftParser.Read_only_computed_property_declarationContext declarationCtx = ((SwiftParser.Read_only_computed_property_declarationContext)ctx.property_declaration_body());
        String propertyName = visitor.visitChildren(ctx.variable_name());
        EntityCache.CacheBlockAndObject property = visitor.cache.findLoose(propertyName, ctx);
        String propertyType = property.object.type.targetType(visitor.targetLanguage, false, true);

        return
            propertyName + ": {\n" +
                "get: function(): " + propertyType + " " + visitor.visit(declarationCtx.code_block()) + ",\n" +
            "}";
    }
    static public String willSetArgumentName(SwiftParser.WillSet_clauseContext ctx) {
        return ctx != null && ctx.setter_name() != null ? ctx.setter_name().identifier().getText() : "newValue";
    }
    static public String didSetArgumentName(SwiftParser.DidSet_clauseContext ctx) {
        return ctx != null && ctx.setter_name() != null ? ctx.setter_name().identifier().getText() : "oldValue";
    }
    static private String handleWillSetDidSetPropertyDeclaration(SwiftParser.Property_declarationContext ctx, Visitor visitor) {

        SwiftParser.WillSet_didSet_property_declarationContext declarationCtx = ((SwiftParser.WillSet_didSet_property_declarationContext)ctx.property_declaration_body());
        String propertyName = visitor.visitChildren(ctx.variable_name());
        EntityCache.CacheBlockAndObject property = visitor.cache.findLoose(propertyName, ctx);
        String propertyType = property.object.type.targetType(visitor.targetLanguage, false, true);

        SwiftParser.WillSet_clauseContext willSetClause = declarationCtx.willSet_didSet_block().willSet_clause();
        SwiftParser.DidSet_clauseContext didSetClause = declarationCtx.willSet_didSet_block().didSet_clause();

        return
            propertyName + ": {\n" +
                "value: " + (declarationCtx.initializer() != null ? visitor.visit(declarationCtx.initializer().expression()) : "undefined" ) + ",\n" +
                "get: function(): " + propertyType + "{ return this." + propertyName + ".value },\n" +
                "set: function(newValue: " + propertyType + ") {\n" +
                    "function willSet(" + willSetArgumentName(willSetClause) + ": " + propertyType + ") " + visitor.visit(willSetClause.code_block()) + "\n" +
                    (didSetClause != null ? "function didSet(" + didSetArgumentName(didSetClause) + ": " + propertyType + ") " + visitor.visit(didSetClause.code_block()) + "\n" : "") +
                    (didSetClause != null ? "let oldValue: " + propertyType + " = this." + propertyName + ".value;\n" : "") +
                    "willSet(newValue);\n" +
                    "this." + propertyName + ".value = newValue;\n" +
                    (didSetClause != null ? "didSet(oldValue);\n" : "") +
                "}\n" +
            "}";
    }
}
