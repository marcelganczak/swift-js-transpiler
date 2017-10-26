import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class OperatorLoader {

    static public void load(Cache cache, SwiftParser.Top_levelContext topLevel) {
        InputStream is = Prefix.class.getResourceAsStream("operators.json");
        String jsonTxt = null;
        JSONObject definitions = null;
        try { jsonTxt = IOUtils.toString(is); } catch(IOException e) {}
        try { definitions = new JSONObject(jsonTxt); } catch(JSONException e) {}

        for(int i = 0; i < definitions.names().length(); i++) {
            String operator = definitions.names().optString(i);
            JSONObject src = definitions.optJSONObject(operator);

            Operator definition = parseDefinition(src, cache, topLevel);

            cache.cacheOne(operator, definition, topLevel);
        }
    }

    static private Operator parseDefinition(JSONObject src, Cache cache, SwiftParser.Top_levelContext topLevel) {
        Operator definition = new Operator();

        definition.priority = src.optInt("priority");

        if(src.has("result")) {
            definition.result = (Definition)cache.find(src.optString("result"), topLevel).object;
        }

        if(src.optJSONObject("codeReplacement") != null) {
            definition.codeReplacement = new HashMap<String, String>();
            for(int i = 0; i < src.optJSONObject("codeReplacement").names().length(); i++) {
                String language = src.optJSONObject("codeReplacement").names().optString(i);
                definition.codeReplacement.put(language, src.optJSONObject("codeReplacement").optString(language));
            }
        }

        return definition;
    }
}
