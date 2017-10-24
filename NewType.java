import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.LinkedHashMap;
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
            new Instance("Void");
    }
}

class ParameterReplacement {
    public List<Integer> order;
    public List<String> defaultValues;
    public List<Integer> defaultIndices;
}

class Instance {
    public String typeName;//this might be a string - name/generic
    public Definition definition;//or an 'ad-hoc definition' (e.g. function)
    //declaration modifiers
    public boolean isOptional = false;
    public boolean isInout = false;
    //class property modifiers
    public boolean isMethod = false;
    public boolean isStatic = false;
    public boolean isOperator = false;
    public boolean isInitializer = false;
    public boolean isMemberwiseInitializer = false;
    public boolean isFailableInitializer = false;
    public boolean isGetterSetter = false;
    public Map<String, String> codeReplacement;//ts->tsCode, java->javaCode
    public List<Instance> generics;
    //utils
    public Definition definition() {
        //TODO if declaration.typeName, find name in cache (and compute according to generics)
        return definition;
    }
    public String uniqueId() {
        //TODO something that will allow us to uniquely identify type, e.g. to figure out which overloaded function to use
        //TODO include scope if it's a name that's duplicated in the code
        return definition().name;
    }
    public Instance copy() {
        //TODO
        return this;
    }
    public String targetType(String language) { return targetType(language, false, false); }
    public String targetType(String language, boolean notProtocol) { return targetType(language, notProtocol, false); }
    public String targetType(String language, boolean notProtocol, boolean baseIfInout) {
        String type = definition().name;
        if(definition().typeReplacement != null && definition().typeReplacement.containsKey(language)) {
            if(language.equals("java") && !notProtocol && definition().typeReplacement.containsKey(language + "Protocol")) type = definition().typeReplacement.get(language + "Protocol");
            else type = definition().typeReplacement.get(language);
        }
        //TODO might be different based on specified generics too
        if(!isInout || baseIfInout) return type;
        return "{get: () => " + type + ", set: (val: " + type + ") => void}";
    }
    //TODO probably should return Property & Instance (definition() accounted for generics)
    public Instance getProperty(String name) {
        return ((ClassDefinition)definition()).properties.get(name);
    }
    public Instance(String typeName){ this.typeName = typeName; }
    public Instance(Definition definition){ this.definition = definition; }
}