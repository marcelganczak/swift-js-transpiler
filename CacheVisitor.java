import org.antlr.v4.runtime.ParserRuleContext;

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
        if(varType instanceof FunctionType) varName += FunctionUtil.nameAugment((FunctionType)varType);
        cache.cacheOne(varName, varType, ctx);
        return null;
    }

    @Override public String visitFunction_declaration(SwiftParser.Function_declarationContext ctx) {
        FunctionType functionType = new FunctionType(ctx, this);
        cache.cacheOne(FunctionUtil.functionName(ctx, functionType), functionType, ctx);

        ArrayList<String> parameterLocalNames = FunctionUtil.parameterLocalNames(FunctionUtil.parameters(ctx));
        for(int i = 0; i < parameterLocalNames.size(); i++) {
            cache.cacheOne(parameterLocalNames.get(i), functionType.parameterTypes.get(i), ctx);
        }

        return null;
    }

    @Override public String visitClosure_expression(SwiftParser.Closure_expressionContext ctx) {
        /*SwiftParser.Parameter_listContext parameterList = ctx.closure_signature().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        ArrayList<AbstractType> parameterTypes = FunctionUtil.parameterTypes(parameters, this);
        for(int i = 0; parameterTypes != null && i < parameterTypes.size(); i++) {
            cache.cacheOne(FunctionUtil.parameterLocalName(parameters.get(i)), parameterTypes.get(i), ctx);
        }*/

        return null;
    }
}
