import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

//loads in native data types (e.g. String, Array) and caches them as Definitions
public class TypeLoader {

    static public void load(EntityCache cache, SwiftParser.Top_levelContext topLevel) {
        InputStream is = Prefix.class.getResourceAsStream("types.json");
        String jsonTxt = null;
        JSONObject definitions = null;
        try { jsonTxt = IOUtils.toString(is); } catch(IOException e) {}
        try { definitions = new JSONObject(jsonTxt); } catch(JSONException e) {}

        for(int i = 0; i < definitions.names().length(); i++) {
            String className = definitions.names().optString(i);
            JSONObject src = definitions.optJSONObject(className);

            Definition definition = src.optBoolean("function") ? new FunctionDefinition() : new ClassDefinition();

            cache.cacheOne(className, definition, topLevel);
        }

        for(int i = 0; i < definitions.names().length(); i++) {
            String className = definitions.names().optString(i);
            JSONObject src = definitions.optJSONObject(className);

            Definition definition = cache.find(className, topLevel).object.definition;

            if(definition instanceof FunctionDefinition) parseFunction(className, (FunctionDefinition)definition, src, cache, topLevel, true);
            else parseClass(className, (ClassDefinition)definition, src, cache, topLevel);
        }
    }

    static private void parseClass(String className, ClassDefinition definition, JSONObject src, EntityCache cache, SwiftParser.Top_levelContext topLevel) {

        definition.name = className;

        if(src.optJSONArray("generics") != null) {
            definition.generics = new ArrayList<String>();
            for(int i = 0; i < src.optJSONArray("generics").length(); i++) {
                definition.generics.add(src.optJSONArray("generics").optString(i));
            }
        }

        if(src.optJSONObject("typeReplacement") != null) {
            definition.typeReplacement = new HashMap<String, String>();
            for(int i = 0; i < src.optJSONObject("typeReplacement").names().length(); i++) {
                String language = src.optJSONObject("typeReplacement").names().optString(i);
                definition.typeReplacement.put(language, src.optJSONObject("typeReplacement").optString(language));
            }
        }

        if(src.optJSONObject("cloneOnAssignmentReplacement") != null) {
            definition.cloneOnAssignmentReplacement = new HashMap<String, Boolean>();
            for(int i = 0; i < src.optJSONObject("cloneOnAssignmentReplacement").names().length(); i++) {
                String language = src.optJSONObject("cloneOnAssignmentReplacement").names().optString(i);
                definition.cloneOnAssignmentReplacement.put(language, src.optJSONObject("cloneOnAssignmentReplacement").optBoolean(language));
            }
        }

        for(int i = 0; i < src.optJSONArray("properties").length(); i++) {
            JSONObject propertySrc = src.optJSONArray("properties").optJSONObject(i);

            Property property = parseProperty(src);
            String name = src.optString("name");
            if(propertySrc.optBoolean("isFunction")) {
                FunctionDefinition functionDefinition = new FunctionDefinition();
                parseFunction(propertySrc.optString("name"), functionDefinition, propertySrc, cache, topLevel, false);
                property.definition = new DefinitionOrGeneric(functionDefinition);
                //TODO amend name
            }
            else {
                property.definition = getDefinition(propertySrc.optString("type"), cache, topLevel);
            }
            
            definition.properties.put(name, property);
        }
    }

    static private Property parseProperty(JSONObject src) {
        Property property = new Property();

        if(src.optJSONObject("codeReplacement") != null) {
            property.codeReplacement = new HashMap<String, String>();
            for(int i = 0; i < src.optJSONObject("codeReplacement").names().length(); i++) {
                String language = src.optJSONObject("codeReplacement").names().optString(i);
                property.codeReplacement.put(language, src.optJSONObject("codeReplacement").optString(language));
            }
        }

        //TODO property.isOperator = src.optBoolean("operator");
        property.isInitializer = src.optString("name").equals("init");

        return property;
    }

    static private void parseFunction(String className, FunctionDefinition definition, JSONObject src, EntityCache cache, SwiftParser.Top_levelContext topLevel, boolean isTopLevel) {

        definition.parameterExternalNames = new ArrayList<String>();
        definition.parameterTypes = new ArrayList<InstanceOrGeneric>();
        if(src.optJSONArray("parameters") != null) {
            for(int i = 0; i < src.optJSONArray("parameters").length(); i++) {
                JSONObject parameter = src.optJSONArray("parameters").optJSONObject(i);
                definition.parameterExternalNames.add(parameter.optString("externalName"));
                String parameterType = parameter.optString("type");
                definition.parameterTypes.add(getInstance(parameterType, cache, topLevel));
            }
        }

        definition.result = getInstance(src.optString("type"), cache, topLevel);

        if(src.optJSONObject("parameterReplacement") != null) {
            definition.parameterReplacement = new HashMap<String, ParameterReplacement>();
            for(int i = 0; i < src.optJSONObject("parameterReplacement").names().length(); i++) {
                String language = src.optJSONObject("parameterReplacement").names().optString(i);
                ParameterReplacement parameterReplacement = new ParameterReplacement();
                if(src.optJSONObject("parameterReplacement").optJSONObject(language).optJSONArray("order") != null) {
                    parameterReplacement.order = new ArrayList<Integer>();
                    for(int j = 0; j < src.optJSONObject("parameterReplacement").optJSONObject(language).optJSONArray("order").length(); j++) {
                        parameterReplacement.order.add(src.optJSONObject("parameterReplacement").optJSONObject(language).optJSONArray("order").optInt(i));
                    }
                }
                if(src.optJSONObject("parameterReplacement").optJSONObject(language).optJSONArray("default") != null) {
                    parameterReplacement.defaultValues = new ArrayList<String>();
                    parameterReplacement.defaultIndices = new ArrayList<Integer>();
                    for(int j = 0; j < src.optJSONObject("parameterReplacement").optJSONObject(language).optJSONArray("default").length(); j++) {
                        parameterReplacement.defaultValues.add(src.optJSONObject("parameterReplacement").optJSONObject(language).optJSONArray("default").optJSONObject(i).optString("value"));
                        parameterReplacement.defaultIndices.add(src.optJSONObject("parameterReplacement").optJSONObject(language).optJSONArray("default").optJSONObject(i).optInt("index"));
                    }
                }
                definition.parameterReplacement.put(language, parameterReplacement);
            }
        }

        if(src.optJSONObject("codeReplacement") != null && isTopLevel) {
            definition.codeReplacement = new HashMap<String, String>();
            for(int i = 0; i < src.optJSONObject("codeReplacement").names().length(); i++) {
                String language = src.optJSONObject("codeReplacement").names().optString(i);
                definition.codeReplacement.put(language, src.optJSONObject("codeReplacement").optString(language));
            }
        }
    }

    static private InstanceOrGeneric getInstance(String type, EntityCache cache, SwiftParser.Top_levelContext topLevel) {
        return type.contains("#") ? new InstanceOrGeneric(type) : new InstanceOrGeneric(cache.find(type, topLevel).object.instance);
    }
    static private DefinitionOrGeneric getDefinition(String type, EntityCache cache, SwiftParser.Top_levelContext topLevel) {
        return type.contains("#") ? new DefinitionOrGeneric(type) : new DefinitionOrGeneric(cache.find(type, topLevel).object.definition);
    }
}
