import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

class BasicType implements AbstractType {
    private String swiftType;
    public BasicType(String swiftType) {
        this.swiftType = swiftType;
    }
    public String swiftType() {
        return swiftType;
    }
    public String jsType() {
        return Type.basicToJs(swiftType);
    }
    public AbstractType resulting(String accessor) {
        //TODO
        return null;
    }
}
class FunctionType implements AbstractType {
    private AbstractType returnType;
    private HashMap<String, AbstractType> parameterTypes;
    public FunctionType(HashMap<String, AbstractType> parameterTypes, AbstractType returnType) {
        this.parameterTypes = parameterTypes;
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
    public NestedType(String wrapperType, AbstractType keyType, AbstractType valueType) {
        this.wrapperType = wrapperType;
        this.keyType = keyType;
        this.valueType = valueType;
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
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) return fromDictionaryDefinition(ctx.dictionary_definition());
        if(WalkerUtil.isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) return fromArrayDefinition(ctx.array_definition());
        if(WalkerUtil.isDirectDescendant(SwiftParser.Tuple_typeContext.class, ctx)) return fromTupleDefinition(ctx.tuple_type().tuple_type_body().tuple_type_element_list());
        return new BasicType(ctx.getText());
    }

    private static AbstractType fromDictionaryDefinition(SwiftParser.Dictionary_definitionContext ctx) {
        List<SwiftParser.TypeContext> types = ctx.type();
        return new NestedType("Dictionary", fromDefinition(types.get(0)), fromDefinition(types.get(1)));
    }

    private static AbstractType fromArrayDefinition(SwiftParser.Array_definitionContext ctx) {
        return new NestedType("Array", new BasicType("Int"), fromDefinition(ctx.type()));
    }

    private static AbstractType fromTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx) {
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

    public static AbstractType infer(SwiftParser.ExpressionContext ctx, TranspilerVisitor visitor) {
        ArrayList<ParserRuleContext> flattenedChain = visitor.flattenChain(ctx.prefix_expression());
        return visitor.jsChain(ctx.prefix_expression()).type;
    }

    public static HashMap<String, AbstractType> fromParameters(List<SwiftParser.ParameterContext> parameters, TranspilerVisitor visitor) {
        HashMap<String, AbstractType> parameterTypes = new HashMap<String, AbstractType>();
        for(int i = 0; i < parameters.size(); i++) {
            SwiftParser.ParameterContext parameter = parameters.get(i);
            String parameterName = visitor.visit(parameter.local_parameter_name()).trim();
            AbstractType parameterType;
            if(parameter.type_annotation() != null) {
                parameterType = fromDefinition(parameter.type_annotation().type());
            }
            else {
                parameterType = infer(parameter.default_argument_clause().expression(), visitor);
            }
            parameterTypes.put(parameterName, parameterType);
        }
        return parameterTypes;
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

    public static AbstractType resulting(AbstractType lType, String accessor, ParseTree ctx, TranspilerVisitor visitor) {
        if(accessor == null) return null;
        if(lType == null) return visitor.cache.getType(accessor, ctx);
        return lType.resulting(accessor);
    }
}
