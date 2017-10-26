import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
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

    static public String nameAugment(List<String> parameterExternalNames, List<Instance> parameterTypes) {
        String augment = "";
        for(int i = 0; i < parameterTypes.size(); i++) {
            augment += "$" + parameterExternalNames.get(i) + "_" + parameterTypes.get(i).uniqueId();
        }
        return augment;
    }

    static public String functionName(ParserRuleContext ctx, List<String> parameterExternalNames, List<Instance> parameterTypes) {
        String baseName =
            ctx instanceof SwiftParser.Function_declarationContext ? ((SwiftParser.Function_declarationContext)ctx).function_name().getText() :
            "init";
        return baseName + nameAugment(parameterExternalNames, parameterTypes);
    }

    static public ArrayList<Instance> parameterTypes(List<?extends ParserRuleContext> parameters, Visitor visitor) {
        ArrayList<Instance> parameterTypes = new ArrayList<Instance>();
        if(parameters == null) return parameterTypes;

        for(int i = 0; i < parameters.size(); i++) {
            ParserRuleContext parameter = parameters.get(i);
            Instance parameterType;
            if(parameter instanceof SwiftParser.ParameterContext && ((SwiftParser.ParameterContext)parameter).type_annotation() != null) {
                parameterType = TypeUtil.fromDefinition(((SwiftParser.ParameterContext) parameter).type_annotation().type(), visitor);
            }
            else {
                parameterType = TypeUtil.infer(parameter instanceof SwiftParser.ParameterContext ? ((SwiftParser.ParameterContext) parameter).default_argument_clause().expression() : ((SwiftParser.Expression_elementContext) parameter).expression(), visitor);
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

    static public Map<String, Cache.CacheBlockAndObject> getFunctionTypesStartingWith(String varName, Map<String, Cache.CacheBlockAndObject> allProperties) {
        Map<String, Cache.CacheBlockAndObject> matches = new HashMap<String, Cache.CacheBlockAndObject>();
        varName = varName.trim();

        for(Map.Entry<String, Cache.CacheBlockAndObject> iterator:allProperties.entrySet()) {
            boolean passes = (
                (iterator.getValue().object instanceof Instance && ((Instance) iterator.getValue().object).definition instanceof FunctionDefinition) ||
                iterator.getValue().object instanceof FunctionDefinition
            ) && functionStartsWith(iterator.getKey(), varName);
            if(passes) {
                matches.put(iterator.getKey(), iterator.getValue());
            }
        }
        return matches;
    }
    static public Cache.CacheBlockAndExpression getFunctionEndingWithVariadic(String varName, Map<String, Cache.CacheBlockAndObject> allProperties) {
        ArrayList<String> variadicNames = FunctionUtil.getVariadicNames(varName);
        for(int i = 0; i < variadicNames.size(); i+=2) {
            Cache.CacheBlockAndObject resulting = allProperties.get(variadicNames.get(i));
            if(resulting != null && resulting.object instanceof Instance && ((Instance)resulting.object).definition instanceof FunctionDefinition) {
                List<Instance> parameterTypes = ((FunctionDefinition)((Instance)resulting.object).definition).parameterTypes;
                if(!parameterTypes.get(parameterTypes.size() - 1)/*.resulting(null)*/.uniqueId().equals(variadicNames.get(i + 1).split("_")[1])) continue;
                return new Cache.CacheBlockAndExpression(resulting.block, new Expression(variadicNames.get(i), (Instance)resulting.object));
            }
        }
        return null;
    }

    static public String augmentFromCall(String swiftFunctionName, List<Instance> parameterTypes, List<String> parameterExternalNames, ParseTree ctx, ClassDefinition classDefinition, Instance lType, boolean isInitializer, Visitor visitor) {

        String defaultFunctionName = isInitializer ? "init" : swiftFunctionName;

        Map<String, Cache.CacheBlockAndObject> allProperties;
        if(classDefinition != null) {
            allProperties = new HashMap<String, Cache.CacheBlockAndObject>();
            for(Map.Entry<String, Instance> iterator:classDefinition.properties.entrySet()) {
                allProperties.put(iterator.getKey(), new Cache.CacheBlockAndObject(null, iterator.getValue()));
            }
        }
        else allProperties = visitor.cache.getAllTypes(ctx);

        Map<String, Cache.CacheBlockAndObject> candidates = getFunctionTypesStartingWith(defaultFunctionName, allProperties);
        for(Map.Entry<String, Cache.CacheBlockAndObject> iterator:candidates.entrySet()) {
            FunctionDefinition functionType =
                iterator.getValue().object instanceof FunctionDefinition ? (FunctionDefinition)iterator.getValue().object :
                (FunctionDefinition)((Instance)iterator.getValue().object).definition;
            boolean parametersMatch = true;
            Instance lastParameterType = functionType.parameterTypes.size() > 0 ? functionType.parameterTypes.get(functionType.parameterTypes.size() - 1) : null;
            for(int i = 0; i < parameterTypes.size() && parametersMatch; i++) {
                Instance expectedParameterType;
                String expectedParameterExternalName;
                if(lastParameterType != null && lastParameterType.isVariadicParameter && i >= functionType.parameterTypes.size() - 1) {
                    expectedParameterType = lastParameterType.generics.get("Value");
                    expectedParameterExternalName = "";
                }
                else {
                    if(i >= functionType.parameterExternalNames.size()){ parametersMatch = false; break; }
                    expectedParameterExternalName = functionType.parameterExternalNames.get(i);
                    expectedParameterType = functionType.parameterTypes.get(i);
                }
                if(
                    !expectedParameterExternalName.equals(parameterExternalNames.get(i)) || (
                        //if parameter is of known type, compare its uniqueId with supplied parameter's uniqueId
                        expectedParameterType.definition != null ? !expectedParameterType.uniqueId().equals(parameterTypes.get(i).uniqueId()) :
                        //if parameter is of a generic type, check if our lType has that generic defined and then compare that definition's uniqueId
                        !lType.generics.get(expectedParameterType.genericDefinition).uniqueId().equals(parameterTypes.get(i).uniqueId())
                    )
                ) parametersMatch = false;
            }
            if(!parametersMatch) continue;
            if(parameterTypes.size() >= functionType.parameterTypes.size() - functionType.numParametersWithDefaultValue) return iterator.getKey().substring(defaultFunctionName.length());
        }

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

    static public String augmentFromCall(String swiftFunctionName, FunctionDefinition type, ParserRuleContext ctx, Visitor visitor) {
        Map<String, Cache.CacheBlockAndObject> candidates = getFunctionTypesStartingWith(swiftFunctionName, visitor.cache.getAllTypes(ctx));
        for(Map.Entry<String, Cache.CacheBlockAndObject> iterator:candidates.entrySet()) {
            FunctionDefinition functionType = (FunctionDefinition)((Instance)iterator.getValue().object).definition;
            if(identicalSignatures(functionType, type)) return iterator.getKey().substring(swiftFunctionName.length());
        }
        return null;
    }

    static private boolean identicalSignatures(FunctionDefinition a, FunctionDefinition b) {
        if(a.parameterTypes.size() != b.parameterTypes.size()) return false;
        if(!a.result.uniqueId().equals(b.result.uniqueId())) return false;
        for(int i = 0; i < a.parameterTypes.size(); i++) if(!a.parameterTypes.get(i).uniqueId().equals(b.parameterTypes.get(i).uniqueId())) return false;
        return true;
    }

    static public boolean functionStartsWith(String name, String varName) {
        return name.startsWith(varName) && (name.length() == varName.length() || name.startsWith(varName + "$"));
    }

    static public String functionDeclaration(ParserRuleContext ctx, Visitor visitor) {
        FunctionDefinition functionDefinition = new FunctionDefinition(ctx, visitor);
        boolean isInClass = ctx.parent != null && ctx.parent.parent instanceof SwiftParser.DeclarationsContext;

        return (
            (!isInClass ? "function " : "") +
            FunctionUtil.functionName(ctx, functionDefinition.parameterExternalNames, functionDefinition.parameterTypes) +
            "(" + visitor.visitChildren(parameterList(ctx)) + "):" +
                functionDefinition.result.targetType(visitor.targetLanguage) +
            visitor.visit(codeBlockCtx(ctx))
        );
    }

    static public String closureExpression(SwiftParser.Closure_expressionContext ctx, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {
        String closureExpression = "";
        if(ctx.operator() != null) {
            closureExpression = "(a, b) => a " + ctx.operator().getText() + " b";
        }
        else if(ctx.explicit_closure_expression() != null) {
            closureExpression = explicitClosureExpression(ctx.explicit_closure_expression(), functionCallParams == null ? type : null, visitor);
        }
        if(functionCallParams != null) {
            closureExpression = "(" + closureExpression + ")(";
            for(int i = 0; i < functionCallParams.size(); i++) {
                closureExpression += (i > 0 ? ", " : "") + visitor.visit(functionCallParams.get(i));
            }
            closureExpression += ")";
        }
        return closureExpression;
    }

    static public String explicitClosureExpression(SwiftParser.Explicit_closure_expressionContext ctx, Instance type, Visitor visitor) {
        if(type != null && type.definition instanceof FunctionDefinition) {
            FunctionDefinition functionType = (FunctionDefinition)type.definition;
            for(int i = 0; i < functionType.parameterTypes.size(); i++) {
                visitor.cache.cacheOne("$" + i, functionType.parameterTypes.get(i), ctx);
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
