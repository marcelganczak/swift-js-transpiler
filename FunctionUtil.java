import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FunctionUtil {

    static public List<SwiftParser.ParameterContext> parameters(SwiftParser.Function_declarationContext ctx) {
        SwiftParser.Parameter_listContext parameterList = ctx.function_signature().parameter_clauses().parameter_clause().parameter_list();
        return parameterList != null ? parameterList.parameter() : new ArrayList<SwiftParser.ParameterContext>();
    }

    static public ArrayList<String> parameterExternalNames(List<SwiftParser.ParameterContext> parameters) {
        ArrayList<String> names = new ArrayList<String>();
        for(int i = 0; parameters != null && i < parameters.size(); i++) names.add(parameterExternalName(parameters.get(i), i));
        return names;
    }
    static private String parameterExternalName(ParserRuleContext parameter, int parameterPos) {
        if(parameter instanceof SwiftParser.ParameterContext) {
            if(((SwiftParser.ParameterContext)parameter).external_parameter_name() != null) {
                if(((SwiftParser.ParameterContext)parameter).external_parameter_name().getText().equals("_")) return "";
                else return ((SwiftParser.ParameterContext)parameter).external_parameter_name().getText();
            }
            //if(parameterPos == 0) return "";//not anymore since swift3
        }
        return parameterLocalName(parameter);
    }

    static public ArrayList<String> parameterLocalNames(List<SwiftParser.ParameterContext> parameters) {
        ArrayList<String> names = new ArrayList<String>();
        for(int i = 0; parameters != null && i < parameters.size(); i++) names.add(parameterLocalName(parameters.get(i)));
        return names;
    }
    static private String parameterLocalName(ParserRuleContext parameter) {
        if(parameter instanceof SwiftParser.ParameterContext) {
            return ((SwiftParser.ParameterContext)parameter).local_parameter_name().getText();
        }
        if(parameter instanceof SwiftParser.Expression_elementContext) {
            if(((SwiftParser.Expression_elementContext)parameter).identifier() != null) return ((SwiftParser.Expression_elementContext)parameter).identifier().getText();
            return "";
        }
        return "";
    }

    static public String nameAugment(FunctionType type) {
        String augment = "";
        for(int i = 0; i < type.parameterTypes.size(); i++) {
            augment += "$" + type.parameterExternalNames.get(i) + "_" + type.parameterTypes.get(i).sourceType();
        }
        return augment;
    }
    static private String nameAugment(List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/>parameters, ArrayList<AbstractType> parameterTypes) {
        if(parameters == null) return "";
        String augment = "";
        for(int i = 0; i < parameters.size(); i++) {
            ParserRuleContext parameter = parameters.get(i);
            augment += "$" + parameterExternalName(parameter, i) + "_" + parameterTypes.get(i).sourceType();
        }
        return augment;
    }

    static public String functionName(SwiftParser.Function_declarationContext ctx, FunctionType type) {
        return ctx.function_name().getText() + nameAugment(type);
    }

    static public ArrayList<AbstractType> parameterTypes(List<?extends ParserRuleContext> parameters, Visitor visitor) {
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

    static public String nameFromCall(String swiftFunctionName, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/>parameters, ParserRuleContext ctx, Visitor visitor) {
        ArrayList<AbstractType> parameterTypes = parameterTypes(parameters, visitor);
        String defaultFunctionName = swiftFunctionName + nameAugment(parameters, parameterTypes);
        if(visitor.cache.getTypeStrict(defaultFunctionName, ctx) != null) return defaultFunctionName;

        Map<String, FunctionType> candidates = visitor.cache.getFunctionTypesStartingWith(defaultFunctionName, ctx);
        int numUsedParameters = parameters != null ? parameters.size() : 0;
        for(Map.Entry<String, FunctionType> iterator:candidates.entrySet()) {
            FunctionType functionType = iterator.getValue();
            if(numUsedParameters >= functionType.parameterTypes.size() - functionType.numParametersWithDefaultValue) return iterator.getKey();
        }

        Expression variadicFunction = visitor.cache.getFunctionTypeEndingWithVariadic(defaultFunctionName, ctx);
        if(variadicFunction != null) return variadicFunction.code;

        return null;
    }

    static public String nameFromCall(String swiftFunctionName, FunctionType type, ParserRuleContext ctx, Visitor visitor) {
        Map<String, FunctionType> candidates = visitor.cache.getFunctionTypesStartingWith(swiftFunctionName, ctx);
        for(Map.Entry<String, FunctionType> iterator:candidates.entrySet()) {
            FunctionType functionType = iterator.getValue();
            if(functionType.sameAs(type)) return iterator.getKey();
        }
        return null;
    }

    static public String functionDeclaration(SwiftParser.Function_declarationContext ctx, Visitor visitor) {
        FunctionType functionType = new FunctionType(ctx, visitor);

        return "function " + FunctionUtil.functionName(ctx, functionType) + "(" + visitor.visitChildren(ctx.function_signature().parameter_clauses().parameter_clause().parameter_list()) + "):" + functionType.returnType.targetType(visitor.targetLanguage) + visitor.visit(ctx.function_body().code_block());
    }

    static public String closureExpression(SwiftParser.Closure_expressionContext ctx, FunctionType type, Visitor visitor) {
        if(ctx.operator() != null) {
            return "(a, b) => a " + ctx.operator().getText() + " b";
        }
        if(ctx.explicit_closure_expression() != null) {
            return explicitClosureExpression(ctx.explicit_closure_expression(), type, visitor);
        }
        return null;
    }

    static public String explicitClosureExpression(SwiftParser.Explicit_closure_expressionContext ctx, FunctionType type, Visitor visitor) {
        if(type != null) {
            for(int i = 0; i < type.parameterTypes.size(); i++) {
                visitor.cache.cacheOne("$" + i, type.parameterTypes.get(i), ctx);
            }
        }

        SwiftParser.Parameter_listContext parameterList = null;
        if(ctx.closure_signature() != null) {
            parameterList = ctx.closure_signature().parameter_clause().parameter_list();
        }

        SwiftParser.StatementsContext statements = ctx.statements();

        return "(" + (parameterList != null ? visitor.visit(parameterList) : "") + ") => " + (statements == null || statements.getChildCount() == 0 ? "{}" : statements.getChildCount() == 1 ? visitor.visitChildren(statements) : "{" + visitor.visitChildren(statements) + "}");
    }
}
