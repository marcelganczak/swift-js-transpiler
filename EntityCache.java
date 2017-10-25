import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class EntityCache {

    static class CacheBlockAndObject {
        public ParseTree block;
        public Object object;//Operator/Definition/Instance

        public CacheBlockAndObject(ParseTree block, Object object) {
            this.block = block;
            this.object = object;
        }
    }
    static class CacheBlockAndExpression {
        public ParseTree block;
        public Expression expression;

        public CacheBlockAndExpression(ParseTree block, Expression expression) {
            this.block = block;
            this.expression = expression;
        }
    }

    private Map<ParseTree, Map<String, Object>> cache = new HashMap<ParseTree, Map<String, Object>>();

    static public boolean isStructureBlock(ParseTree node) {
        return node instanceof SwiftParser.Class_bodyContext || node instanceof SwiftParser.Struct_bodyContext;
    }

    public ParseTree findNearestAncestorBlock(ParseTree node) {
        boolean isBlock =
                node instanceof SwiftParser.Top_levelContext ||
                node instanceof SwiftParser.Code_blockContext ||
                node instanceof SwiftParser.Closure_expressionContext ||
                isStructureBlock(node);
        if(isBlock) return node;
        if(node == null || node.getParent() == null || node.getParent() == node) return null;
        return findNearestAncestorBlock(node.getParent());
    }
    public ParseTree findNearestAncestorFunctionBlock(ParseTree node) {
        boolean isBlock =
                node instanceof SwiftParser.Top_levelContext ||
                node instanceof SwiftParser.Function_bodyContext ||
                node instanceof SwiftParser.Initializer_bodyContext;
        if(isBlock) return node;
        if(node == null || node.getParent() == null || node.getParent() == node) return null;
        return findNearestAncestorFunctionBlock(node.getParent());
    }

    public CacheBlockAndObject findNearestAncestorStructure(ParseTree node) {
        if(isStructureBlock(node)) return getClassDefinition(node);
        if(node == null || node.getParent() == null || node.getParent() == node) return null;
        return findNearestAncestorStructure(node.getParent());
    }

    public CacheBlockAndObject getClassDefinition(ParseTree block) {
        if(block instanceof SwiftParser.Class_bodyContext) {
            SwiftParser.Class_declarationContext classDeclaration = (SwiftParser.Class_declarationContext)((SwiftParser.Class_bodyContext)block).parent;
            String className = classDeclaration.class_name().getText();
            return find(className, classDeclaration);
        }
        else {
            SwiftParser.Struct_declarationContext structDeclaration = (SwiftParser.Struct_declarationContext)((SwiftParser.Struct_bodyContext)block).parent;
            String className = structDeclaration.struct_name().getText();
            return find(className, structDeclaration);
        }
    }

    public CacheBlockAndObject find(String varName, ParseTree node) {
        varName = varName.trim();

        do {
            Map<String, Object> blockTypeCache = cache.get(node);
            if(blockTypeCache == null) continue;
            if(blockTypeCache.containsKey(varName)) return new CacheBlockAndObject(node, blockTypeCache.get(varName));
            if(node instanceof SwiftParser.Top_levelContext) break;
        }
        while((node = findNearestAncestorBlock(node.getParent())) != null);

        return null;
    }

    public CacheBlockAndObject findLoose(String varName, ParseTree node) {

        if(varName.equals("self")) return findNearestAncestorStructure(node);

        if(varName.equals("super")) return ((ClassDefinition)findNearestAncestorStructure(node).object).superClass;

        CacheBlockAndObject blockAndObject = find(varName, node);

        if(blockAndObject == null) {
            Map<String, CacheBlockAndObject> allProperties = getAllTypes(node);
            Map<String, CacheBlockAndObject> candidates = FunctionUtil.getFunctionTypesStartingWith(varName, allProperties);
            if(candidates.size() == 0) {
                CacheBlockAndExpression variadicFunction = FunctionUtil.getFunctionEndingWithVariadic(varName, allProperties);
                if(variadicFunction == null) return null;
                return new CacheBlockAndObject(variadicFunction.block, variadicFunction.expression.type);
            }
            if(candidates.size() > 1) System.out.println("//Found more than 1 candidate for " + varName);
            return candidates.get(candidates.keySet().toArray()[0]);
        }

        return blockAndObject;
    }

    public Map<String, CacheBlockAndObject> getAllTypes(ParseTree node) {
        Map<String, CacheBlockAndObject> allTypes = new HashMap<String, CacheBlockAndObject>();

        while((node = findNearestAncestorBlock(node.getParent())) != null) {
            Map<String, Object> blockTypeCache = cache.get(node);
            if(blockTypeCache == null) continue;
            for(Map.Entry<String, Object> iterator:blockTypeCache.entrySet()) {
                if(allTypes.containsKey(iterator.getKey())) continue;
                allTypes.put(iterator.getKey(), new CacheBlockAndObject(node, iterator.getValue()));
            }
            if(node instanceof SwiftParser.Top_levelContext) break;
        }
        return allTypes;
    }

    public void cacheOne(String identifier, Object object/*Operator/Definition/Instance*/, ParseTree ctx) {
        //System.out.println("Caching " + identifier + " as " + object.uniqueId());

        ParseTree nearestAncestorBlock = findNearestAncestorBlock(ctx);

        if(isStructureBlock(nearestAncestorBlock)) {
            //save the variable under class definition too
            CacheBlockAndObject classDefinition = getClassDefinition(nearestAncestorBlock);
            ((ClassDefinition)classDefinition.object).properties.put(identifier, (Instance) object);
        }

        if(!cache.containsKey(nearestAncestorBlock)) {
            cache.put(nearestAncestorBlock, new HashMap<String, Object>());
        }
        cache.get(nearestAncestorBlock).put(identifier, object);
    }
}
