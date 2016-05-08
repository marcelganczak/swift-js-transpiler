import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ChainElem {
    public String code;
    public String accessorType;
    public AbstractType type;
    public String functionCallParams;
    public ChainElem(String code, String accessorType, AbstractType type, String functionCallParams) { this.code = code; this.accessorType = accessorType; this.type = type; this.functionCallParams = functionCallParams; }
    
    static public ChainElem get(ParserRuleContext rChild, AbstractType declaredType, SwiftParser.Function_call_expressionContext functionCall, List<SwiftParser.Expression_elementContext> functionCallParams, SwiftParser.Prefix_expressionContext ctx, ArrayList<ParserRuleContext> chain, int chainPos, AbstractType lType, TranspilerVisitor visitor) {

        boolean isFinalElem = chainPos + (functionCall != null ? 1 : 0) >= chain.size() - 1;
        AbstractType assumedType = isFinalElem ? declaredType : null;

        if(chainPos == 0 && isTuple(rChild)) {
            return getTuple(rChild, assumedType, visitor);
        }
        else if(chainPos == 0 && WalkerUtil.isDirectDescendant(SwiftParser.Array_literalContext.class, rChild)) {
            return getArray(rChild, functionCall, functionCallParams, assumedType, visitor);
        }
        else if(chainPos == 0 && WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_literalContext.class, rChild)) {
            return getDictionary(rChild, functionCall, functionCallParams, assumedType, visitor);
        }
        else if(chainPos == 0 && rChild instanceof SwiftParser.Primary_expressionContext && ((SwiftParser.Primary_expressionContext) rChild).generic_argument_clause() != null) {
            return getTemplatedConstructor(rChild, functionCall, functionCallParams, assumedType, visitor);
        }
        else if(chainPos == 0 && WalkerUtil.isDirectDescendant(SwiftParser.LiteralContext.class, rChild)) {
            return getLiteral(rChild, visitor);
        }
        else {
            return getBasic(rChild, functionCall, functionCallParams, chain, chainPos, lType, visitor);
        }
    }

    static private boolean isTuple(ParserRuleContext rChild) {
        if(!WalkerUtil.isDirectDescendant(SwiftParser.Parenthesized_expressionContext.class, rChild)) return false;
        SwiftParser.Expression_element_listContext tupleLiteral = ((SwiftParser.Primary_expressionContext) rChild).parenthesized_expression().expression_element_list();
        List<SwiftParser.Expression_elementContext> elementList = tupleLiteral.expression_element();
        if(elementList.size() <= 1) return false;
        return true;
    }
    static private ChainElem getTuple(ParserRuleContext rChild, AbstractType type, TranspilerVisitor visitor) {

        SwiftParser.Expression_element_listContext tupleLiteral = ((SwiftParser.Primary_expressionContext) rChild).parenthesized_expression().expression_element_list();
        List<SwiftParser.Expression_elementContext> elementList = tupleLiteral.expression_element();
        String code = "";
        LinkedHashMap<String, AbstractType> types = new LinkedHashMap<String, AbstractType>();

        ArrayList<String> keys = null;
        if(type != null) {
            if(type instanceof NestedByIndexType) keys = ((NestedByIndexType) type).keys();
        }

        code += "{";
        for(int i = 0; i < elementList.size(); i++) {
            String key = keys != null ? keys.get(i) : elementList.get(i).identifier() != null ? elementList.get(i).identifier().getText() : i + "':";
            String val = visitor.visit(elementList.get(i).expression());
            if(i > 0) code += ",";
            code += "'" + key + "':" + val;
        }
        code += "}";

        for(int i = 0, elementI = 0; i < tupleLiteral.getChildCount(); i++) {
            if(!(tupleLiteral.getChild(i) instanceof SwiftParser.Expression_elementContext)) continue;
            SwiftParser.Expression_elementContext child = (SwiftParser.Expression_elementContext) tupleLiteral.getChild(i);
            String index = child.identifier() != null ? child.identifier().getText() : Integer.toString(elementI);
            if(type == null) types.put(index, Type.infer(child.expression(), visitor));
            elementI++;
        }

        return new ChainElem(code, "", type == null ? new NestedByIndexType(types) : type, null);
    }

    static private ChainElem getArray(ParserRuleContext rChild, SwiftParser.Function_call_expressionContext functionCall, List<SwiftParser.Expression_elementContext> functionCallParams, AbstractType type, TranspilerVisitor visitor) {

        SwiftParser.Array_literalContext arrayLiteral = ((SwiftParser.Primary_expressionContext) rChild).literal_expression().array_literal();

        if(type == null) {
            AbstractType wrappedType = Type.infer(arrayLiteral.array_literal_items().array_literal_item(0).expression(), visitor);
            type = new NestedType("Array", new BasicType("Int"), wrappedType, false);
        }

        String code;
        if(functionCall != null) {
            String arraySize = "", fill = "";
            if(functionCallParams != null) {
                if(functionCallParams.size() == 2 && functionCallParams.get(0).identifier().getText().equals("count") && functionCallParams.get(1).identifier().getText().equals("repeatedValue")) {
                    arraySize = visitor.visit(functionCallParams.get(0).expression());
                    fill = ".fill(" + visitor.visit(functionCallParams.get(1).expression()) + ")";
                }
            }
            code = "new Array(" + arraySize + ")" + fill;
        }
        else {
            code = visitor.visit(rChild);
            if(type.swiftType().equals("Set")) code = "new Set(" + code + ")";
        }

        return new ChainElem(code, "", type, null);
    }

    static private ChainElem getDictionary(ParserRuleContext rChild, SwiftParser.Function_call_expressionContext functionCall, List<SwiftParser.Expression_elementContext> functionCallParams, AbstractType type, TranspilerVisitor visitor) {

        SwiftParser.Dictionary_literalContext dictionaryLiteral = ((SwiftParser.Primary_expressionContext) rChild).literal_expression().dictionary_literal();

        if(type == null) {
            List<SwiftParser.ExpressionContext> keyVal = dictionaryLiteral.dictionary_literal_items().dictionary_literal_item(0).expression();
            type = new NestedType("Dictionary", Type.infer(keyVal.get(0), visitor), Type.infer(keyVal.get(1), visitor), false);
        }

        return new ChainElem(visitor.visit(rChild), "", type, null);
    }

    static private ChainElem getTemplatedConstructor(ParserRuleContext rChild, SwiftParser.Function_call_expressionContext functionCall, List<SwiftParser.Expression_elementContext> functionCallParams, AbstractType type, TranspilerVisitor visitor) {

        SwiftParser.Generic_argument_clauseContext template = ((SwiftParser.Primary_expressionContext) rChild).generic_argument_clause();
        String typeStr = visitor.visit(rChild.getChild(0)).trim();

        if(typeStr.equals("Set")) {
            if(type == null) type = new NestedType("Set", new BasicType("Int"), new BasicType(template.generic_argument_list().generic_argument(0).getText()), false);
            return new ChainElem("new " + type.jsType() + "()", "", type, null);
        }

        return null;
    }

    static private ChainElem getLiteral(ParserRuleContext rChild, TranspilerVisitor visitor) {
        AbstractType type = null;
        if(WalkerUtil.isDirectDescendant(SwiftParser.Integer_literalContext.class, rChild)) type = new BasicType("Int");
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Numeric_literalContext.class, rChild)) type = new BasicType("Double");
        else if(WalkerUtil.isDirectDescendant(SwiftParser.String_literalContext.class, rChild)) type = new BasicType("String");
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Boolean_literalContext.class, rChild)) type = new BasicType("Bool");
        else if(WalkerUtil.isDirectDescendant(SwiftParser.Nil_literalContext.class, rChild)) return new ChainElem("null ", "", new BasicType("Void"), null);
        return new ChainElem(visitor.visit(rChild), "", type, null);
    }

    static private ChainElem getBasic(ParserRuleContext rChild, SwiftParser.Function_call_expressionContext functionCall, List<SwiftParser.Expression_elementContext> functionCallParams, ArrayList<ParserRuleContext> chain, int chainPos, AbstractType lType, TranspilerVisitor visitor) {
        String identifier = null, accessorType = ".", functionCallParamsStr = null;
        if(rChild instanceof SwiftParser.Explicit_member_expressionContext) {
            identifier = ((SwiftParser.Explicit_member_expressionContext) rChild).identifier().getText();
            accessorType = ".";
        }
        else if(rChild instanceof SwiftParser.Primary_expressionContext) {
            identifier = ((SwiftParser.Primary_expressionContext) rChild).identifier() != null ? ((SwiftParser.Primary_expressionContext) rChild).identifier().getText() : visitor.visit(rChild);
            accessorType = ".";
        }
        else if(rChild instanceof SwiftParser.Subscript_expressionContext) {
            identifier = visitor.visit(((SwiftParser.Subscript_expressionContext) rChild).expression_list());
            accessorType = "[]";
        }
        else if(rChild instanceof SwiftParser.Explicit_member_expression_numberContext) {
            identifier = visitor.visitWithoutStrings(rChild, ".");
            accessorType = "[]";
        }
        else if(rChild instanceof SwiftParser.Explicit_member_expression_number_doubleContext) {
            String[] split = visitor.visit(rChild).split("\\.");
            int pos = 1, i = chainPos;
            while(i > 0 && chain.get(i - 1) instanceof SwiftParser.Explicit_member_expression_number_doubleContext) {i--; pos = pos == 1 ? 2 : 1;}
            identifier = split[pos];
            accessorType = "[]";
        }
        else {
            identifier = visitor.visit(rChild);
        }

        if(functionCall != null) {
            identifier = FunctionUtil.nameFromCall(identifier, functionCallParams, rChild, visitor);
            functionCallParamsStr = visitor.visitWithoutStrings(functionCall.parenthesized_expression(), "()");
        }

        return new ChainElem(identifier, accessorType, null, functionCallParamsStr);
    }
}
