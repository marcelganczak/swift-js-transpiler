public class TranspilerVisitor extends Visitor {

    public TranspilerVisitor(Cache cache, String targetLanguage) {
        super();
        this.cache = cache;
        this.targetLanguage = targetLanguage;
    }

    @Override public String visitFor_in_statement(SwiftParser.For_in_statementContext ctx) {
        return ControlFlow.forIn(ctx, this);
    }

    @Override public String visitWhile_statement(SwiftParser.While_statementContext ctx) {
        return ControlFlow.whileRepeat(ctx, this);
    }

    @Override public String visitRepeat_while_statement(SwiftParser.Repeat_while_statementContext ctx) {
        return ControlFlow.repeatWhile(ctx, this);
    }

    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) {
        return ControlFlow.ifThen(ctx, this);
    }

    @Override public String visitGuard_statement(SwiftParser.Guard_statementContext ctx) {
        return ControlFlow.guard(ctx, this);
    }

    @Override public String visitFunction_declaration(SwiftParser.Function_declarationContext ctx) {
        return FunctionUtil.functionDeclaration(ctx, this);
    }
    @Override public String visitInitializer_declaration(SwiftParser.Initializer_declarationContext ctx) {
        return FunctionUtil.functionDeclaration(ctx, this);
    }

    @Override public String visitType(SwiftParser.TypeContext ctx) {
        return TypeUtil.fromDefinition(ctx, this).targetType(targetLanguage);
    }

    @Override public String visitExpression(SwiftParser.ExpressionContext ctx) {
        return new Expression(ctx, null, this).code;
    }

    @Override public String visitConstant_declaration(SwiftParser.Constant_declarationContext ctx) {
        return AssignmentUtil.handleConstantDeclaration(ctx, this);
    }

    @Override public String visitVariable_declaration(SwiftParser.Variable_declarationContext ctx) {
        return AssignmentUtil.handleVariableDeclaration(ctx, this);
    }

    @Override public String visitPattern_initializer_list(SwiftParser.Pattern_initializer_listContext ctx) {
        return AssignmentUtil.handleInitializerList(ctx, this);
    }

    @Override public String visitPattern_initializer(SwiftParser.Pattern_initializerContext ctx) {
        return AssignmentUtil.handleInitializer(ctx, this);
    }

    @Override public String visitProperty_declaration(SwiftParser.Property_declarationContext ctx) {
        return AssignmentUtil.handlePropertyDeclaration(ctx, this);
    }

    @Override public String visitDeclaration(SwiftParser.DeclarationContext ctx) {
        boolean shouldBeNewLine = ctx.parent instanceof SwiftParser.DeclarationsContext;
        boolean shouldHaveSemicolon = shouldBeNewLine && !(ctx.getChild(0) instanceof SwiftParser.Function_declarationContext);
        return visitChildren(ctx) + (shouldBeNewLine ? (shouldHaveSemicolon ? ";" : "") + "\n" : "");
    }

    @Override public String visitExpression_element(SwiftParser.Expression_elementContext ctx) {
        return visit(ctx.expression());
    }

    @Override public String visitStatement(SwiftParser.StatementContext ctx) {
        boolean shouldHaveSemicolon = !(ctx.parent.parent instanceof SwiftParser.Explicit_closure_expressionContext) && !WalkerUtil.isRightMostDescendant(SwiftParser.Code_blockContext.class, ctx);
        return visitChildren(ctx) + (shouldHaveSemicolon && ctx.semicolon() == null ? ";" : "") + "\n";
    }

    @Override public String visitStruct_keyword(SwiftParser.Struct_keywordContext ctx) {
        //just treat struct as class for now; we could swap it for an interface, but it's less work that way for now
        return "class ";
    }

    @Override public String visitParameter(SwiftParser.ParameterContext ctx) {
        if(ctx.range_operator() == null) return visitChildren(ctx);
        return visit(ctx.range_operator()) + visitWithoutClasses(ctx, SwiftParser.Range_operatorContext.class);
    }

    @Override public String visitDictionary_literal_item(SwiftParser.Dictionary_literal_itemContext ctx) {
        boolean keyIsLiteral = WalkerUtil.isDirectDescendant(SwiftParser.LiteralContext.class, ctx.expression(0));
        return (keyIsLiteral ? "" : "[") + visit(ctx.expression(0)) + (keyIsLiteral ? "" : "]") + ":" + visit(ctx.expression(1));
    }

    @Override public String visitExternal_parameter_name(SwiftParser.External_parameter_nameContext ctx) {
        return "";
    }
    @Override public String visitInout(SwiftParser.InoutContext ctx) {
        return "";
    }

    @Override public String visitType_inheritance_symbol(SwiftParser.Type_inheritance_symbolContext ctx) {
        return "extends ";
    }

    @Override public String visitClass_body(SwiftParser.Class_bodyContext ctx) {
        return Initializer.handleClassBody(ctx, this);
    }
    @Override public String visitStruct_body(SwiftParser.Struct_bodyContext ctx) {
        return Initializer.handleClassBody(ctx, this);
    }

    @Override public String visitReturn_statement(SwiftParser.Return_statementContext ctx) {
        return Initializer.handleReturnStatement(ctx, this);
    }
}
