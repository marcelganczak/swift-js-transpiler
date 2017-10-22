import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

class BasicType extends Instance {
    private String sourceType;
    public BasicType(String sourceType) {
        this.sourceType = sourceType;
        this.isOptional = false;
    }
    public BasicType(String sourceType, boolean isOptional, String isGetterSetter) {
        this.sourceType = sourceType;
        this.isOptional = isOptional;
    }
    public String uniqueId() {
        return sourceType;
    }
    public String targetType(String language, boolean notGeneric) {
        return language.equals("ts") ? Type.basicToTs(sourceType) : Type.basicToJava(sourceType);
    }
    public Instance copy() {
        return new BasicType(this.sourceType, this.isOptional, null);
    }
}
class FunctionType extends Instance {
    public ArrayList<String> parameterExternalNames;
    public ArrayList<Instance> parameterTypes;
    public int numParametersWithDefaultValue;
    public Instance returnType;
    public boolean isInitializer;
    public boolean isFailableInitializer;
    public FunctionType(ParserRuleContext ctx, Visitor visitor) {
        List<SwiftParser.ParameterContext> parameters = FunctionUtil.parameters(ctx);

        parameterTypes = FunctionUtil.parameterTypes(parameters, visitor);
        parameterExternalNames = FunctionUtil.parameterExternalNames(parameters);
        numParametersWithDefaultValue = FunctionUtil.numParametersWithDefaultValue(parameters);

        returnType =
            ctx instanceof SwiftParser.Function_declarationContext ? Type.fromFunction(((SwiftParser.Function_declarationContext)ctx).function_signature().function_result(), ((SwiftParser.Function_declarationContext)ctx).function_body().code_block().statements(), false, visitor) :
            new BasicType("Void");

        isInitializer = ctx instanceof SwiftParser.Initializer_declarationContext;
        isFailableInitializer = isInitializer && ((SwiftParser.Initializer_declarationContext)ctx).initializer_head().getText().contains("?");
    }
    public FunctionType(ArrayList<String> parameterExternalNames, ArrayList<Instance> parameterTypes, int numParametersWithDefaultValue, Instance returnType, String isGetterSetter, boolean isInitializer, boolean isFailableInitializer) {
        this.parameterExternalNames = parameterExternalNames;
        this.parameterTypes = parameterTypes;
        this.numParametersWithDefaultValue = numParametersWithDefaultValue;
        this.returnType = returnType;
        this.isInitializer = isInitializer;
        this.isFailableInitializer = isFailableInitializer;
    }
    public String uniqueId() {
        return "Function";
    }
    public String targetType(String language, boolean notGeneric) {
        return language.equals("ts") ? "Function" : "TODO";
    }
    public Instance copy() {
        return new FunctionType(this.parameterExternalNames, this.parameterTypes, this.numParametersWithDefaultValue, this.returnType, null, this.isInitializer, this.isFailableInitializer);
    }
    public boolean sameAs(FunctionType otherType) {
        if(parameterTypes.size() != otherType.parameterTypes.size()) return false;
        if(!returnType.uniqueId().equals(otherType.returnType.uniqueId())) return false;
        for(int i = 0; i < parameterTypes.size(); i++) if(!parameterTypes.get(i).uniqueId().equals(otherType.parameterTypes.get(i).uniqueId())) return false;
        return true;
    }
}
class NestedType extends Instance {
    private String wrapperType;//Dictionary/Array/Set
    public Instance keyType;
    public Instance valueType;
    public NestedType(String wrapperType, Instance keyType, Instance valueType, boolean isOptional, String isGetterSetter) {
        this.wrapperType = wrapperType;
        this.keyType = keyType;
        this.valueType = valueType;
        this.isOptional = isOptional;
    }
    public String uniqueId() {
        return wrapperType;
    }
    public String targetType(String language, boolean notGeneric) {
        if(language.equals("ts")) {
            return
                wrapperType.equals("Dictionary") ? "Object" :
                wrapperType.equals("Array") ? "Array<" + valueType.targetType("ts") + ">" :
                "Set<" + valueType.targetType("ts") + ">";
        }
        else {
            return
                wrapperType.equals("Dictionary") ? (notGeneric ? "InitializableHashMap" : "Map") + "<" + keyType.targetType("java") + ", " + valueType.targetType("java") + ">" :
                wrapperType.equals("Array") ? (notGeneric ? "ArrayList" : "List") + "<" + valueType.targetType("java") + ">" :
                (notGeneric ? "HashSet" : "Set") + "<" + valueType.targetType("java") + ">";
        }
    }
    public Instance copy() {
        return new NestedType(wrapperType, keyType, valueType, isOptional, null);
    }
}
class NestedByIndexType extends Instance {
    public LinkedHashMap<String, Instance> hash;
    public String structureType;
    public String definitionName;
    public EntityCache.CacheBlockAndObject superClass;
    public boolean isInstance;
    public String memberwiseInitializer;
    public NestedByIndexType(LinkedHashMap<String, Instance> hash, String structureType, String definitionName, EntityCache.CacheBlockAndObject superClass, boolean isInstance, String isGetterSetter) {
        this.hash = hash;
        this.structureType = structureType;
        this.definitionName = definitionName;
        this.superClass = superClass;
        this.isInstance = isInstance;
        memberwiseInitializer = null;
    }
    public void put(String key, Instance type) {
        hash.put(key, type);
    }
    public boolean isInitialization() {
        return structureType.equals("class") || structureType.equals("struct");
    }
    public ArrayList<String> keys() {
        return new ArrayList<String>(hash.keySet());
    }
    public String uniqueId() {
        return "Tuple";
    }
    public String targetType(String language, boolean notGeneric) {
        if(structureType.equals("class") || structureType.equals("struct")) return definitionName;
        return language.equals("ts") ? "Object" : (notGeneric ? "InitializableHashMap" : "Map") + "<String, ?>";
    }
    public Instance copy() {
        return new NestedByIndexType(hash, structureType, definitionName, superClass, isInstance, null);
    }
    public Map<String, FunctionType> getFunctionTypesStartingWith(String varName) {
        Map<String, FunctionType> matches = new HashMap<String, FunctionType>();
        varName = varName.trim();

        for(Map.Entry<String, Instance> iterator:hash.entrySet()) {
            if(FunctionUtil.functionStartsWith(iterator.getKey(), iterator.getValue(), varName)) {
                matches.put(iterator.getKey(), (FunctionType)iterator.getValue());
            }
        }
        return matches;
    }
    public Expression getFunctionEndingWithVariadic(String varName) {
        ArrayList<String> variadicNames = FunctionUtil.getVariadicNames(varName);
        for(int i = 0; i < variadicNames.size(); i+=2) {
            Instance resulting = this.getProperty(variadicNames.get(i));
            if(resulting instanceof FunctionType) {
                List<Instance> parameterTypes = ((FunctionType)resulting).parameterTypes;
                if(!parameterTypes.get(parameterTypes.size() - 1)/*.resulting(null)*/.uniqueId().equals(variadicNames.get(i + 1).split("_")[1])) continue;
                return new Expression(variadicNames.get(i), resulting);
            }
        }
        return null;
    }
}

public class Type {

    public static String basicToTs(String sourceType) {
        if (sourceType.equals("String")) {
            return "string";
        }
        else if(sourceType.equals("Int") || sourceType.equals("Float") || sourceType.equals("Double")) {
            return "number";
        }
        else if(sourceType.equals("Bool")) {
            return "boolean";
        }
        else if(sourceType.equals("Void")) {
            return "void";
        }
        return null;
    }

    public static String basicToJava(String sourceType) {
        if (sourceType.equals("String")) {
            return "String";
        }
        else if(sourceType.equals("Int")) {
            return "Integer";
        }
        else if(sourceType.equals("Float")) {
            return "Float";
        }
        else if(sourceType.equals("Double")) {
            return "Double";
        }
        else if(sourceType.equals("Bool")) {
            return "Boolean";
        }
        else if(sourceType.equals("Void")) {
            return "void";
        }
        return null;
    }

    public static Instance fromDefinition(SwiftParser.TypeContext ctx, Visitor visitor) {
        boolean isOptional = false;
        if(ctx.optional_type() != null) {
            isOptional = true;
            ctx = ctx.type(0);
        }

        String isGetterSetter =
                ctx.parent != null && ctx.parent.parent instanceof SwiftParser.Property_declarationContext ? "$" :
                ctx.parent instanceof SwiftParser.Type_annotationContext && ((SwiftParser.Type_annotationContext)ctx.parent).inout() != null ? "." :
                null;

        Instance type;
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) type = fromDictionaryDefinition(ctx.dictionary_definition(), isOptional, isGetterSetter, visitor);
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) type = fromArrayDefinition(ctx.array_definition(), isOptional, isGetterSetter, visitor);
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Tuple_typeContext.class, ctx)) type = fromTupleDefinition(ctx.tuple_type().tuple_type_body().tuple_type_element_list(), isOptional, isGetterSetter, visitor);
        else if(ctx.type_identifier() != null && ctx.type_identifier().type_name() != null && ctx.type_identifier().type_name().getText().equals("Set")) type = fromSetDefinition(ctx.type_identifier(), isOptional, isGetterSetter, visitor);
        else if(WalkerUtil.has(SwiftParser.Arrow_operatorContext.class, ctx)) type = fromFunctionDefinition(ctx.type(0), ctx.type(1), isOptional, isGetterSetter, visitor);
        else {
            String typeName = ctx.getText();
            EntityCache.CacheBlockAndObject classDefinition = visitor.cache.find(typeName, ctx);
            if(classDefinition != null) {
                type = ((Instance)classDefinition.object).copy();
                ((NestedByIndexType)type).isInstance = false;
                type.isOptional = isOptional;
                //type.isGetterSetter = isGetterSetter;
            }
            else {
                type = new BasicType(typeName, isOptional, isGetterSetter);
            }
        }

        if(ctx.getParent().getParent() instanceof SwiftParser.ParameterContext && ((SwiftParser.ParameterContext)ctx.getParent().getParent()).range_operator() != null) {
            type = new NestedType("Array", new BasicType("Int"), type, false, null);
        }

        return type;
    }

    public static Instance fromDefinition(String description, Instance lType) {
        if(description == null) return null;
        if(description.equals("#L")) return lType;
        if(description.equals("#valueType")) return ((NestedType)lType).valueType;
        if(description.equals("#keyType")) return ((NestedType)lType).keyType;
        if(description.contains("->")) {
            String[] parts = description.split("\\->");
            ArrayList<String> parameterExternalNames = new ArrayList<String>();
            ArrayList<Instance> parameterTypes = new ArrayList<Instance>();
            String[] params = parts[0].substring(1, parts[0].length() - 1).split(",");
            for(int i = 0; i < params.length; i++) {
                parameterExternalNames.add("");
                parameterTypes.add(fromDefinition(params[i], lType));
            }
            return new FunctionType(parameterExternalNames, parameterTypes, 0, fromDefinition(parts[1], lType), null, false, false);
        }
        return new BasicType(description);
    }

    private static Instance fromDictionaryDefinition(SwiftParser.Dictionary_definitionContext ctx, boolean isOptional, String isGetterSetter, Visitor visitor) {
        List<SwiftParser.TypeContext> types = ctx.type();
        return new NestedType("Dictionary", fromDefinition(types.get(0), visitor), fromDefinition(types.get(1), visitor), isOptional, isGetterSetter);
    }

    private static Instance fromArrayDefinition(SwiftParser.Array_definitionContext ctx, boolean isOptional, String isGetterSetter, Visitor visitor) {
        return new NestedType("Array", new BasicType("Int"), fromDefinition(ctx.type(), visitor), isOptional, isGetterSetter);
    }

    private static LinkedHashMap<String, Instance> flattenTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx) {
        int elementI = 0;
        LinkedHashMap<String, Instance> flattened = new LinkedHashMap<String, Instance>();
        while(ctx != null) {
            SwiftParser.Tuple_type_elementContext tupleTypeElement = ctx.tuple_type_element();
            if(tupleTypeElement != null) {
                String index = tupleTypeElement.element_name() != null ? tupleTypeElement.element_name().getText() : Integer.toString(elementI);
                flattened.put(index, new BasicType(tupleTypeElement.type() != null ? tupleTypeElement.type().getText() : tupleTypeElement.type_annotation().type().getText()));
                elementI++;
            }
            ctx = ctx.tuple_type_element_list();
        }
        return flattened;
    }
    private static Instance fromTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx, boolean isOptional, String isGetterSetter, Visitor visitor) {
        LinkedHashMap<String, Instance> elems = flattenTupleDefinition(ctx);
        return new NestedByIndexType(elems, "tuple", null, null, false, null);
    }

    private static Instance fromSetDefinition(SwiftParser.Type_identifierContext ctx, boolean isOptional, String isGetterSetter, Visitor visitor) {
        return new NestedType("Set", new BasicType("Int"), fromDefinition(ctx.generic_argument_clause().generic_argument_list().generic_argument(0).type(), visitor), isOptional, isGetterSetter);
    }

    private static Instance fromFunctionDefinition(SwiftParser.TypeContext paramTuple, SwiftParser.TypeContext returnType, boolean isOptional, String isGetterSetter, Visitor visitor) {
        LinkedHashMap<String, Instance> params = flattenTupleDefinition(paramTuple.tuple_type().tuple_type_body().tuple_type_element_list());
        ArrayList<String> parameterExternalNames = new ArrayList<String>();
        ArrayList<Instance> parameterTypes = new ArrayList<Instance>();
        for(Map.Entry<String, Instance> iterator:params.entrySet()) {
            String externalName = iterator.getKey();
            parameterExternalNames.add(externalName.matches("^\\d+$") ? "" : externalName);
            parameterTypes.add(iterator.getValue());
        }
        return new FunctionType(parameterExternalNames, parameterTypes, 0, fromDefinition(returnType, visitor), null, false, false);
    }

    public static Instance fromFunction(SwiftParser.Function_resultContext functionResult, SwiftParser.StatementsContext statements, boolean isClosure, Visitor visitor) {
        if(functionResult != null) return fromDefinition(functionResult.type(), visitor);
        visitor.visitChildren(statements);
        for(int i = 0; i < statements.getChildCount(); i++) {
            if(WalkerUtil.has(SwiftParser.Return_statementContext.class, statements.getChild(i))) {
                SwiftParser.ExpressionContext expression = ((SwiftParser.StatementContext)statements.getChild(i)).control_transfer_statement().return_statement().expression();
                return expression != null ? infer(expression, visitor) : new BasicType("Void");
            }
        }
        if(isClosure && statements.getChildCount() > 0) return infer((SwiftParser.ExpressionContext) statements.getChild(statements.getChildCount() - 1), visitor);
        return new BasicType("Void");
    }

    public static Instance infer(SwiftParser.ExpressionContext ctx, Visitor visitor) {
        return new Expression(ctx, null, visitor).type;
    }

    public static Instance alternative(PrefixOrExpression L, PrefixOrExpression R) {
        Instance type;
        if(L.type().uniqueId().equals(R.type().uniqueId())) {
            type = L.type().copy();
        }
        else if(L.type().uniqueId().equals("Void")) {
            Instance rClone = R.type().copy();
            rClone.isOptional = true;
            return rClone;
        }
        else if(R.type().uniqueId().equals("Void")) {
            Instance lClone = L.type().copy();
            lClone.isOptional = true;
            return lClone;
        }
        else {
            System.out.println("//Ambiguous return type: " + L.type().uniqueId() + " || " + R.type().uniqueId());
            type = L.type().copy();
        }
        return type;
    }
}
