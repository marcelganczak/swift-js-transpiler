import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TranspilerVisitor extends NativeOverriddenVisitor {

    protected EntityCache cache = new EntityCache();

    public String jsForIn(SwiftParser.For_in_statementContext ctx) {
        return "_.each(" + visit(ctx.expression()) + ", " + visit(ctx.pattern()) + " => " + visit(ctx.code_block()) + ")";
    }

    public String jsDictionaryLiteral(SwiftParser.Dictionary_literalContext ctx) {
        if(WalkerUtil.isDirectDescendant(SwiftParser.Empty_dictionary_literalContext.class, ctx)) return "{}";
        ArrayList<Integer> withoutNodes = new ArrayList<Integer>(); withoutNodes.add(0); withoutNodes.add(ctx.getChildCount() - 1);
        return '{' + visitChildren(ctx, withoutNodes) + '}';
    }

    public String jsFunctionResult(SwiftParser.Function_resultContext ctx) {
        return ":" + visit(ctx.type());
    }

    public ArrayList<ParserRuleContext> flattenChain(SwiftParser.Prefix_expressionContext ctx) {
        ArrayList<ParserRuleContext> flattened = new ArrayList<ParserRuleContext>();
        SwiftParser.Postfix_expressionContext postfix = ctx.postfix_expression();
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

    class JsChainResult {
        public String code;
        public AbstractType type;
        JsChainResult(String code, AbstractType type) {this.code = code; this.type = type;}
    }
    public JsChainResult jsChain(SwiftParser.Prefix_expressionContext ctx) {
        ArrayList<ParserRuleContext> flattenedChain = flattenChain(ctx);
        String declaredEntity = getDeclaredEntityForChain(ctx);
        AbstractType declaredType = declaredEntity != null ? cache.getType(declaredEntity, ctx) : null;
        JsChainResult result = jsChainElem(ctx, declaredType, flattenedChain, 0, "", null);
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
    public String getDeclaredEntityForChain(SwiftParser.Prefix_expressionContext ctx) {
        SwiftParser.Pattern_initializerContext initializer = ctx.getParent().getParent().getParent() instanceof SwiftParser.Pattern_initializerContext ? (SwiftParser.Pattern_initializerContext) ctx.getParent().getParent().getParent() : null;
        if(initializer != null) {
            SwiftParser.IdentifierContext identifier = initializer.pattern().identifier_pattern().identifier();
            if(identifier != null) return identifier.getText();
        }
        return null;
    }
    public JsChainResult jsChainElem(SwiftParser.Prefix_expressionContext ctx, AbstractType declaredType, ArrayList<ParserRuleContext> chain, int chainPos, String L, AbstractType lType) {
        ParserRuleContext rChild = chain.get(chainPos);

        SwiftParser.Function_call_expressionContext functionCall = null;
        List<SwiftParser.Expression_elementContext> functionCallParams = null;
        if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_expressionContext) {
            functionCall = (SwiftParser.Function_call_expressionContext) chain.get(chainPos + 1);
            functionCallParams = functionCall.parenthesized_expression().expression_element_list() != null ? functionCall.parenthesized_expression().expression_element_list().expression_element() : null;
        }

        ChainElem chainElem = ChainElem.get(rChild, declaredType, functionCall, functionCallParams, ctx, chain, chainPos, lType, this);

        if(chainElem.type == null) {
            chainElem.type = Type.resulting(lType, chainElem.code, chain.get(0), this);
            if(functionCall != null && chainElem.type instanceof FunctionType) chainElem.type = chainElem.type.resulting("()");
        }

        if(functionCall != null) chainPos++;

        String LR = chainElem.accessorType.equals("_.()") ? "_." + chainElem.code + "(" + L + (chainElem.functionCallParams != null ? "," + chainElem.functionCallParams : "") + ")"
                  : L + (L.length() == 0 ? chainElem.code : chainElem.accessorType.equals(".") ? "." + chainElem.code : "[" + chainElem.code + "]") + (chainElem.functionCallParams != null ? "(" + chainElem.functionCallParams + ")" : "");

        JsChainResult nextChain =
                chainPos + 1 < chain.size() ? jsChainElem(ctx, declaredType, chain, chainPos + 1, LR, chainElem.type)
                : new JsChainResult(LR, chainElem.type);

        boolean isOptional = rChild.getChild(0).getText().equals("?");
        if(isOptional) {
            nextChain.code = "(" + L + "!= null ? " + nextChain.code + " : null )";
        }

        return nextChain;
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

    public String jsFunctionDeclaration(SwiftParser.Function_declarationContext ctx) {
        SwiftParser.Parameter_listContext parameterList = ctx.function_signature().parameter_clauses().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;

        String externalNames = "";
        if(parameters != null) {
            for(int i = 0; i < parameters.size(); i++) {
                SwiftParser.ParameterContext parameter = parameters.get(i);
                if(parameter.external_parameter_name() != null) {
                    externalNames += "$" + (parameter.external_parameter_name().getText().equals("_") ? "" : visit(parameter.external_parameter_name()).trim());
                }
                else {
                    externalNames += "$" + (i > 0 ? visit(parameter.local_parameter_name()).trim() : "");
                }
            }
        }
        if(externalNames.equals("$")) externalNames = "";
        String jsFunctionName = visit(ctx.function_name()).trim() + externalNames;

        HashMap<String, AbstractType> parameterTypes = parameters != null ? Type.fromParameters(parameters, this) : new HashMap<String, AbstractType>();
        for(Map.Entry<String, AbstractType> entry : parameterTypes.entrySet()) {
            cache.cacheOne(entry.getKey(), entry.getValue(), ctx.function_body().code_block());
        }

        AbstractType resultType = Type.fromFunction(ctx.function_signature().function_result(), ctx.function_body().code_block().statements(), false, this);
        AbstractType functionType = new FunctionType(parameterTypes, resultType);
        cache.cacheOne(jsFunctionName, functionType, ctx);

        return "function " + jsFunctionName + "(" + (parameterList != null ? visit(parameterList) : "") + "):" + resultType.jsType() + visit(ctx.function_body().code_block());
    }

    public String jsClosureExpression(SwiftParser.Closure_expressionContext ctx) {
        SwiftParser.Parameter_listContext parameterList = ctx.closure_signature().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        HashMap<String, AbstractType> parameterTypes = parameters != null ? Type.fromParameters(parameters, this) : new HashMap<String, AbstractType>();
        for(Map.Entry<String, AbstractType> entry : parameterTypes.entrySet()) {
            cache.cacheOne(entry.getKey(), entry.getValue(), ctx);
        }

        SwiftParser.StatementsContext statements = ctx.statements();
        //AbstractType resultType = Type.fromFunction(ctx.closure_signature().function_result(), statements, true, this);

        return "(" + (parameterList != null ? visit(parameterList) : "") + ") => " + (statements == null || statements.getChildCount() == 0 ? "{}" : statements.getChildCount() == 1 ? visitChildren(statements) : "{" + visitChildren(statements) + "}");
    }

    public String functionNameWithExternalParams(String functionName, List<SwiftParser.Expression_elementContext> parameters) {
        String externalNames = "";
        for(int i = 0; i < parameters.size(); i++) {
            SwiftParser.Expression_elementContext parameter = parameters.get(i);
            if(parameter.identifier() != null) {
                externalNames += "$" + parameter.identifier().getText();
            }
            else {
                externalNames += "$";
            }
        }
        if(externalNames.equals("$")) externalNames = "";
        return functionName + externalNames;
    }
}
