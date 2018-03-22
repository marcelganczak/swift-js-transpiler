import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class AssignmentUtil {

    static public String augment(String code, Instance type, ParserRuleContext originalCtx, Visitor visitor) {

        boolean isCopied =
            type.definition.cloneOnAssignmentReplacement != null && type.definition.cloneOnAssignmentReplacement.get(visitor.targetLanguage) &&
            !WalkerUtil.isDirectDescendant(SwiftParser.Literal_expressionContext.class, originalCtx) &&
            !code.startsWith("new ");

        if(isCopied) {
            code = visitor.targetLanguage.equals("ts") ? "_.clone(" + code + ")" : "new " + type.targetType(visitor.targetLanguage, true, false) + "(" + code + ")";
        }
        return code;
    }

    static public String handleInitializer(SwiftParser.Pattern_initializerContext ctx, Visitor visitor) {
        String varName = ctx.pattern().identifier_pattern().getText();
        Cache.CacheBlockAndObject cache = visitor.cache.find(varName, ctx);
        Instance varType = cache != null ? cache.object instanceof FunctionDefinition ? new Instance((FunctionDefinition)cache.object) : (Instance)cache.object : null;
        if(varType.definition instanceof FunctionDefinition) varName += FunctionUtil.nameAugment(((FunctionDefinition) varType.definition).parameterExternalNames, ((FunctionDefinition) varType.definition).parameterTypes);

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
        return handleDeclaration("const", SwiftParser.Constant_declaration_headContext.class, ctx, visitor);
    }
    static public String handleVariableDeclaration(SwiftParser.Variable_declarationContext ctx, Visitor visitor) {
        return handleDeclaration("let", SwiftParser.Variable_declaration_headContext.class, ctx, visitor);
    }
    static private String handleDeclaration(String tsDeclarationHead, Class headClass, ParserRuleContext ctx, Visitor visitor) {
        boolean isInClass = ctx.parent != null && ctx.parent.parent instanceof SwiftParser.DeclarationsContext;
        return
            (visitor.targetLanguage.equals("ts") && !isInClass ? tsDeclarationHead + " " : "") +
            visitor.visitWithoutClasses(ctx, headClass);
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
        String propertyName = visitor.visitChildren(ctx.variable_name()).trim();
        String setterArgument = setterArgumentName(getterSetterBlock.setter_clause());
        Cache.CacheBlockAndObject property = visitor.cache.find(setterArgument, getterSetterBlock.setter_clause().code_block());
        String propertyType = ((Instance)property.object).targetType(visitor.targetLanguage, false, true);

        return
            propertyName + "$get(): " + propertyType + " " + visitor.visit(getterSetterBlock.getter_clause().code_block()) + "\n" +
            propertyName + "$set(" +
                setterArgument + ":" + propertyType +
            ") " + visitor.visit(getterSetterBlock.setter_clause().code_block());
    }
    static private String handleReadOnlyComputedPropertyDeclaration(SwiftParser.Property_declarationContext ctx, Visitor visitor) {

        SwiftParser.Read_only_computed_property_declarationContext declarationCtx = ((SwiftParser.Read_only_computed_property_declarationContext)ctx.property_declaration_body());
        String propertyName = visitor.visitChildren(ctx.variable_name()).trim();
        Cache.CacheBlockAndObject property = visitor.cache.find(propertyName, ctx);
        String propertyType = ((Instance)property.object).targetType(visitor.targetLanguage, false, true);

        return propertyName + "$get(): " + propertyType + " " + visitor.visit(declarationCtx.code_block());
    }
    static public String willSetArgumentName(SwiftParser.WillSet_clauseContext ctx) {
        return ctx != null && ctx.setter_name() != null ? ctx.setter_name().identifier().getText() : "newValue";
    }
    static public String didSetArgumentName(SwiftParser.DidSet_clauseContext ctx) {
        return ctx != null && ctx.setter_name() != null ? ctx.setter_name().identifier().getText() : "oldValue";
    }
    static private String handleWillSetDidSetPropertyDeclaration(SwiftParser.Property_declarationContext ctx, Visitor visitor) {

        SwiftParser.WillSet_didSet_property_declarationContext declarationCtx = ((SwiftParser.WillSet_didSet_property_declarationContext)ctx.property_declaration_body());
        String propertyName = visitor.visitChildren(ctx.variable_name()).trim();
        Cache.CacheBlockAndObject property = visitor.cache.find(propertyName, ctx);
        String propertyType = ((Instance)property.object).targetType(visitor.targetLanguage, false, true);
        String internalVar = "this." + propertyName + "$val";

        SwiftParser.WillSet_clauseContext willSetClause = declarationCtx.willSet_didSet_block().willSet_clause();
        SwiftParser.DidSet_clauseContext didSetClause = declarationCtx.willSet_didSet_block().didSet_clause();

        SwiftParser.Variable_declarationContext varCtx = (SwiftParser.Variable_declarationContext)ctx.parent.parent;
        boolean isOverride = varCtx.variable_declaration_head().attributes() != null && varCtx.variable_declaration_head().attributes().getText().contains("override");
        if(isOverride) {
            ClassDefinition classDefinition = (ClassDefinition)visitor.cache.findNearestAncestorStructure(ctx).object;
            Instance superPropertyType = new Instance((ClassDefinition)classDefinition.superClass.object).getProperty(propertyName);
            if(!superPropertyType.isGetterSetter) internalVar = "this." + propertyName;
        }

        return
            (!isOverride ? propertyName + "$val: " + propertyType + " " + (declarationCtx.initializer() != null ? visitor.visit(declarationCtx.initializer()) : "" ) + "\n" : "") +
            propertyName + "$get(): " + propertyType + " { return " + internalVar + " }\n" +
            propertyName + "$set(newValue: " + propertyType + ") {\n" +
                "let willSet = (" + willSetArgumentName(willSetClause) + ": " + propertyType + ") => " + visitor.visit(willSetClause.code_block()) + "\n" +
                (didSetClause != null ? "let didSet = (" + didSetArgumentName(didSetClause) + ": " + propertyType + ") => " + visitor.visit(didSetClause.code_block()) + "\n" : "") +
                (didSetClause != null ? "let oldValue: " + propertyType + " = " + internalVar + ";\n" : "") +
                "willSet(newValue);\n" +
                internalVar + " = newValue;\n" +
                (didSetClause != null ? "didSet(oldValue);\n" : "") +
            "}";
    }
}
