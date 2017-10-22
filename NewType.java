import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

class Operator {
    public int priority;
    public Definition result;
    public Map<String, String> codeReplacement;
}

abstract class Definition {
    public EntityCache.CacheBlockAndObject superClass;
    public String name;
    public List<String> generics;
    public Map<String, String> typeReplacement;//ts, java, javaProtocol(e.g. Map for HashMap) -- string with generics
    public Map<String, Boolean> cloneOnAssignmentReplacement;//ts->boolean, java->boolean
}

class ClassDefinition extends Definition {
    public Map<String, Property> properties = new LinkedHashMap<String, Property>();
}

class FunctionDefinition extends Definition {
    public List<String> parameterExternalNames;
    public List<InstanceOrGeneric> parameterTypes;
    public int numParametersWithDefaultValue = 0;
    public InstanceOrGeneric result;
    public Map<String, ParameterReplacement> parameterReplacement;
    public Map<String, String> codeReplacement;//ts->tsCode, java->javaCode; if you can, rather keep it in Property, but sometimes needed for top-level funcs
}

class ParameterReplacement {
    public List<Integer> order;
    public List<String> defaultValues;
    public List<Integer> defaultIndices;
}

class DefinitionOrGeneric {
    public Definition definition;
    public String generic;//can be e.g. [#T]
    DefinitionOrGeneric(Definition definition) {this.definition = definition;}
    DefinitionOrGeneric(String generic) {this.generic = generic;}
}
class InstanceOrGeneric {
    public Instance instance;
    public String generic;//can be e.g. [#T]
    InstanceOrGeneric(Instance instance) {this.instance = instance;}
    InstanceOrGeneric(String generic) {this.generic = generic;}
}

class Property {
    public DefinitionOrGeneric definition;//this might be a string actually - name/generic -- or 'ad-hoc definition' (e.g. function)
    public boolean isStatic = false;
    public boolean isOperator = false;
    public boolean isInitializer = false;
    public boolean isFailableInitializer = false;
    public boolean isGetterSetter = false;
    public Map<String, String> codeReplacement;//ts->tsCode, java->javaCode
}

class Instance {
    public Definition definition;
    public boolean isOptional = false;
    public boolean inout = false;
    public List<Instance> generics;
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
        }
        //TODO might be different based on specified generics too
        if(!inout || baseIfInout) return type;
        return "{get: () => " + type + ", set: (val: " + type + ") => void}";
    }
    //TODO probably should return Property & Instance (definition accounted for generics)
    public Instance getProperty(String name) {
        return ((ClassDefinition)definition).properties.get(name);
    }
}