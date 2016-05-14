import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

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
            if(node instanceof SwiftParser.Top_levelContext) break;
        }
        return null;
    }

    public AbstractType getType(String varName, ParseTree node) {
        CacheObject cache = findCache(varName, node);
        if(cache == null) {
            Map<String, FunctionType> candidates = getFunctionTypesStartingWith(varName, node);
            if(candidates.size() == 0) {
                Expression variadicFunction = getFunctionTypeEndingWithVariadic(varName, node);
                if(variadicFunction == null) return null;
                return variadicFunction.type;
            }
            if(candidates.size() > 1) System.out.println("//Found more than 1 candidate for " + varName);
            return candidates.get(candidates.keySet().toArray()[0]);
        }
        return cache.type;
    }
    public AbstractType getTypeStrict(String varName, ParseTree node) {
        CacheObject cache = findCache(varName, node);
        return cache != null ? cache.type : null;
    }

    public Map<String, FunctionType> getFunctionTypesStartingWith(String varName, ParseTree node) {
        Map<String, FunctionType> matches = new HashMap<String, FunctionType>();
        varName = varName.trim();

        while((node = findNearestAncestorBlock(node.getParent())) != null) {
            Map<String, CacheObject> blockTypeCache = cache.get(node);
            if(blockTypeCache == null) continue;
            for(Map.Entry<String, CacheObject> iterator:blockTypeCache.entrySet()) {
                if(iterator.getKey().startsWith(varName) && iterator.getValue().type instanceof FunctionType && (iterator.getKey().length() == varName.length() || iterator.getKey().startsWith(varName + "$"))) {
                    matches.put(iterator.getKey(), (FunctionType)iterator.getValue().type);
                }
            }
            if(node instanceof SwiftParser.Top_levelContext) break;
        }
        return matches;
    }

    public Expression getFunctionTypeEndingWithVariadic(String varName, ParseTree node) {
        String[] params = varName.split("\\$");
        if(params.length < 2) return null;

        for(int i = params.length - 1; i >= 1; i--) {

            String param = params[i];
            for(int j = i + 1; j < params.length; j++) if(!params[j].equals(param)) return null;

            String subVarName = "";
            for(int j = 0; j < i; j++) subVarName += (j > 0 ? "$" : "") + params[j];
            subVarName += "$_Array";
            CacheObject cache = findCache(subVarName, node);
            if(cache != null && cache.type instanceof FunctionType) {
                List<AbstractType> parameterTypes = ((FunctionType)cache.type).parameterTypes;
                if(!parameterTypes.get(parameterTypes.size() - 1).resulting(null).swiftType().equals(param.split("_")[1])) continue;
                return new Expression(subVarName, cache.type);
            }
        }
        return null;
    }

    public void cacheOne(String identifier, AbstractType type, ParseTree ctx) {
        //System.out.println("Caching " + identifier + " as " + type.swiftType());

        ParseTree nearestAncestorBlock = findNearestAncestorBlock(ctx);

        if(!cache.containsKey(nearestAncestorBlock)) {
            cache.put(nearestAncestorBlock, new HashMap<String, CacheObject>());
        }
        cache.get(nearestAncestorBlock).put(identifier, new CacheObject(type));
    }
}
