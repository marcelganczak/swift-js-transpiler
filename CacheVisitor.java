import java.util.ArrayList;
import java.util.List;

public class CacheVisitor extends Visitor {

    public CacheVisitor(EntityCache cache) {
        super();
        this.cache = cache;
    }

    @Override public String visitPattern_initializer(SwiftParser.Pattern_initializerContext ctx) {
        String varName = ctx.pattern().identifier_pattern().getText();
        AbstractType varType =
                ctx.pattern().type_annotation() != null && ctx.pattern().type_annotation().type() != null ? Type.fromDefinition(ctx.pattern().type_annotation().type())
                : Type.infer(ctx.initializer().expression(), this);
        cache.cacheOne(varName, varType, ctx);
        return null;
    }

    @Override public String visitFunction_declaration(SwiftParser.Function_declarationContext ctx) {
        SwiftParser.Parameter_listContext parameterList = ctx.function_signature().parameter_clauses().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        ArrayList<AbstractType> parameterTypes = FunctionUtil.parameterTypes(parameters, this);
        int numParametersWithDefaultValue = FunctionUtil.numParametersWithDefaultValue(parameters);

        for(int i = 0; parameterTypes != null && i < parameterTypes.size(); i++) {
            cache.cacheOne(FunctionUtil.parameterLocalName(parameters.get(i)), parameterTypes.get(i), ctx);
        }

        String jsFunctionName = FunctionUtil.nameFromDeclaration(ctx, parameters, parameterTypes);

        AbstractType resultType = Type.fromFunction(ctx.function_signature().function_result(), ctx.function_body().code_block().statements(), false, this);
        AbstractType functionType = new FunctionType(parameterTypes, numParametersWithDefaultValue, resultType);
        cache.cacheOne(jsFunctionName, functionType, ctx);

        return null;
    }

    @Override public String visitClosure_expression(SwiftParser.Closure_expressionContext ctx) {
        SwiftParser.Parameter_listContext parameterList = ctx.closure_signature().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        ArrayList<AbstractType> parameterTypes = FunctionUtil.parameterTypes(parameters, this);
        for(int i = 0; parameterTypes != null && i < parameterTypes.size(); i++) {
            cache.cacheOne(FunctionUtil.parameterLocalName(parameters.get(i)), parameterTypes.get(i), ctx);
        }

        return null;
    }
}
