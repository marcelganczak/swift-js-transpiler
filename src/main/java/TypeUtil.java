import java.util.*;

public class TypeUtil {

    public static Instance fromDefinition(SwiftParser.TypeContext ctx, Visitor visitor) {
        boolean isOptional = false;
        if(ctx.optional_type() != null) {
            isOptional = true;
            ctx = ctx.type(0);
        }

        boolean isGetterSetter = ctx.parent != null && ctx.parent.parent instanceof SwiftParser.Property_declarationContext;
        boolean isInout = ctx.parent instanceof SwiftParser.Type_annotationContext && ((SwiftParser.Type_annotationContext)ctx.parent).inout() != null;

        Instance type;
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) type = fromDictionaryDefinition(ctx.dictionary_definition(), visitor);
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) type = fromArrayDefinition(ctx.array_definition(), visitor);
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Tuple_typeContext.class, ctx)) type = fromTupleDefinition(ctx.tuple_type().tuple_type_body().tuple_type_element_list(), visitor);
        else if(ctx.type_identifier() != null && ctx.type_identifier().type_name() != null && ctx.type_identifier().type_name().getText().equals("Set")) type = fromSetDefinition(ctx.type_identifier(), visitor);
        else if(WalkerUtil.has(SwiftParser.Arrow_operatorContext.class, ctx)) type = fromFunctionDefinition(ctx.type(0), ctx.type(1), visitor);
        else {
            String typeName = ctx.getText();
            Cache.CacheBlockAndObject classDefinition = visitor.cache.find(typeName, ctx);
            if(classDefinition != null) {
                type = new Instance(typeName, ctx, visitor.cache);
                //type = (ClassDefinition)classDefinition.object;
            }
            else {
                type = new Instance(typeName, ctx, visitor.cache);
            }
        }

        if(ctx.getParent().getParent() instanceof SwiftParser.ParameterContext && ((SwiftParser.ParameterContext)ctx.getParent().getParent()).range_operator() != null) {
            Instance baseType = type;
            type = new Instance("Array", ctx, visitor.cache);
            type.generics = new HashMap<String, Instance>();
            type.generics.put("Value", baseType);
            type.isVariadicParameter = true;
        }

        type.isOptional = isOptional;
        type.isGetterSetter = isGetterSetter;
        type.isInout = isInout;

        return type;
    }

    private static Instance fromDictionaryDefinition(SwiftParser.Dictionary_definitionContext ctx, Visitor visitor) {
        List<SwiftParser.TypeContext> types = ctx.type();
        Instance type = new Instance("Dictionary", ctx, visitor.cache);
        type.generics = new HashMap<String, Instance>();
        type.generics.put("Key", fromDefinition(types.get(0), visitor));
        type.generics.put("Value", fromDefinition(types.get(1), visitor));
        return type;
    }

    private static Instance fromArrayDefinition(SwiftParser.Array_definitionContext ctx, Visitor visitor) {
        Instance type = new Instance("Array", ctx, visitor.cache);
        type.generics = new HashMap<String, Instance>();
        type.generics.put("Value", fromDefinition(ctx.type(), visitor));
        return type;
    }

    private static LinkedHashMap<String, Instance> flattenTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx, Visitor visitor) {
        int elementI = 0;
        LinkedHashMap<String, Instance> flattened = new LinkedHashMap<String, Instance>();
        while(ctx != null) {
            SwiftParser.Tuple_type_elementContext tupleTypeElement = ctx.tuple_type_element();
            if(tupleTypeElement != null) {
                String index = tupleTypeElement.element_name() != null ? tupleTypeElement.element_name().getText() : Integer.toString(elementI);
                flattened.put(index, new Instance(tupleTypeElement.type() != null ? tupleTypeElement.type().getText() : tupleTypeElement.type_annotation().type().getText(), ctx, visitor.cache));
                elementI++;
            }
            ctx = ctx.tuple_type_element_list();
        }
        return flattened;
    }
    private static Instance fromTupleDefinition(SwiftParser.Tuple_type_element_listContext ctx, Visitor visitor) {
        LinkedHashMap<String, Instance> elems = flattenTupleDefinition(ctx, visitor);
        ClassDefinition tupleDefinition = new ClassDefinition(null, visitor.cache.find("Tuple", ctx), elems, new ArrayList<String>());
        return new Instance(tupleDefinition);
    }

    private static Instance fromSetDefinition(SwiftParser.Type_identifierContext ctx, Visitor visitor) {
        Instance type = new Instance("Set", ctx, visitor.cache);
        type.generics = new HashMap<String, Instance>();
        type.generics.put("Value", fromDefinition(ctx.generic_argument_clause().generic_argument_list().generic_argument(0).type(), visitor));
        return type;
    }

    private static Instance fromFunctionDefinition(SwiftParser.TypeContext paramTuple, SwiftParser.TypeContext returnType, Visitor visitor) {
        LinkedHashMap<String, Instance> params = flattenTupleDefinition(paramTuple.tuple_type().tuple_type_body().tuple_type_element_list(), visitor);
        ArrayList<String> parameterExternalNames = new ArrayList<String>();
        ArrayList<Instance> parameterTypes = new ArrayList<Instance>();
        for(Map.Entry<String, Instance> iterator:params.entrySet()) {
            String externalName = iterator.getKey();
            parameterExternalNames.add(externalName.matches("^\\d+$") ? "" : externalName);
            parameterTypes.add(iterator.getValue());
        }
        return new Instance(new FunctionDefinition(null, parameterExternalNames, parameterTypes, 0, fromDefinition(returnType, visitor), new ArrayList<String>()));
    }

    public static Instance fromFunction(SwiftParser.Function_resultContext functionResult, SwiftParser.StatementsContext statements, boolean isClosure, Visitor visitor) {
        if(functionResult != null) return fromDefinition(functionResult.type(), visitor);
        visitor.visitChildren(statements);
        for(int i = 0; i < statements.getChildCount(); i++) {
            if(WalkerUtil.has(SwiftParser.Return_statementContext.class, statements.getChild(i))) {
                SwiftParser.ExpressionContext expression = ((SwiftParser.StatementContext)statements.getChild(i)).control_transfer_statement().return_statement().expression();
                return expression != null ? infer(expression, visitor) : new Instance("Void", statements, visitor.cache);
            }
        }
        if(isClosure && statements.getChildCount() > 0) return infer((SwiftParser.ExpressionContext) statements.getChild(statements.getChildCount() - 1), visitor);
        return new Instance("Void", statements, visitor.cache);
    }

    public static Instance infer(SwiftParser.ExpressionContext ctx, Visitor visitor) {
        return new Expression(ctx, null, visitor).type;
    }

    public static Instance alternative(PrefixOrExpression L, PrefixOrExpression R) {
        Instance type;
        if(L.type().uniqueId().equals(R.type().uniqueId())) {
            type = L.type();
        }
        else if(L.type().uniqueId().equals("Void")) {
            Instance rClone = R.type();
            rClone.isOptional = true;
            return rClone;
        }
        else if(R.type().uniqueId().equals("Void")) {
            Instance lClone = L.type();
            lClone.isOptional = true;
            return lClone;
        }
        else {
            System.out.println("//Ambiguous return type: " + L.type().uniqueId() + " || " + R.type().uniqueId());
            type = L.type();
        }
        return type;
    }
}
