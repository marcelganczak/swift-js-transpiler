import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

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

            Definition definition =
                    src.optBoolean("function") ? parseFunction(className, src, true, cache, topLevel) :
                    parseClass(className, src);

            cache.cacheOne(className, definition, topLevel);
        }

        for(int i = 0; i < definitions.names().length(); i++) {
            String className = definitions.names().optString(i);
            JSONObject src = definitions.optJSONObject(className);
            if(src.optBoolean("function")) continue;
            ClassDefinition definition = (ClassDefinition)cache.find(className, topLevel).object;

            if(src.optJSONArray("properties") == null) continue;
            for(int j = 0; j < src.optJSONArray("properties").length(); j++) {
                JSONObject propertySrc = src.optJSONArray("properties").optJSONObject(j);

                Instance property = parseProperty(propertySrc, cache, topLevel);
                String name = propertySrc.optString("name");

                definition.properties.put(name, property);
            }
        }
    }

    static private ClassDefinition parseClass(String className, JSONObject src) {

        ClassDefinition definition = new ClassDefinition(className, null, new LinkedHashMap<String, Instance>(), new ArrayList<String>());

        if(src.optJSONArray("generics") != null) {
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

        return definition;
    }

    static private Instance parseProperty(JSONObject src, EntityCache cache, SwiftParser.Top_levelContext topLevel) {

        Instance property;

        if(src.optBoolean("function")) {
            property = new Instance(parseFunction(src.optString("name"), src, false, cache, topLevel));
            //TODO amend name
        }
        else {
            property = parseType(src.optString("type"), cache, topLevel);
        }

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

    static private FunctionDefinition parseFunction(String name, JSONObject src, boolean isTopLevel, EntityCache cache, SwiftParser.Top_levelContext topLevel) {

        List<String> parameterExternalNames = new ArrayList<String>();
        List<Instance> parameterTypes = new ArrayList<Instance>();
        if(src.optJSONArray("parameters") != null) {
            for(int i = 0; i < src.optJSONArray("parameters").length(); i++) {
                JSONObject parameter = src.optJSONArray("parameters").optJSONObject(i);
                parameterExternalNames.add(parameter.optString("externalName"));
                String parameterType = parameter.optString("type");
                parameterTypes.add(new Instance(parameterType, topLevel, cache));
            }
        }

        FunctionDefinition definition = new FunctionDefinition(name, parameterExternalNames, parameterTypes, 0, parseType(src.optString("type"), cache, topLevel), null);

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

        return definition;
    }

    static private Instance parseType(String type, EntityCache cache, SwiftParser.Top_levelContext topLevel) {
        if(type.equals("")) return new Instance(type, topLevel, cache);

        SwiftLexer lexer = new SwiftLexer(new ANTLRInputStream("let a:" + type));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SwiftParser.TypeContext typeContext = new SwiftParser(tokens).top_level().statement(0).declaration().constant_declaration().constant_declaration_body().pattern_initializer_list().pattern_initializer(0).pattern().type_annotation().type();

        //setting typeContext's parent to topLevel, so that when we're bubbling up the tree in search of the class definition,
        //we arrive at the same topLevel that the cache uses
        typeContext.parent = topLevel;
        //TODO refactor so that we don't have to create a dummy Visitor
        return Type.fromDefinition(typeContext, new TranspilerVisitor(cache, null));
    }
}
