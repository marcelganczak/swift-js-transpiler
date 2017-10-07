import java.util.*;

class BasicType extends AbstractType {
    private String sourceType;
    public BasicType(String sourceType) {
        this.sourceType = sourceType;
        this.isOptional = false;
        this.isGetterSetter = false;
    }
    public BasicType(String sourceType, boolean isOptional, boolean isGetterSetter) {
        this.sourceType = sourceType;
        this.isOptional = isOptional;
        this.isGetterSetter = isGetterSetter;
    }
    public String swiftType() {
        return sourceType;
    }
    protected String targetType(String language, boolean notGeneric) {
        return language.equals("ts") ? Type.basicToTs(sourceType) : Type.basicToJava(sourceType);
    }
    public AbstractType resulting(String accessor) {
        return null;
    }
    public AbstractType copy() {
        return new BasicType(this.sourceType, this.isOptional, this.isGetterSetter);
    }
}
class FunctionType extends AbstractType {
    public ArrayList<String> parameterExternalNames;
    public ArrayList<AbstractType> parameterTypes;
    public int numParametersWithDefaultValue;
    public AbstractType returnType;
    public FunctionType(SwiftParser.Function_declarationContext ctx, Visitor visitor) {
        List<SwiftParser.ParameterContext> parameters = FunctionUtil.parameters(ctx);

        parameterTypes = FunctionUtil.parameterTypes(parameters, visitor);
        parameterExternalNames = FunctionUtil.parameterExternalNames(parameters);
        numParametersWithDefaultValue = FunctionUtil.numParametersWithDefaultValue(parameters);

        returnType = Type.fromFunction(ctx.function_signature().function_result(), ctx.function_body().code_block().statements(), false, visitor);
    }
    public FunctionType(ArrayList<String> parameterExternalNames, ArrayList<AbstractType> parameterTypes, int numParametersWithDefaultValue, AbstractType returnType, boolean isGetterSetter) {
        this.parameterExternalNames = parameterExternalNames;
        this.parameterTypes = parameterTypes;
        this.numParametersWithDefaultValue = numParametersWithDefaultValue;
        this.returnType = returnType;
        this.isGetterSetter = isGetterSetter;
    }
    public String swiftType() {
        return "Function";
    }
    protected String targetType(String language, boolean notGeneric) {
        return language.equals("ts") ? "Function" : "TODO";
    }
    public AbstractType resulting(String accessor) {
        return returnType;
    }
    public AbstractType copy() {
        return new FunctionType(this.parameterExternalNames, this.parameterTypes, this.numParametersWithDefaultValue, this.returnType, this.isGetterSetter);
    }
    public boolean sameAs(FunctionType otherType) {
        if(parameterTypes.size() != otherType.parameterTypes.size()) return false;
        if(!returnType.swiftType().equals(otherType.returnType.swiftType())) return false;
        for(int i = 0; i < parameterTypes.size(); i++) if(!parameterTypes.get(i).swiftType().equals(otherType.parameterTypes.get(i).swiftType())) return false;
        return true;
    }
}
class NestedType extends AbstractType {
    private String wrapperType;//Dictionary/Array/Set
    public AbstractType keyType;
    public AbstractType valueType;
    public NestedType(String wrapperType, AbstractType keyType, AbstractType valueType, boolean isOptional, boolean isGetterSetter) {
        this.wrapperType = wrapperType;
        this.keyType = keyType;
        this.valueType = valueType;
        this.isOptional = isOptional;
        this.isGetterSetter = isGetterSetter;
    }
    public String swiftType() {
        return wrapperType;
    }
    protected String targetType(String language, boolean notGeneric) {
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
    public AbstractType resulting(String accessor) {
        return valueType;
    }
    public AbstractType copy() {
        return new NestedType(wrapperType, keyType, valueType, isOptional, isGetterSetter);
    }
    @Override public boolean copiedOnAssignment() {
        return true;
    }
}
class NestedByIndexType extends AbstractType {
    private LinkedHashMap<String, AbstractType> sourceType;
    private String structureType;
    private String definitionName;
    public boolean isInstance;
    public NestedByIndexType(LinkedHashMap<String, AbstractType> sourceType, String structureType, String definitionName, boolean isInstance, boolean isGetterSetter) {
        this.sourceType = sourceType;
        this.structureType = structureType;
        this.definitionName = definitionName;
        this.isInstance = isInstance;
        this.isGetterSetter = isGetterSetter;
    }
    public void put(String key, AbstractType type) {
        sourceType.put(key, type);
    }
    public boolean isInitialization() {
        return structureType.equals("class") || structureType.equals("struct");
    }
    public ArrayList<String> keys() {
        return new ArrayList<String>(sourceType.keySet());
    }
    public String swiftType() {
        return "Tuple";
    }
    protected String targetType(String language, boolean notGeneric) {
        if(structureType.equals("class") || structureType.equals("struct")) return definitionName;
        return language.equals("ts") ? "Object" : (notGeneric ? "InitializableHashMap" : "Map") + "<String, ?>";
    }
    public AbstractType resulting(String accessor) {
        if(accessor.equals("()")) return new NestedByIndexType(sourceType, structureType, definitionName, true, false);
        return sourceType.get(accessor);
    }
    public AbstractType copy() {
        return new NestedByIndexType(sourceType, structureType, definitionName, isInstance, isGetterSetter);
    }
    @Override public boolean copiedOnAssignment() {
        return structureType.equals("struct");
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

    public static AbstractType fromDefinition(SwiftParser.TypeContext ctx, Visitor visitor) {
        boolean isOptional = false;
        if(ctx.optional_type() != null) {
            isOptional = true;
            ctx = ctx.type(0);
        }

        boolean isGetterSetter =
                (ctx.parent != null && ctx.parent.parent instanceof SwiftParser.Property_declarationContext) ||
                (ctx.parent instanceof SwiftParser.Type_annotationContext && ((SwiftParser.Type_annotationContext)ctx.parent).inout() != null);

        AbstractType type;
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) type = fromDictionaryDefinition(ctx.dictionary_definition(), isOptional, isGetterSetter, visitor);
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) type = fromArrayDefinition(ctx.array_definition(), isOptional, isGetterSetter, visitor);
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Tuple_typeContext.class, ctx)) type = fromTupleDefinition(ctx.tuple_type().tuple_type_body().tuple_type_element_list(), isOptional, isGetterSetter, visitor);
        else if(ctx.type_identifier() != null && ctx.type_identifier().type_name() != null && ctx.type_identifier().type_name().getText().equals("Set")) type = fromSetDefinition(ctx.type_identifier(), isOptional, isGetterSetter, visitor);
        else if(WalkerUtil.has(SwiftParser.Arrow_operatorContext.class, ctx)) type = fromFunctionDefinition(ctx.type(0), ctx.type(1), isOptional, isGetterSetter, visitor);
        else {
            String typeName = ctx.getText();
            EntityCache.CacheBlockAndObject classDefinition = visitor.cache.find(typeName, ctx);
            if(classDefinition != null) {
                type = classDefinition.object.type.copy();
                ((NestedByIndexType)type).isInstance = false;
                type.isOptional = isOptional;
                type.isGetterSetter = isGetterSetter;
            }
            else {
                type = new BasicType(typeName, isOptional, isGetterSetter);
            }
        }

        if(ctx.getParent().getParent() instanceof SwiftParser.ParameterContext && ((SwiftParser.ParameterContext)ctx.getParent().getParent()).range_operator() != null) {
            type = new NestedType("Array", new BasicType("Int"), type, false, false);
        }

        return type;
    }

    public static AbstractType fromDefinition(String description, AbstractType lType) {
        if(description == null) return null;
        if(description.equals("#L")) return lType;
        if(description.equals("#valueType")) return ((NestedType)lType).valueType;
        if(description.equals("#keyType")) return ((NestedType)lType).keyType;
        if(description.contains("->")) {
            String[] parts = description.split("\\->");
            ArrayList<String> parameterExternalNames = new ArrayList<String>();
            ArrayList<AbstractType> parameterTypes = new ArrayList<AbstractType>();
            String[] params = parts[0].substring(1, parts[0].length() - 1).split(",");
            for(int i = 0; i < params.length; i++) {
                parameterExternalNames.add("");
                parameterTypes.add(fromDefinition(params[i], lType));
            }
            return new FunctionType(parameterExternalNames, parameterTypes, 0, fromDefinition(parts[1], lType), false);
        }
        return new BasicType(description);
    }

    private static AbstractType fromDictionaryDefinition(SwiftParser.Dictionary_definitionContext ctx, boolean isOptional, boolean isGetterSetter, Visitor visitor) {
        List<SwiftParser.TypeContext> types = ctx.type();
        return new NestedType("Dictionary", fromDefinition(types.get(0), visitor), fromDefinition(types.get(1), visitor), isOptional, isGetterSetter);
    }

    private static AbstractType fromArrayDefinition(SwiftParser.Array_definitionContext ctx, boolean isOptional, boolean isGetterSetter, Visitor visitor) {
        return new NestedType("Array", new BasicType("Int"), fromDefinition(ctx.type(), visitor), isOptional, isGetterSetter);
    }

    private static LinkedHashMap<String, AbstractType> flattenTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx) {
        int elementI = 0;
        LinkedHashMap<String, AbstractType> flattened = new LinkedHashMap<String, AbstractType>();
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
    private static AbstractType fromTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx, boolean isOptional, boolean isGetterSetter, Visitor visitor) {
        LinkedHashMap<String, AbstractType> elems = flattenTupleDefinition(ctx);
        return new NestedByIndexType(elems, "tuple", null, false, false);
    }

    private static AbstractType fromSetDefinition(SwiftParser.Type_identifierContext ctx, boolean isOptional, boolean isGetterSetter, Visitor visitor) {
        return new NestedType("Set", new BasicType("Int"), fromDefinition(ctx.generic_argument_clause().generic_argument_list().generic_argument(0).type(), visitor), isOptional, isGetterSetter);
    }

    private static AbstractType fromFunctionDefinition(SwiftParser.TypeContext paramTuple, SwiftParser.TypeContext returnType, boolean isOptional, boolean isGetterSetter, Visitor visitor) {
        LinkedHashMap<String, AbstractType> params = flattenTupleDefinition(paramTuple.tuple_type().tuple_type_body().tuple_type_element_list());
        ArrayList<String> parameterExternalNames = new ArrayList<String>();
        ArrayList<AbstractType> parameterTypes = new ArrayList<AbstractType>();
        for(Map.Entry<String, AbstractType> iterator:params.entrySet()) {
            String externalName = iterator.getKey();
            parameterExternalNames.add(externalName.matches("^\\d+$") ? "" : externalName);
            parameterTypes.add(iterator.getValue());
        }
        return new FunctionType(parameterExternalNames, parameterTypes, 0, fromDefinition(returnType, visitor), false);
    }

    public static AbstractType fromFunction(SwiftParser.Function_resultContext functionResult, SwiftParser.StatementsContext statements, boolean isClosure, Visitor visitor) {
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

    public static AbstractType infer(SwiftParser.ExpressionContext ctx, Visitor visitor) {
        return new Expression(ctx, null, visitor).type;
    }

    public static AbstractType alternative(PrefixOrExpression L, PrefixOrExpression R) {
        AbstractType type;
        if(L.type().swiftType().equals(R.type().swiftType())) {
            type = L.type().copy();
        }
        else if(L.type().swiftType().equals("Void")) {
            AbstractType rClone = R.type().copy();
            rClone.isOptional = true;
            return rClone;
        }
        else if(R.type().swiftType().equals("Void")) {
            AbstractType lClone = L.type().copy();
            lClone.isOptional = true;
            return lClone;
        }
        else {
            System.out.println("//Ambiguous return type: " + L.type().swiftType() + " || " + R.type().swiftType());
            type = L.type().copy();
        }
        type.isGetterSetter = false;
        return type;
    }
}
