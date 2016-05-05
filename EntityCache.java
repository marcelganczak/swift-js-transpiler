import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityCache {

    class CacheObject {
        public AbstractType type;

        public CacheObject(AbstractType type) {
            this.type = type;
        }
    }

    private Map<ParseTree, Map<String, CacheObject>> cache = new HashMap<ParseTree, Map<String, CacheObject>>();

    private ParseTree findNearestAncestorBlock(ParseTree node) {
        boolean isBlock = node instanceof SwiftParser.Top_levelContext || node instanceof SwiftParser.Code_blockContext || node instanceof SwiftParser.Closure_expressionContext;
        if(isBlock) return node;
        if(node == null || node.getParent() == null || node.getParent() == node) return null;
        return findNearestAncestorBlock(node.getParent());
    }

    private CacheObject findCache(String varName, ParseTree node) {
        varName = varName.trim();

        while((node = findNearestAncestorBlock(node.getParent())) != null) {
            Map<String, CacheObject> blockTypeCache = cache.get(node);
            if(blockTypeCache == null) continue;
            if(blockTypeCache.containsKey(varName)) return blockTypeCache.get(varName);
            if(node instanceof SwiftParser.Top_levelContext) return null;
        }
        return null;
    }

    public AbstractType getType(String varName, ParseTree node) {
        CacheObject cache = findCache(varName, node);
        if(cache == null) return null;
        return cache.type;
    }

    public void cacheOne(String identifier, AbstractType type, ParseTree ctx) {
        //System.out.println("Caching " + identifier + " as " + type);

        ParseTree nearestAncestorBlock = findNearestAncestorBlock(ctx);

        if(!cache.containsKey(nearestAncestorBlock)) {
            cache.put(nearestAncestorBlock, new HashMap<String, CacheObject>());
        }
        cache.get(nearestAncestorBlock).put(identifier, new CacheObject(type));
    }
}
