import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class CacheVisitor extends Visitor {

    public CacheVisitor(Cache cache, String targetLanguage) {
        super();
        this.cache = cache;
        this.targetLanguage = targetLanguage;
    }

    @Override public String visitPattern_initializer(SwiftParser.Pattern_initializerContext ctx) {
        String varName = ctx.pattern().identifier_pattern().getText();
        Instance varType =
                ctx.pattern().type_annotation() != null && ctx.pattern().type_annotation().type() != null ? TypeUtil.fromDefinition(ctx.pattern().type_annotation().type(), this)
                : TypeUtil.infer(ctx.initializer().expression(), this);
        cache(varName, varType, ctx);
        visitChildren(ctx.initializer());
        return null;
    }

    @Override public String visitProperty_declaration(SwiftParser.Property_declarationContext ctx) {
        String varName = ctx.variable_name().getText();
        Instance varType = TypeUtil.fromDefinition(ctx.type_annotation().type(), this);
        cache(varName, varType, ctx);
        visit(ctx.property_declaration_body());
        return null;
    }

    private void cache(String varName, Object/*Definition/Instance*/ varType, ParseTree ctx) {
        if(varType instanceof FunctionDefinition) varName += FunctionUtil.nameAugment(((FunctionDefinition)varType).parameterExternalNames, ((FunctionDefinition)varType).parameterTypes);
        cache.cacheOne(varName, varType, ctx);
    }

    @Override public String visitFunction_declaration(SwiftParser.Function_declarationContext ctx) {
        visitFunctionDeclaration(ctx);
        return null;
    }
    @Override public String visitInitializer_declaration(SwiftParser.Initializer_declarationContext ctx) {
        visitFunctionDeclaration(ctx);
        return null;
    }
    private void visitFunctionDeclaration(ParserRuleContext ctx) {

        FunctionDefinition functionDefinition = new FunctionDefinition(ctx, this);
        cache.cacheOne(functionDefinition.name, functionDefinition, ctx);

        SwiftParser.Code_blockContext codeBlockCtx = FunctionUtil.codeBlockCtx(ctx);
        ArrayList<String> parameterLocalNames = FunctionUtil.parameterLocalNames(FunctionUtil.parameters(ctx));
        for(int i = 0; i < parameterLocalNames.size(); i++) {
            cache.cacheOne(parameterLocalNames.get(i), functionDefinition.parameterTypes.get(i), codeBlockCtx);
        }

        visit(codeBlockCtx);
    }

    public void visitExplicit_closure_expression(PrefixElem elem, SwiftParser.Explicit_closure_expressionContext ctx, int paramPos) {

        List<Instance> parameterTypes = FunctionUtil.closureParameterTypes(elem.type, elem.typeBeforeCall, paramPos);
        List<String> parameterNames = FunctionUtil.closureParameterNames(parameterTypes, ctx);

        for(int i = 0; i < parameterNames.size(); i++) cache.cacheOne(parameterNames.get(i), parameterTypes.get(i), ctx);
    }

    @Override public String visitSetter_clause(SwiftParser.Setter_clauseContext ctx) {
        this.visitPropertyClause(ctx);
        return null;
    }
    @Override public String visitWillSet_clause(SwiftParser.WillSet_clauseContext ctx) {
        this.visitPropertyClause(ctx);
        return null;
    }
    @Override public String visitDidSet_clause(SwiftParser.DidSet_clauseContext ctx) {
        this.visitPropertyClause(ctx);
        return null;
    }
    private void visitPropertyClause(ParserRuleContext ctx) {
        SwiftParser.Property_declarationContext propertyDeclaration = (SwiftParser.Property_declarationContext) ctx.parent.parent.parent;
        Instance propertyType = ((Instance)cache.find(propertyDeclaration.variable_name().getText(), ctx).object).withoutPropertyInfo();
        //propertyType.isGetterSetter = null;
        SwiftParser.Code_blockContext blockContext =
            ctx instanceof SwiftParser.Setter_clauseContext ? ((SwiftParser.Setter_clauseContext)ctx).code_block() :
            ctx instanceof SwiftParser.WillSet_clauseContext ? ((SwiftParser.WillSet_clauseContext)ctx).code_block() :
            ((SwiftParser.DidSet_clauseContext)ctx).code_block();
        String argumentName =
            ctx instanceof SwiftParser.Setter_clauseContext ? AssignmentUtil.setterArgumentName((SwiftParser.Setter_clauseContext) ctx) :
            ctx instanceof SwiftParser.WillSet_clauseContext ? AssignmentUtil.willSetArgumentName((SwiftParser.WillSet_clauseContext)ctx) :
            AssignmentUtil.didSetArgumentName((SwiftParser.DidSet_clauseContext)ctx);

        cache.cacheOne(argumentName, propertyType, blockContext);

        visit(blockContext);
    }

    /*@Override public String visitClosure_expression(SwiftParser.Closure_expressionContext ctx) {
        SwiftParser.Parameter_listContext parameterList = ctx.closure_signature().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        ArrayList<Instance> parameterTypes = FunctionUtil.parameterTypes(parameters, this);
        for(int i = 0; parameterTypes != null && i < parameterTypes.size(); i++) {
            cache.cacheOne(FunctionUtil.parameterLocalName(parameters.get(i)), parameterTypes.get(i), ctx);
        }

        return null;
    }*/

    @Override public String visitClass_declaration(SwiftParser.Class_declarationContext ctx) {
        visitClassOrStructDeclaration(ctx);
        return null;
    }
    @Override public String visitStruct_declaration(SwiftParser.Struct_declarationContext ctx) {
        visitClassOrStructDeclaration(ctx);
        return null;
    }
    private void visitClassOrStructDeclaration(ParserRuleContext ctx) {
        String className =
                ctx instanceof SwiftParser.Class_declarationContext ? ((SwiftParser.Class_declarationContext)ctx).class_name().getText() :
                ((SwiftParser.Struct_declarationContext)ctx).struct_name().getText();

        Cache.CacheBlockAndObject superClass = null;
        SwiftParser.Type_inheritance_clauseContext typeInheritanceClauseCtx =
                ctx instanceof SwiftParser.Class_declarationContext ? ((SwiftParser.Class_declarationContext)ctx).type_inheritance_clause() :
                ((SwiftParser.Struct_declarationContext)ctx).type_inheritance_clause();
        if(typeInheritanceClauseCtx != null) {
            String superClassName = typeInheritanceClauseCtx.type_inheritance_list().type_identifier().getText();
            superClass = this.cache.find(superClassName, ctx);
        }

        ClassDefinition classDefinition = new ClassDefinition(className, superClass, new LinkedHashMap<String, Instance>(), new ArrayList<String>());
        if(ctx instanceof SwiftParser.Struct_declarationContext) {
            classDefinition.cloneOnAssignmentReplacement = new HashMap<String, Boolean>();
            classDefinition.cloneOnAssignmentReplacement.put("ts", true);
            classDefinition.cloneOnAssignmentReplacement.put("java", true);
        }
        cache.cacheOne(className, classDefinition, ctx);

        visit(ctx instanceof SwiftParser.Class_declarationContext ? ((SwiftParser.Class_declarationContext)ctx).class_body() : ((SwiftParser.Struct_declarationContext)ctx).struct_body());

        if(ctx instanceof SwiftParser.Struct_declarationContext) Initializer.addMemberwiseInitializer(classDefinition, ctx, this);
        Initializer.addDefaultInitializer(classDefinition, ctx, this);
    }

    @Override public String visitFor_in_statement(SwiftParser.For_in_statementContext ctx) {

        if(ctx.expression() != null && ctx.expression().binary_expressions() != null) {
            String varName = ctx.pattern().getText().equals("_") ? "$" : ctx.pattern().getText();
            cache.cacheOne(varName, new Instance("Int", ctx, cache), ctx.code_block());
        }
        else {
            Instance iteratedType = new Expression(ctx.expression(), null, this).type;
            String indexVar = "$", valueVar;
            if(ctx.pattern().tuple_pattern() != null) {
                indexVar = ctx.pattern().tuple_pattern().tuple_pattern_element_list().tuple_pattern_element(0).getText();
                valueVar = ctx.pattern().tuple_pattern().tuple_pattern_element_list().tuple_pattern_element(1).getText();
            }
            else {
                valueVar = ctx.pattern().identifier_pattern().getText();
            }
            cache.cacheOne(indexVar, iteratedType.typeName().equals("Dictionary") ? iteratedType.generics.get("Key") : new Instance("Int", ctx, cache), ctx.code_block());
            cache.cacheOne(valueVar, iteratedType.typeName().equals("String") ? new Instance("String", ctx, cache) : iteratedType.generics.get("Value"), ctx.code_block());
        }

        visit(ctx.code_block());

        return null;
    }

    private void cacheIfLet(ParserRuleContext ctx, SwiftParser.Code_blockContext codeBlock) {
        IfLet ifLet = new IfLet(ctx, this);
        for(int i = 0; i < ifLet.varNames.size(); i++) {
            cache.cacheOne(ifLet.varNames.get(i), ifLet.varTypes.get(i), codeBlock);
        }
        visit(codeBlock);
    }

    @Override public String visitIf_statement(SwiftParser.If_statementContext ctx) {
        cacheIfLet(ctx, ctx.code_block());
        if(ctx.else_clause() != null) visit(ctx.else_clause());
        return null;
    }

    @Override public String visitGuard_statement(SwiftParser.Guard_statementContext ctx) {
        cacheIfLet(ctx, ctx.code_block());
        return null;
    }
}
