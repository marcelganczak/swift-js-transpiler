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

    public String toJsIf(SwiftParser.If_statementContext ctx) {
        String condition = visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        if(WalkerUtil.isDirectDescendant(SwiftParser.Optional_binding_conditionContext.class, ctx.condition_clause())) {
            SwiftParser.Optional_binding_headContext ifLet = ctx.condition_clause().condition_list().condition(0).optional_binding_condition().optional_binding_head();
            String constVar = visitWithoutTerminals(ifLet.pattern());
            String var = visitWithoutTerminals(ifLet.initializer().expression());
            condition = var + " != null";
            beforeBlock = "const " + constVar + " = " + var + ";";
        }
        return "if(" + condition + ") {" + beforeBlock + visitWithoutStrings(ctx.code_block(), "{") + visitChildren(ctx.else_clause());
    }

    public ArrayList<ParserRuleContext> flattenChain(ParserRuleContext/*expression or prefix_expression*/ ctx) {
        ArrayList<ParserRuleContext> flattened = new ArrayList<ParserRuleContext>();
        SwiftParser.Postfix_expressionContext postfix = (ctx instanceof SwiftParser.ExpressionContext ? ((SwiftParser.ExpressionContext)ctx).prefix_expression() : (SwiftParser.Prefix_expressionContext)ctx).postfix_expression();
        while(postfix.postfix_expression() != null) {
            if(postfix.chain_postfix_expression() != null && !(postfix.chain_postfix_expression() instanceof SwiftParser.Forced_value_expressionContext)) {
                flattened.add(0, postfix.chain_postfix_expression());
                if(postfix.chain_postfix_expression() instanceof SwiftParser.Explicit_member_expression_number_doubleContext) flattened.add(0, postfix.chain_postfix_expression());
            }
            postfix = postfix.postfix_expression();
        }
        flattened.add(0, postfix.primary_expression());
        return flattened;
    }

    public ChainElem jsChain(ParserRuleContext/*expression or prefix_expression*/ ctx) {
        if(ctx instanceof SwiftParser.ExpressionContext && ((SwiftParser.ExpressionContext)ctx).binary_expressions() != null) {
            return BinaryExpression.handle((SwiftParser.ExpressionContext) ctx, this);
        }
        ArrayList<ParserRuleContext> flattenedChain = flattenChain(ctx);
        String declaredEntity = getDeclaredEntityForChain(ctx);
        AbstractType declaredType = declaredEntity != null ? cache.getType(declaredEntity, ctx) : null;
        ChainElem result = jsChainElem(declaredType, flattenedChain, 0, "", null);
        if(declaredEntity != null && declaredType == null) {
            cache.cacheOne(declaredEntity, result.type, ctx);
        }
        return result;
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
        ParserRuleContext baseParent = ctx instanceof SwiftParser.ExpressionContext ? ctx.getParent() : ctx;
        ParserRuleContext parentExpression = baseParent.getParent().getParent();
        if(parentExpression instanceof SwiftParser.Pattern_initializerContext) {
            SwiftParser.IdentifierContext identifier = ((SwiftParser.Pattern_initializerContext) parentExpression).pattern().identifier_pattern().identifier();
            if(identifier != null) return identifier.getText();
        }
        if(parentExpression instanceof SwiftParser.ExpressionContext && baseParent.getChild(0).getText().equals("=")) {
            return ((SwiftParser.ExpressionContext) parentExpression).prefix_expression().postfix_expression().primary_expression().getText();
        }
        return null;
    }
    public ChainElem jsChainElem(AbstractType declaredType, ArrayList<ParserRuleContext> chain, int chainPos, String L, AbstractType lType) {
        ParserRuleContext rChild = chain.get(chainPos);

        SwiftParser.Function_call_expressionContext functionCall = null;
        List<SwiftParser.Expression_elementContext> functionCallParams = null;
        if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_expressionContext) {
            functionCall = (SwiftParser.Function_call_expressionContext) chain.get(chainPos + 1);
            functionCallParams = functionCall.parenthesized_expression().expression_element_list() != null ? functionCall.parenthesized_expression().expression_element_list().expression_element() : null;
        }

        ChainElem chainElem;
        Replacement replacement = this.replacement(chainPos == 0, lType, rChild instanceof SwiftParser.Explicit_member_expressionContext ? ((SwiftParser.Explicit_member_expressionContext) rChild).identifier().getText() : rChild.getText(), functionCallParams);
        if(replacement != null) {
            chainElem = replacement.chainElem;
            chainPos += replacement.skip;
        }
        else {
            chainElem = ChainElem.get(rChild, declaredType, functionCall, functionCallParams, chain, chainPos, lType, this);
        }

        if(chainElem.type == null) {
            chainElem.type = Type.resulting(lType, chainElem.code, chain.get(0), this);
            if(functionCall != null && chainElem.type instanceof FunctionType) chainElem.type = chainElem.type.resulting("()");
        }

        if(functionCall != null) chainPos++;

        String LR = chainElem.accessorType.equals("_.()") ? "_." + chainElem.code + "(" + L + (chainElem.functionCallParams != null ? "," + chainElem.functionCallParams : "") + ")"
                  : L + (L.length() == 0 ? chainElem.code : chainElem.accessorType.equals(".") ? "." + chainElem.code : "[" + chainElem.code + "]") + (chainElem.functionCallParams != null ? "(" + chainElem.functionCallParams + ")" : "");

        ChainElem nextChain =
                chainPos + 1 < chain.size() ? jsChainElem(declaredType, chain, chainPos + 1, LR, chainElem.type)
                : new ChainElem(LR, "", chainElem.type, null);

        boolean isOptional = rChild.getChild(0).getText().equals("?");
        if(isOptional) {
            nextChain.code = "(" + L + "!= null ? " + nextChain.code + " : null )";
        }

        return nextChain;
    }

    class Replacement {
        public int skip = 0;
        public ChainElem chainElem;
        public Replacement(ChainElem chainElem) {
            this.chainElem = chainElem;
        }
        public Replacement(ChainElem chainElem, int skip) {
            this.chainElem = chainElem;
            this.skip = skip;
        }
    }
    private Replacement replacement(boolean isStart, AbstractType lType, String R, List<SwiftParser.Expression_elementContext> functionCallParams) {
        if(R == null) return null;
        if(lType != null && lType.swiftType().equals("Dictionary")) {
            if(R.equals("count")) {
                return new Replacement(new ChainElem("size", "_.()", new BasicType("Int"), null));
            }
            if(R.equals("updateValue")) {
                return new Replacement(new ChainElem("updateValue", "_.()", new BasicType("Void"), null/*TODO*/));
            }
        }
        if(lType != null && lType.swiftType().equals("Array")) {
            if(R.equals("count")) {
                return new Replacement(new ChainElem("length", ".", new BasicType("Int"), null));
            }
        }
        if(lType != null && lType.swiftType().equals("Set")) {
            if(R.equals("count")) {
                return new Replacement(new ChainElem("size", ".", new BasicType("Int"), null));
            }
            if(R.equals("insert")) {
                return new Replacement(new ChainElem("add", ".", new BasicType("Void"), visit(functionCallParams.get(0))));
            }
        }
        if(lType != null && lType.swiftType().equals("String")) {
            if(R.equals("characters")) {
                return new Replacement(new ChainElem("length", ".", new BasicType("Int"), null), 1);
            }
        }
        if(isStart) {
            if(R.equals("print")) return new Replacement(new ChainElem("console.log", "", new BasicType("Void"), visit(functionCallParams.get(0))));
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
