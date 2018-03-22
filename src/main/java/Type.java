import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

class Operator {
    public int priority;
    public Definition result;
    public Map<String, String> codeReplacement;
}

abstract class Definition {
    public String name;
    public List<String> generics;
    public Map<String, Boolean> cloneOnAssignmentReplacement;//ts->boolean, java->boolean
}

class ClassDefinition extends Definition {
    public Map<String, String> typeReplacement;//ts, java, javaProtocol(e.g. Map for HashMap) -- string with generics
    public Cache.CacheBlockAndObject superClass;
    public Map<String, Instance> properties;
    public ClassDefinition(String name, Cache.CacheBlockAndObject superClass, Map<String, Instance> properties, List<String> generics){ this.name = name; this.superClass = superClass; this.properties = properties; this.generics = generics; }
    public Map<String, Cache.CacheBlockAndObject> getAllProperties() {
        Map<String, Cache.CacheBlockAndObject> allProperties = new HashMap<String, Cache.CacheBlockAndObject>();
        ClassDefinition classDefinition = this;
        while(classDefinition != null) {
            for(Map.Entry<String, Instance> iterator:properties.entrySet()) {
                if(!allProperties.containsKey(iterator.getKey())) {
                    allProperties.put(iterator.getKey(), new Cache.CacheBlockAndObject(null, iterator.getValue()));
                }
            }
            Cache.CacheBlockAndObject superClass = classDefinition.superClass;
            classDefinition = superClass != null ? (ClassDefinition)superClass.object : null;
        }
        return allProperties;
    }
}

class FunctionDefinition extends Definition {
    public List<String> parameterExternalNames;
    public List<Instance> parameterTypes;
    public int numParametersWithDefaultValue = 0;
    public Instance result;
    public Map<String, String> codeReplacement;//ts->tsCode, java->javaCode; if you can, rather keep it in Property, but sometimes needed for top-level funcs
    public FunctionDefinition(String name, List<String> parameterExternalNames, List<Instance> parameterTypes, int numParametersWithDefaultValue, Instance result, List<String> generics){ this.name = name; this.parameterExternalNames = parameterExternalNames; this.parameterTypes = parameterTypes; this.numParametersWithDefaultValue = numParametersWithDefaultValue; this.result = result; this.generics = generics; }
    public FunctionDefinition(ParserRuleContext ctx, Visitor visitor) {
        List<SwiftParser.ParameterContext> parameters = FunctionUtil.parameters(ctx);

        this.parameterExternalNames = FunctionUtil.parameterExternalNames(parameters);
        this.parameterTypes = FunctionUtil.parameterTypes(parameters, visitor);
        this.numParametersWithDefaultValue = FunctionUtil.numParametersWithDefaultValue(parameters);
        this.name = FunctionUtil.functionName(ctx, parameterExternalNames, parameterTypes);

        this.result =
            ctx instanceof SwiftParser.Function_declarationContext ? TypeUtil.fromFunction(((SwiftParser.Function_declarationContext) ctx).function_signature().function_result(), ((SwiftParser.Function_declarationContext) ctx).function_body().code_block().statements(), false, visitor) :
            new Instance("Void", ctx, visitor.cache);
    }
}

class Instance {
    public Definition definition;
    public String genericDefinition;
    //declaration modifiers
    public boolean isOptional = false;
    public boolean isInout = false;
    public boolean isVariadicParameter = false;
    //class property modifiers
    public boolean isStatic = false;
    public boolean isOperator = false;
    public boolean isInitializer = false;
    public boolean isDefaultInitializer = false;
    public boolean isMemberwiseInitializer = false;
    public boolean isFailableInitializer = false;
    public boolean isGetterSetter = false;
    public Map<String, String> codeReplacement;//ts->tsCode, java->javaCode
    public Map<String, Instance> generics;
    //utils
    public String typeName() {
        //just definition name, e.g. dictionary
        return definition != null ? definition.name : genericDefinition;
    }
    public String uniqueId() {
        //something that will allow us to uniquely identify type, e.g. to figure out which overloaded function to use
        //TODO include scope if it's a name that's duplicated in the code
        return definition instanceof ClassDefinition ? definition.name != null ? definition.name : "any" : genericDefinition != null ? genericDefinition : "any";
    }
    public Instance withoutPropertyInfo() {
        Instance instance = new Instance(this.definition, this.genericDefinition, this.generics);
        instance.isOptional = isOptional;
        return instance;
    }
    public String targetType(String language) { return targetType(language, false, false); }
    public String targetType(String language, boolean notProtocol, boolean baseIfInout) {
        if(definition == null) return genericDefinition;
        String type = definition.name;
        if(definition instanceof ClassDefinition) {
            ClassDefinition classDefinition = (ClassDefinition)definition;
            while(classDefinition != null) {
                if(classDefinition.typeReplacement != null && classDefinition.typeReplacement.containsKey(language)) {
                    if(language.equals("java") && !notProtocol && classDefinition.typeReplacement.containsKey(language + "Protocol")) type = classDefinition.typeReplacement.get(language + "Protocol");
                    else type = classDefinition.typeReplacement.get(language);
                    if(generics != null) {
                        for(String key : generics.keySet()) type = type.replaceAll("#" + key, Matcher.quoteReplacement(generics.get(key).targetType(language, false, true)));
                    }
                    break;
                }
                Cache.CacheBlockAndObject superClass = classDefinition.superClass;
                classDefinition = superClass != null ? (ClassDefinition)superClass.object : null;
            }
        }
        if(type == null) type = "any";
        //TODO might be different based on specified generics too
        if(!isInout || baseIfInout) return type;
        return "{get: () => " + type + ", set: (val: " + type + ") => void}";
    }
    public Instance getProperty(String name) {
        ClassDefinition classDefinition = (ClassDefinition)definition;
        Instance property;
        do {
            property = classDefinition.properties.get(name);
            classDefinition = classDefinition.superClass != null ? (ClassDefinition)classDefinition.superClass.object : null;
        } while(property == null && classDefinition != null);
        if(property == null) return null;
        return specifyGenerics(property);
    }
    public Instance result() {
        Instance result = ((FunctionDefinition)definition).result;
        return specifyGenerics(result);
    }
    public Instance specifyGenerics(Instance instance) {
        if(instance.definition == null) {
            if(generics != null && generics.containsKey(instance.genericDefinition)) {
                instance.definition = generics.get(instance.genericDefinition).definition;
                instance.generics = generics.get(instance.genericDefinition).generics;
            }
        }
        else {
            instance.generics = generics;
        }
        return instance;
    }
    public Instance(String typeName, ParseTree ctx, Cache cache){
        Cache.CacheBlockAndObject definition = cache.find(typeName, ctx);
        if(definition != null) this.definition = (Definition)definition.object;
        else this.genericDefinition = typeName;
    }
    public Instance(Definition definition){ this.definition = definition; }
    private Instance(Definition definition, String genericDefinition, Map<String, Instance> generics){ this.definition = definition; this.genericDefinition = genericDefinition; this.generics = generics; }
}