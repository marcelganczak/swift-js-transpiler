import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.Map;

class Operator {
    public int priority;
    public Definition result;
    public Map<String, String> codeReplacement;
}

abstract class Definition {
    public String name;
    public List<String> generics;
    public Map<String, String> typeReplacement;//ts, java, javaProtocol(e.g. Map for HashMap) -- string with generics
    public Map<String, Boolean> cloneOnAssignmentReplacement;//ts->boolean, java->boolean
}

class ClassDefinition extends Definition {
    public EntityCache.CacheBlockAndObject superClass;
    public Map<String, Instance> properties;
    public ClassDefinition(String name, EntityCache.CacheBlockAndObject superClass, Map<String, Instance> properties, List<String> generics){ this.name = name; this.superClass = superClass; this.properties = properties; this.generics = generics; }
}

class FunctionDefinition extends Definition {
    public List<String> parameterExternalNames;
    public List<Instance> parameterTypes;
    public int numParametersWithDefaultValue = 0;
    public Instance result;
    public Map<String, ParameterReplacement> parameterReplacement;
    public Map<String, String> codeReplacement;//ts->tsCode, java->javaCode; if you can, rather keep it in Property, but sometimes needed for top-level funcs
    public FunctionDefinition(String name, List<String> parameterExternalNames, List<Instance> parameterTypes, int numParametersWithDefaultValue, Instance result, List<String> generics){ this.name = name; this.parameterExternalNames = parameterExternalNames; this.parameterTypes = parameterTypes; this.numParametersWithDefaultValue = numParametersWithDefaultValue; this.result = result; this.generics = generics; }
    public FunctionDefinition(ParserRuleContext ctx, Visitor visitor) {
        List<SwiftParser.ParameterContext> parameters = FunctionUtil.parameters(ctx);

        this.parameterExternalNames = FunctionUtil.parameterExternalNames(parameters);
        this.parameterTypes = FunctionUtil.parameterTypes(parameters, visitor);
        this.numParametersWithDefaultValue = FunctionUtil.numParametersWithDefaultValue(parameters);
        this.name = FunctionUtil.functionName(ctx, parameterExternalNames, parameterTypes);

        this.result =
            ctx instanceof SwiftParser.Function_declarationContext ? Type.fromFunction(((SwiftParser.Function_declarationContext)ctx).function_signature().function_result(), ((SwiftParser.Function_declarationContext)ctx).function_body().code_block().statements(), false, visitor) :
            new Instance("Void", ctx, visitor.cache);
    }
}

class ParameterReplacement {
    public List<Integer> order;
    public List<String> defaultValues;
    public List<Integer> defaultIndices;
}

class Instance {
    public Definition definition;
    public String genericDefinition;
    //declaration modifiers
    public boolean isOptional = false;
    public boolean isInout = false;
    //class property modifiers
    public boolean isStatic = false;
    public boolean isOperator = false;
    public boolean isInitializer = false;
    public boolean isMemberwiseInitializer = false;
    public boolean isFailableInitializer = false;
    public boolean isGetterSetter = false;
    public Map<String, String> codeReplacement;//ts->tsCode, java->javaCode
    public Map<String, Instance> generics;
    //utils
    public String typeName() {
        //just definition name, e.g. dictionary
        return definition.name;
    }
    public String uniqueId() {
        //TODO something that will allow us to uniquely identify type, e.g. to figure out which overloaded function to use
        //TODO include scope if it's a name that's duplicated in the code
        return definition.name;
    }
    public Instance copy() {
        //TODO
        return this;
    }
    public String targetType(String language) { return targetType(language, false, false); }
    public String targetType(String language, boolean notProtocol) { return targetType(language, notProtocol, false); }
    public String targetType(String language, boolean notProtocol, boolean baseIfInout) {
        String type = definition.name;
        if(definition.typeReplacement != null && definition.typeReplacement.containsKey(language)) {
            if(language.equals("java") && !notProtocol && definition.typeReplacement.containsKey(language + "Protocol")) type = definition.typeReplacement.get(language + "Protocol");
            else type = definition.typeReplacement.get(language);
            if(generics != null) {
                for(String key : generics.keySet()) type = type.replaceAll("#" + key, generics.get(key).targetType(language, false, true));
            }
        }
        //TODO might be different based on specified generics too
        if(!isInout || baseIfInout) return type;
        return "{get: () => " + type + ", set: (val: " + type + ") => void}";
    }
    public Instance getProperty(String name) {
        //TODO probably should return Property & Instance
        Instance property = ((ClassDefinition)definition).properties.get(name);
        return specifyGenerics(property);
    }
    public Instance result() {
        Instance result = ((FunctionDefinition)definition).result;
        return specifyGenerics(result);
    }
    private Instance specifyGenerics(Instance instance) {
        if(instance.definition == null) {
            instance.definition = generics.get(instance.genericDefinition).definition;
        }
        else {
            instance.generics = generics;
        }
        return instance;
    }
    public Instance(String typeName, ParseTree ctx, EntityCache cache){
        EntityCache.CacheBlockAndObject definition = cache.find(typeName, ctx);
        if(definition != null) this.definition = (Definition)definition.object;
        else this.genericDefinition = typeName;
    }
    public Instance(Definition definition){ this.definition = definition; }
}