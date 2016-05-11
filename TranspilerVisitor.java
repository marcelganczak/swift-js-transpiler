import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class TranspilerVisitor extends NativeOverriddenVisitor {

    protected EntityCache cache = new EntityCache();

    public String jsForIn(SwiftParser.For_in_statementContext ctx) {
        SwiftParser.ExpressionContext expression = ctx.expression();
        if(expression != null && expression.binary_expressions() != null) {
            SwiftParser.Binary_expressionContext binary = expression.binary_expressions().binary_expression(0);
            String from = visit(expression.prefix_expression()),
                   to = visit(binary.prefix_expression()),
                   varName = ctx.pattern().getText().equals("_") ? "$" : ctx.pattern().getText(),
                   operator = BinaryExpression.operatorAlias(binary.binary_operator());
            return "for(let " + varName + " = " + from + "; " + varName + " " + (operator.equals("...") ? "<=" : "<") + " " + to + "; " + varName + "++) " + visit(ctx.code_block());
        }
        return "_.each(" + visit(ctx.expression()) + ", " + visit(ctx.pattern()) + " => " + visit(ctx.code_block()) + ")";
    }

    public String jsWhile(SwiftParser.While_statementContext ctx) {
        return "while(" + visit(ctx.condition_clause()) + ") " + visit(ctx.code_block());
    }

    public String jsRepeatWhile(SwiftParser.Repeat_while_statementContext ctx) {
        return "do " + visit(ctx.code_block()) + "while(" + visit(ctx.expression()) + ")";
    }

    class IfLet {
        public String varName;
        public String varVal;
        public IfLet(ParserRuleContext ctx, TranspilerVisitor visitor) {
            SwiftParser.Condition_clauseContext conditionClause = ctx instanceof SwiftParser.If_statementContext ? ((SwiftParser.If_statementContext)ctx).condition_clause() : ((SwiftParser.Guard_statementContext)ctx).condition_clause();
            if(!(WalkerUtil.isDirectDescendant(SwiftParser.Optional_binding_conditionContext.class, conditionClause))) return;
            SwiftParser.Optional_binding_headContext ifLet = conditionClause.condition_list().condition(0).optional_binding_condition().optional_binding_head();
            varName = visitWithoutTerminals(ifLet.pattern()).trim();
            Expression varVal = new Expression(ifLet.initializer().expression(), visitor);
            SwiftParser.Code_blockContext block = ctx instanceof SwiftParser.If_statementContext ? ((SwiftParser.If_statementContext)ctx).code_block() : ((SwiftParser.Guard_statementContext)ctx).code_block();
            visitor.cache.cacheOne(varName, varVal.type, block);
            this.varVal = varVal.code;
        }
    }
    public String toJsIf(SwiftParser.If_statementContext ctx) {
        String condition = visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        IfLet ifLet = new IfLet(ctx, this);
        if(ifLet.varName != null) {
            condition = ifLet.varVal + " != null";
            beforeBlock = "const " + ifLet.varName + " = " + ifLet.varVal + ";";
        }
        return "if(" + condition + ") {" + beforeBlock + visitWithoutStrings(ctx.code_block(), "{") + visitChildren(ctx.else_clause());
    }
    public String toJsGuard(SwiftParser.Guard_statementContext ctx) {
        String condition = visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        IfLet ifLet = new IfLet(ctx, this);
        if(ifLet.varName != null) {
            condition = ifLet.varVal + " != null";
            beforeBlock = "const " + ifLet.varName + " = " + ifLet.varVal + ";";
        }
        return "if(!(" + condition + ")) {" + beforeBlock + visitWithoutStrings(ctx.code_block(), "{");
    }

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

    public String jsFunctionDeclaration(SwiftParser.Function_declarationContext ctx) {
        SwiftParser.Parameter_listContext parameterList = ctx.function_signature().parameter_clauses().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        ArrayList<AbstractType> parameterTypes = FunctionUtil.parameterTypes(parameters, this);
        int numParametersWithDefaultValue = FunctionUtil.numParametersWithDefaultValue(parameters);

        String jsFunctionName = FunctionUtil.nameFromDeclaration(ctx, parameters, parameterTypes);

        for(int i = 0; parameterTypes != null && i < parameterTypes.size(); i++) {
            cache.cacheOne(FunctionUtil.parameterLocalName(parameters.get(i)), parameterTypes.get(i), ctx);
        }

        AbstractType resultType = Type.fromFunction(ctx.function_signature().function_result(), ctx.function_body().code_block().statements(), false, this);
        AbstractType functionType = new FunctionType(parameterTypes, numParametersWithDefaultValue, resultType);
        cache.cacheOne(jsFunctionName, functionType, ctx);

        return "function " + jsFunctionName + "(" + (parameterList != null ? visit(parameterList) : "") + "):" + resultType.jsType() + visit(ctx.function_body().code_block());
    }

    public String jsFunctionResult(SwiftParser.Function_resultContext ctx) {
        return ":" + visit(ctx.type());
    }

    public String jsClosureExpression(SwiftParser.Closure_expressionContext ctx) {
        SwiftParser.Parameter_listContext parameterList = ctx.closure_signature().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        ArrayList<AbstractType> parameterTypes = FunctionUtil.parameterTypes(parameters, this);
        for(int i = 0; parameterTypes != null && i < parameterTypes.size(); i++) {
            cache.cacheOne(FunctionUtil.parameterLocalName(parameters.get(i)), parameterTypes.get(i), ctx);
        }

        SwiftParser.StatementsContext statements = ctx.statements();
        //AbstractType resultType = Type.fromFunction(ctx.closure_signature().function_result(), statements, true, this);

        return "(" + (parameterList != null ? visit(parameterList) : "") + ") => " + (statements == null || statements.getChildCount() == 0 ? "{}" : statements.getChildCount() == 1 ? visitChildren(statements) : "{" + visitChildren(statements) + "}");
    }
}
