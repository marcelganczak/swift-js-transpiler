import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class TranspilerVisitor extends UtilVisitor {

    protected String toJsType(SwiftParser.TypeContext ctx) {
        if(isDirectDescendant(SwiftParser.Dictionary_definitionContext.class, ctx)) return "Object";
        if(isDirectDescendant(SwiftParser.Array_definitionContext.class, ctx)) return "Array";
        String text = ctx.getText();
        if(text.equals("String")) {
            return "string";
        }
        else if(text.equals("Int") || text.equals("Float") || text.equals("Double")) {
            return "number";
        }
        else if(text.equals("Bool")) {
            return "boolean";
        }
        return text;
    }

    protected String resultingType(String lType, String accessor) {
        //TODO
        return null;
    }

    protected String inferJsType(SwiftParser.ExpressionContext ctx) {
        if(isDirectDescendant(SwiftParser.Numeric_literalContext.class, ctx)) return "number";
        if(isDirectDescendant(SwiftParser.String_literalContext.class, ctx)) return "string";
        if(isDirectDescendant(SwiftParser.Boolean_literalContext.class, ctx)) return "boolean";
        if(isDirectDescendant(SwiftParser.Dictionary_literalContext.class, ctx)) return "Object";
        if(isDirectDescendant(SwiftParser.Array_literalContext.class, ctx)) return "Array";
        return null;
    }

    public String jsForIn(SwiftParser.For_in_statementContext ctx) {
        return "_.each(" + visit(ctx.expression()) + ", " + visit(ctx.pattern()) + " => " + visit(ctx.code_block()) + ")";
    }

    public String jsDictionaryLiteral(SwiftParser.Dictionary_literalContext ctx) {
        if(isDirectDescendant(SwiftParser.Empty_dictionary_literalContext.class, ctx)) return "{}";
        ArrayList<Integer> withoutNodes = new ArrayList<Integer>(); withoutNodes.add(0); withoutNodes.add(ctx.getChildCount() - 1);
        return '{' + visitChildren(ctx, withoutNodes) + '}';
    }

    public String jsFunctionResult(SwiftParser.Function_resultContext ctx) {
        return ":" + visit(ctx.type());
    }

    public boolean isSwiftishDictionaryConstructor(SwiftParser.Function_call_expressionContext ctx) {
        return false;
        //return isDirectDescendant(SwiftParser.Dictionary_literalContext.class, ctx.postfix_expression());
    }

    public String lodashMethod(String lType, String R) {
        if(lType != null && lType.equals("Object")) return jsDictionaryMethod(R);
        return null;
    }

    public String jsDictionaryMethod(String method) {
        if(method.equals("count")) {
            return "size";
        }
        if(method.equals("updateValue")) {
            return "updateValue";
        }
        return null;
    }

    public String jsChain(ArrayList<SwiftParser.Chain_postfix_expressionContext> oneLevelChain, int chainPos, String L, String lType) {
        if(chainPos >= oneLevelChain.size()) return L;

        SwiftParser.Chain_postfix_expressionContext rChild = oneLevelChain.get(chainPos);

        String lodashMethod = null;
        if(rChild instanceof SwiftParser.Explicit_member_expressionContext) lodashMethod = this.lodashMethod(lType, ((SwiftParser.Explicit_member_expressionContext) rChild).identifier().getText());
        String extraLodashParameters = null;
        if(lodashMethod != null && chainPos < oneLevelChain.size() - 1 && oneLevelChain.get(chainPos + 1) instanceof SwiftParser.Function_call_expressionContext) {
            extraLodashParameters = visitWithoutStrings(((SwiftParser.Function_call_expressionContext) oneLevelChain.get(chainPos + 1)).parenthesized_expression(), "()");
            chainPos++;
        }
        String LR = lodashMethod != null ? "_." + lodashMethod + "(" + L + (extraLodashParameters != null ? "," + extraLodashParameters : "") + ")" : L + visitWithoutStrings(rChild, "?");

        String chain = jsChain(oneLevelChain, chainPos + 1, LR, resultingType(lType, visitWithoutTerminals(rChild).trim()));

        boolean isOptional = rChild.getChild(0).getText().equals("?");
        if(isOptional) {
            return "(" + L + "!= null ? " + chain + " : null )";
        }
        else {
            return chain;
        }
    }

    public void cacheTypes(List<SwiftParser.Pattern_initializerContext> initializers) {
        int numInitializers = initializers.size();
        if(numInitializers == 0) return;

        String type;
        SwiftParser.Pattern_initializerContext lastInitializer = initializers.get(numInitializers - 1);
        if(lastInitializer.pattern().type_annotation() == null) {
            type = inferJsType(lastInitializer.initializer().expression());
            if(type == null) return;
        }
        else {
            type = toJsType(lastInitializer.pattern().type_annotation().type());
        }

        for(int i = 0; i < numInitializers; i++) {
            String identifier = initializers.get(i).pattern().identifier_pattern().getText();
            System.out.println("Caching " + identifier + " as " + type);
            cacheType(identifier, type, initializers.get(i));
        }
    }

    public String toJsIf(SwiftParser.If_statementContext ctx) {
        String condition = visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        if(isDirectDescendant(SwiftParser.Optional_binding_conditionContext.class, ctx.condition_clause())) {
            SwiftParser.Optional_binding_headContext ifLet = ctx.condition_clause().condition_list().condition(0).optional_binding_condition().optional_binding_head();
            String constVar = visitWithoutTerminals(ifLet.pattern());
            String var = visitWithoutTerminals(ifLet.initializer().expression());
            condition = var + " != null";
            beforeBlock = "const " + constVar + " = " + var + ";";
        }
        return "if(" + condition + ") {" + beforeBlock + visitWithoutStrings(ctx.code_block(), "{") + visitChildren(ctx.else_clause());
    }
};
