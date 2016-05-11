import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FunctionUtil {

    static public String parameterExternalName(ParserRuleContext parameter, int parameterPos) {
        if(parameter instanceof SwiftParser.ParameterContext) {
            if(((SwiftParser.ParameterContext)parameter).external_parameter_name() != null) {
                if(((SwiftParser.ParameterContext)parameter).external_parameter_name().getText().equals("_")) return "";
                else return ((SwiftParser.ParameterContext)parameter).external_parameter_name().getText();
            }
            if(parameterPos == 0) return "";
        }
        return parameterLocalName(parameter);
    }

    static public String parameterLocalName(ParserRuleContext parameter) {
        if(parameter instanceof SwiftParser.ParameterContext) {
            return ((SwiftParser.ParameterContext)parameter).local_parameter_name().getText();
        }
        if(parameter instanceof SwiftParser.Expression_elementContext) {
            if(((SwiftParser.Expression_elementContext)parameter).identifier() != null) return ((SwiftParser.Expression_elementContext)parameter).identifier().getText();
            return "";
        }
        return "";
    }

    static public String nameAugment(List<?extends ParserRuleContext> parameters, ArrayList<AbstractType> parameterTypes) {
        if(parameters == null) return "";
        String augment = "";
        for(int i = 0; i < parameters.size(); i++) {
            ParserRuleContext parameter = parameters.get(i);
            augment += "$" + parameterExternalName(parameter, i) + "_" + parameterTypes.get(i).swiftType();
        }
        return augment;
    }

    static public String nameFromDeclaration(SwiftParser.Function_declarationContext ctx, List<SwiftParser.ParameterContext> parameters, ArrayList<AbstractType> parameterTypes) {
        return ctx.function_name().getText() + nameAugment(parameters, parameterTypes);
    }

    static public ArrayList<AbstractType> parameterTypes(List<?extends ParserRuleContext> parameters, TranspilerVisitor visitor) {
        ArrayList<AbstractType> parameterTypes = new ArrayList<AbstractType>();
        if(parameters == null) return parameterTypes;

        for(int i = 0; i < parameters.size(); i++) {
            ParserRuleContext parameter = parameters.get(i);
            AbstractType parameterType;
            if(parameter instanceof SwiftParser.ParameterContext && ((SwiftParser.ParameterContext)parameter).type_annotation() != null) {
                parameterType = Type.fromDefinition(((SwiftParser.ParameterContext)parameter).type_annotation().type());
            }
            else {
                parameterType = Type.infer(parameter instanceof SwiftParser.ParameterContext ? ((SwiftParser.ParameterContext)parameter).default_argument_clause().expression() : ((SwiftParser.Expression_elementContext)parameter).expression(), visitor);
            }
            parameterTypes.add(parameterType);
        }
        return parameterTypes;
    }

    static public int numParametersWithDefaultValue(List<SwiftParser.ParameterContext> parameters) {
        if(parameters == null) return 0;

        int numParametersWithDefaultValue = 0;
        for(int i = parameters.size() - 1; i >= 0; i--) {
            SwiftParser.ParameterContext parameter = parameters.get(i);
            if(parameter.default_argument_clause() == null) break;
            numParametersWithDefaultValue++;
        }
        return numParametersWithDefaultValue;
    }

    static public String nameFromCall(String swiftFunctionName, List<SwiftParser.Expression_elementContext>parameters, ParserRuleContext ctx, TranspilerVisitor visitor) {
        ArrayList<AbstractType> parameterTypes = parameterTypes(parameters, visitor);
        String defaultFunctionName = swiftFunctionName + nameAugment(parameters, parameterTypes);
        if(visitor.cache.getType(defaultFunctionName, ctx) != null) return defaultFunctionName;

        Map<String, AbstractType> candidates = visitor.cache.getTypesStartingWith(defaultFunctionName, ctx);
        int numUsedParameters = parameters != null ? parameters.size() : 0;
        for(Map.Entry<String, AbstractType> iterator:candidates.entrySet()) {
            if(!(iterator.getValue() instanceof FunctionType)) continue;
            FunctionType functionType = (FunctionType)iterator.getValue();
            if(numUsedParameters >= functionType.parameterTypes.size() - functionType.numParametersWithDefaultValue) return iterator.getKey();
        }

        return null;
    }

    static public String functionDeclaration(SwiftParser.Function_declarationContext ctx, TranspilerVisitor visitor) {
        SwiftParser.Parameter_listContext parameterList = ctx.function_signature().parameter_clauses().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        ArrayList<AbstractType> parameterTypes = FunctionUtil.parameterTypes(parameters, visitor);
        int numParametersWithDefaultValue = FunctionUtil.numParametersWithDefaultValue(parameters);

        String jsFunctionName = FunctionUtil.nameFromDeclaration(ctx, parameters, parameterTypes);

        for(int i = 0; parameterTypes != null && i < parameterTypes.size(); i++) {
            visitor.cache.cacheOne(FunctionUtil.parameterLocalName(parameters.get(i)), parameterTypes.get(i), ctx);
        }

        AbstractType resultType = Type.fromFunction(ctx.function_signature().function_result(), ctx.function_body().code_block().statements(), false, visitor);
        AbstractType functionType = new FunctionType(parameterTypes, numParametersWithDefaultValue, resultType);
        visitor.cache.cacheOne(jsFunctionName, functionType, ctx);

        return "function " + jsFunctionName + "(" + (parameterList != null ? visitor.visit(parameterList) : "") + "):" + resultType.jsType() + visitor.visit(ctx.function_body().code_block());
    }

    static public String closureExpression(SwiftParser.Closure_expressionContext ctx, TranspilerVisitor visitor) {
        SwiftParser.Parameter_listContext parameterList = ctx.closure_signature().parameter_clause().parameter_list();
        List<SwiftParser.ParameterContext> parameters = parameterList != null ? parameterList.parameter() : null;
        ArrayList<AbstractType> parameterTypes = FunctionUtil.parameterTypes(parameters, visitor);
        for(int i = 0; parameterTypes != null && i < parameterTypes.size(); i++) {
            visitor.cache.cacheOne(FunctionUtil.parameterLocalName(parameters.get(i)), parameterTypes.get(i), ctx);
        }

        SwiftParser.StatementsContext statements = ctx.statements();
        //AbstractType resultType = Type.fromFunction(ctx.closure_signature().function_result(), statements, true, this);

        return "(" + (parameterList != null ? visitor.visit(parameterList) : "") + ") => " + (statements == null || statements.getChildCount() == 0 ? "{}" : statements.getChildCount() == 1 ? visitor.visitChildren(statements) : "{" + visitor.visitChildren(statements) + "}");
    }
}
