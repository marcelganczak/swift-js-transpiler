import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

class BasicType extends AbstractType {
    private String swiftType;
    public BasicType(String swiftType) {
        this.swiftType = swiftType;
        this.isOptional = false;
    }
    public BasicType(String swiftType, boolean isOptional) {
        this.swiftType = swiftType;
        this.isOptional = isOptional;
    }
    public String swiftType() {
        return swiftType;
    }
    public String jsType() {
        return Type.basicToJs(swiftType);
    }
    public AbstractType resulting(String accessor) {
        return null;
    }
    public AbstractType copy() {
        return new BasicType(this.swiftType, this.isOptional);
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
    public FunctionType(ArrayList<String> parameterExternalNames, ArrayList<AbstractType> parameterTypes, int numParametersWithDefaultValue, AbstractType returnType) {
        this.parameterExternalNames = parameterExternalNames;
        this.parameterTypes = parameterTypes;
        this.numParametersWithDefaultValue = numParametersWithDefaultValue;
        this.returnType = returnType;
    }
    public String swiftType() {
        return "Function";
    }
    public String jsType() {
        return "Function";
    }
    public AbstractType resulting(String accessor) {
        return returnType;
    }
    public AbstractType copy() {
        return new FunctionType(this.parameterExternalNames, this.parameterTypes, this.numParametersWithDefaultValue, this.returnType);
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
    public NestedType(String wrapperType, AbstractType keyType, AbstractType valueType, boolean isOptional) {
        this.wrapperType = wrapperType;
        this.keyType = keyType;
        this.valueType = valueType;
        this.isOptional = isOptional;
    }
    public String swiftType() {
        return wrapperType;
    }
    public String jsType() {
        return wrapperType.equals("Dictionary") ? "Object" : wrapperType.equals("Array") ? "Array<" + valueType.jsType() + ">" : "Set<" + valueType.jsType() + ">";
    }
    public AbstractType resulting(String accessor) {
        return valueType;
    }
    public AbstractType copy() {
        return new NestedType(this.wrapperType, this.keyType, this.valueType, this.isOptional);
    }
}
class NestedByIndexType extends AbstractType {
    private LinkedHashMap<String, AbstractType> swiftType;
    public NestedByIndexType(LinkedHashMap<String, AbstractType> swiftType) {
        this.swiftType = swiftType;
    }
    public ArrayList<String> keys() {
        return new ArrayList<String>(swiftType.keySet());
    }
    public String swiftType() {
        return "Tuple";
    }
    public String jsType() {
        return "any";
    }
    public AbstractType resulting(String accessor) {
        return swiftType.get(accessor);
    }
    public AbstractType copy() {
        return new NestedByIndexType(this.swiftType);
    }
}

public class Type {

    public static String basicToJs(String swiftType) {
        if (swiftType.equals("String")) {
            return "string";
        }
        else if(swiftType.equals("Int") || swiftType.equals("Float") || swiftType.equals("Double")) {
            return "number";
        }
        else if(swiftType.equals("Bool")) {
            return "boolean";
        }
        else if(swiftType.equals("Void")) {
            return "void";
        }
        return null;
    }

    public static AbstractType fromDefinition(SwiftParser.TypeContext ctx) {
        boolean isOptional = false;
        if(ctx.optional_type() != null) {
            isOptional = true;
            ctx = ctx.type(0);
        }

        AbstractType type;
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) type = fromDictionaryDefinition(ctx.dictionary_definition(), isOptional);
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) type = fromArrayDefinition(ctx.array_definition(), isOptional);
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Tuple_typeContext.class, ctx)) type = fromTupleDefinition(ctx.tuple_type().tuple_type_body().tuple_type_element_list(), isOptional);
        else if(ctx.type_identifier() != null && ctx.type_identifier().type_name() != null && ctx.type_identifier().type_name().getText().equals("Set")) type = fromSetDefinition(ctx.type_identifier(), isOptional);
        else if(WalkerUtil.has(SwiftParser.Arrow_operatorContext.class, ctx)) type = fromFunctionDefinition(ctx.type(0), ctx.type(1), isOptional);
        else type = new BasicType(ctx.getText(), isOptional);

        if(ctx.getParent().getParent() instanceof SwiftParser.ParameterContext && ((SwiftParser.ParameterContext)ctx.getParent().getParent()).range_operator() != null) {
            type = new NestedType("Array", new BasicType("Int"), type, false);
        }

        return type;
    }

    public static AbstractType fromDefinition(String description, AbstractType lType) {
        if(description == null) return null;
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
            return new FunctionType(parameterExternalNames, parameterTypes, 0, fromDefinition(parts[1], lType));
        }
        return new BasicType(description);
    }

    private static AbstractType fromDictionaryDefinition(SwiftParser.Dictionary_definitionContext ctx, boolean isOptional) {
        List<SwiftParser.TypeContext> types = ctx.type();
        return new NestedType("Dictionary", fromDefinition(types.get(0)), fromDefinition(types.get(1)), isOptional);
    }

    private static AbstractType fromArrayDefinition(SwiftParser.Array_definitionContext ctx, boolean isOptional) {
        return new NestedType("Array", new BasicType("Int"), fromDefinition(ctx.type()), isOptional);
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
    private static AbstractType fromTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx, boolean isOptional) {
        LinkedHashMap<String, AbstractType> elems = flattenTupleDefinition(ctx);
        return new NestedByIndexType(elems);
    }

    private static AbstractType fromSetDefinition(SwiftParser.Type_identifierContext ctx, boolean isOptional) {
        return new NestedType("Set", new BasicType("Int"), fromDefinition(ctx.generic_argument_clause().generic_argument_list().generic_argument(0).type()), isOptional);
    }

    private static AbstractType fromFunctionDefinition(SwiftParser.TypeContext paramTuple, SwiftParser.TypeContext returnType, boolean isOptional) {
        LinkedHashMap<String, AbstractType> params = flattenTupleDefinition(paramTuple.tuple_type().tuple_type_body().tuple_type_element_list());
        ArrayList<String> parameterExternalNames = new ArrayList<String>();
        ArrayList<AbstractType> parameterTypes = new ArrayList<AbstractType>();
        for(Map.Entry<String, AbstractType> iterator:params.entrySet()) {
            String externalName = iterator.getKey();
            parameterExternalNames.add(externalName.matches("^\\d+$") ? "" : externalName);
            parameterTypes.add(iterator.getValue());
        }
        return new FunctionType(parameterExternalNames, parameterTypes, 0, fromDefinition(returnType));
    }

    public static AbstractType fromFunction(SwiftParser.Function_resultContext functionResult, SwiftParser.StatementsContext statements, boolean isClosure, Visitor visitor) {
        if(functionResult != null) return fromDefinition(functionResult.type());
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

    public static AbstractType resulting(AbstractType lType, String accessor, ParseTree ctx, Visitor visitor) {
        if(accessor == null) return null;
        if(lType == null) return visitor.cache.getType(accessor, ctx);
        return lType.resulting(accessor);
    }

    public static AbstractType alternative(PrefixOrExpression L, PrefixOrExpression R) {
        if(L.type().swiftType().equals(R.type().swiftType())) return L.type();
        if(L.type().swiftType().equals("Void")) {
            AbstractType rClone = R.type().copy();
            rClone.isOptional = true;
            return rClone;
        }
        if(R.type().swiftType().equals("Void")) {
            AbstractType lClone = L.type().copy();
            lClone.isOptional = true;
            return lClone;
        }
        System.out.println("//Ambiguous return type: " + L.type().swiftType() + " || " + R.type().swiftType());
        return L.type();
    }
}
