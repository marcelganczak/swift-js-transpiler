import org.antlr.v4.runtime.ParserRuleContext;
import sun.org.mozilla.javascript.internal.Function;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FunctionUtil {

    static public List<SwiftParser.ParameterContext> parameters(ParserRuleContext ctx) {
        SwiftParser.Parameter_listContext parameterList = FunctionUtil.parameterList(ctx);
        return parameterList != null ? parameterList.parameter() : new ArrayList<SwiftParser.ParameterContext>();
    }

    static public ArrayList<String> parameterExternalNames(List<?extends ParserRuleContext> parameters) {
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
        return parameterLocalName(parameter);//shouldn't be ""?
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
            augment += "$" + type.parameterExternalNames.get(i) + "_" + type.parameterTypes.get(i).swiftType();
        }
        return augment;
    }
    static private String nameAugment(List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/>parameters, ArrayList<AbstractType> parameterTypes) {
        if(parameters == null) return "";
        String augment = "";
        for(int i = 0; i < parameters.size(); i++) {
            ParserRuleContext parameter = parameters.get(i);
            augment += "$" + parameterExternalName(parameter, i) + "_" + parameterTypes.get(i).swiftType();
        }
        return augment;
    }

    static public String functionName(ParserRuleContext ctx, FunctionType type) {
        String baseName =
            ctx instanceof SwiftParser.Function_declarationContext ? ((SwiftParser.Function_declarationContext)ctx).function_name().getText() :
            "init";
        return baseName + nameAugment(type);
    }

    static public ArrayList<AbstractType> parameterTypes(List<?extends ParserRuleContext> parameters, Visitor visitor) {
        ArrayList<AbstractType> parameterTypes = new ArrayList<AbstractType>();
        if(parameters == null) return parameterTypes;

        for(int i = 0; i < parameters.size(); i++) {
            ParserRuleContext parameter = parameters.get(i);
            AbstractType parameterType;
            if(parameter instanceof SwiftParser.ParameterContext && ((SwiftParser.ParameterContext)parameter).type_annotation() != null) {
                parameterType = Type.fromDefinition(((SwiftParser.ParameterContext)parameter).type_annotation().type(), visitor);
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

    static public String augmentFromCall(String swiftFunctionName, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/>parameters, ParserRuleContext ctx, NestedByIndexType lType, boolean isInitializer, Visitor visitor) {
        ArrayList<AbstractType> parameterTypes = parameterTypes(parameters, visitor);
        String defaultAugment = nameAugment(parameters, parameterTypes);
        String defaultFunctionName = isInitializer ? "init" : swiftFunctionName;
        Object function =
                lType != null ? lType.resulting(defaultFunctionName + defaultAugment) :
                visitor.cache.find(defaultFunctionName + defaultAugment, ctx);
        if(function != null) return defaultAugment;

        Map<String, FunctionType> candidates =
                lType != null ? lType.getFunctionTypesStartingWith(defaultFunctionName + defaultAugment) :
                visitor.cache.getFunctionTypesStartingWith(defaultFunctionName + defaultAugment, ctx);
        int numUsedParameters = parameters != null ? parameters.size() : 0;
        for(Map.Entry<String, FunctionType> iterator:candidates.entrySet()) {
            FunctionType functionType = iterator.getValue();
            if(numUsedParameters >= functionType.parameterTypes.size() - functionType.numParametersWithDefaultValue) return iterator.getKey().substring(defaultFunctionName.length());
        }

        Expression variadicFunction =
                lType != null ? lType.getFunctionEndingWithVariadic(defaultFunctionName + defaultAugment) :
                visitor.cache.getFunctionEndingWithVariadic(defaultFunctionName + defaultAugment, ctx) != null ? visitor.cache.getFunctionEndingWithVariadic(defaultFunctionName + defaultAugment, ctx).expression : null;
        if(variadicFunction != null) return variadicFunction.code.substring(defaultFunctionName.length());

        return null;
    }
    static public ArrayList<String> getVariadicNames(String varName) {
        String[] params = varName.split("\\$");
        ArrayList<String> variadicNames = new ArrayList<String>();
        if(params.length < 2) return variadicNames;

        for(int i = params.length - 1; i >= 1; i--) {

            String param = params[i];
            for(int j = i + 1; j < params.length; j++) if(!params[j].equals(param)) return variadicNames;

            String subVarName = "";
            for(int j = 0; j < i; j++) subVarName += (j > 0 ? "$" : "") + params[j];
            subVarName += "$_Array";

            variadicNames.add(subVarName);
            variadicNames.add(param);
        }
        return variadicNames;
    }

    static public String augmentFromCall(String swiftFunctionName, FunctionType type, ParserRuleContext ctx, Visitor visitor) {
        Map<String, EntityCache.CacheBlockAndObject> candidates = visitor.cache.getFunctionsStartingWith(swiftFunctionName, ctx);
        for(Map.Entry<String, EntityCache.CacheBlockAndObject> iterator:candidates.entrySet()) {
            EntityCache.CacheBlockAndObject cacheBlockAndObject = iterator.getValue();
            FunctionType functionType = (FunctionType)cacheBlockAndObject.object.type;
            if(functionType.sameAs(type)) return iterator.getKey().substring(swiftFunctionName.length());
        }
        return null;
    }

    static public boolean functionStartsWith(String name, AbstractType type, String varName) {
        return name.startsWith(varName) && type instanceof FunctionType && (name.length() == varName.length() || name.startsWith(varName + "$"));
    }

    static public String functionDeclaration(ParserRuleContext ctx, Visitor visitor) {
        FunctionType functionType = new FunctionType(ctx, visitor);
        boolean isInClass = ctx.parent != null && ctx.parent.parent instanceof SwiftParser.DeclarationsContext;

        return (
            (!isInClass ? "function " : "") +
            FunctionUtil.functionName(ctx, functionType) +
            "(" + visitor.visitChildren(parameterList(ctx)) + "):" +
            functionType.returnType.targetType(visitor.targetLanguage) +
            visitor.visit(codeBlockCtx(ctx))
        );
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

        return
            "(" + (parameterList != null ? visitor.visit(parameterList) : "") + ") => " + (
                statements == null || statements.getChildCount() == 0 ? "{}" :
                statements.getChildCount() == 1 ? visitor.visitChildren(statements) :
                "{" + visitor.visitChildren(statements) + "}"
            );
    }

    static public SwiftParser.Code_blockContext codeBlockCtx(ParserRuleContext ctx) {
        return ctx instanceof SwiftParser.Function_declarationContext ? ((SwiftParser.Function_declarationContext)ctx).function_body().code_block() :
               ((SwiftParser.Initializer_declarationContext)ctx).initializer_body().code_block();
    }
    static public SwiftParser.Parameter_listContext parameterList(ParserRuleContext ctx) {
        return ctx instanceof SwiftParser.Function_declarationContext ? ((SwiftParser.Function_declarationContext)ctx).function_signature().parameter_clauses().parameter_clause().parameter_list() :
               ((SwiftParser.Initializer_declarationContext)ctx).parameter_clause().parameter_list();
    }
}
