import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

class BasicType implements AbstractType {
    private String swiftType;
    boolean isOptional;
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
}
class FunctionType implements AbstractType {
    private AbstractType returnType;
    public ArrayList<AbstractType> parameterTypes;
    public int numParametersWithDefaultValue;
    boolean isOptional = false;
    public FunctionType(ArrayList<AbstractType> parameterTypes, int numParametersWithDefaultValue, AbstractType returnType) {
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
}
class NestedType implements AbstractType {
    private String wrapperType;//Dictionary/Array/Set
    private AbstractType keyType;
    private AbstractType valueType;
    boolean isOptional;
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
}
class NestedByIndexType implements AbstractType {
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
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) return fromDictionaryDefinition(ctx.dictionary_definition(), isOptional);
        if(WalkerUtil.isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) return fromArrayDefinition(ctx.array_definition(), isOptional);
        if(WalkerUtil.isDirectDescendant(SwiftParser.Tuple_typeContext.class, ctx)) return fromTupleDefinition(ctx.tuple_type().tuple_type_body().tuple_type_element_list(), isOptional);
        if(ctx.type_identifier() != null && ctx.type_identifier().type_name() != null && ctx.type_identifier().type_name().getText().equals("Set")) return fromSetDefinition(ctx.type_identifier(), isOptional);
        return new BasicType(ctx.getText(), isOptional);
    }

    private static AbstractType fromDictionaryDefinition(SwiftParser.Dictionary_definitionContext ctx, boolean isOptional) {
        List<SwiftParser.TypeContext> types = ctx.type();
        return new NestedType("Dictionary", fromDefinition(types.get(0)), fromDefinition(types.get(1)), isOptional);
    }

    private static AbstractType fromArrayDefinition(SwiftParser.Array_definitionContext ctx, boolean isOptional) {
        return new NestedType("Array", new BasicType("Int"), fromDefinition(ctx.type()), isOptional);
    }

    private static AbstractType fromTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx, boolean isOptional) {
        int elementI = 0;
        LinkedHashMap<String, AbstractType> types = new LinkedHashMap<String, AbstractType>();
        while(ctx != null) {
            SwiftParser.Tuple_type_elementContext tupleTypeElement = ctx.tuple_type_element();
            if(tupleTypeElement != null) {
                String index = tupleTypeElement.element_name() != null ? tupleTypeElement.element_name().getText() : Integer.toString(elementI);
                types.put(index, new BasicType(tupleTypeElement.type() != null ? tupleTypeElement.type().getText() : tupleTypeElement.type_annotation().type().getText()));
                elementI++;
            }
            ctx = ctx.tuple_type_element_list();
        }
        return new NestedByIndexType(types);
    }

    private static AbstractType fromSetDefinition(SwiftParser.Type_identifierContext ctx, boolean isOptional) {
        return new NestedType("Set", new BasicType("Int"), fromDefinition(ctx.generic_argument_clause().generic_argument_list().generic_argument(0).type()), isOptional);
    }

    public static AbstractType fromFunction(SwiftParser.Function_resultContext functionResult, SwiftParser.StatementsContext statements, boolean isClosure, TranspilerVisitor visitor) {
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

    public static AbstractType infer(SwiftParser.ExpressionContext ctx, TranspilerVisitor visitor) {
        return visitor.jsChain(ctx).type;
    }

    public static AbstractType resulting(AbstractType lType, String accessor, ParseTree ctx, TranspilerVisitor visitor) {
        if(accessor == null) return null;
        if(lType == null) return visitor.cache.getType(accessor, ctx);
        return lType.resulting(accessor);
    }
}
