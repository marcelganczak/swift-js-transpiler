import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeBlockCache {

    class CacheObject {
        public String type;
        public String translateName;

        public CacheObject(String type, String translateName) {
            this.type = type;
            this.translateName = translateName;
        }
    }

    protected Map<ParseTree, Map<String, CacheObject>> cache = new HashMap<ParseTree, Map<String, CacheObject>>();

    protected ParseTree findNearestAncestorBlock(ParseTree node) {
        if(node.getParent() == null || node.getParent() == node) return null;
        node = node.getParent();
        boolean isBlock = node instanceof SwiftParser.Top_levelContext || node instanceof SwiftParser.Code_blockContext || node instanceof SwiftParser.Function_bodyContext;
        if(isBlock) return node;
        return findNearestAncestorBlock(node);
    }

    protected CacheObject findCache(String varName, ParseTree node) {
        varName = varName.trim();

        while((node = findNearestAncestorBlock(node)) != null) {
            Map<String, CacheObject> blockTypeCache = cache.get(node);
            if(blockTypeCache == null) continue;
            if(blockTypeCache.containsKey(varName)) return blockTypeCache.get(varName);
            if(node instanceof SwiftParser.Top_levelContext) return null;
        }
        return null;
    }

    public String getType(String varName, ParseTree node) {
        CacheObject cache = findCache(varName, node);
        if(cache == null) return null;
        return cache.type;
    }

    public String getTranslateName(String varName, ParseTree node) {
        CacheObject cache = findCache(varName, node);
        if(cache == null) return null;
        return cache.translateName;
    }

    public void cacheOne(String identifier, String type, String translateName, ParseTree ctx) {
        ParseTree nearestAncestorBlock = findNearestAncestorBlock(ctx);

        if(!cache.containsKey(nearestAncestorBlock)) {
            cache.put(nearestAncestorBlock, new HashMap<String, CacheObject>());
        }
        cache.get(nearestAncestorBlock).put(identifier, new CacheObject(type, translateName));
    }

    public void cacheInitializers(List<SwiftParser.Pattern_initializerContext> initializers) {
        int numInitializers = initializers.size();
        if(numInitializers == 0) return;

        String type;
        SwiftParser.Pattern_initializerContext lastInitializer = initializers.get(numInitializers - 1);
        if(lastInitializer.pattern().type_annotation() == null) {
            type = JsType.infer(lastInitializer.initializer().expression());
            if(type == null) return;
        }
        else {
            type = JsType.translate(lastInitializer.pattern().type_annotation().type());
        }

        for(int i = 0; i < numInitializers; i++) {
            String identifier = initializers.get(i).pattern().identifier_pattern().getText();
            System.out.println("Caching " + identifier + " as " + type);
            cacheOne(identifier, type, null, initializers.get(i));
        }
    }
}
