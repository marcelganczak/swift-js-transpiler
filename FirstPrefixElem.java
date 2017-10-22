import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstPrefixElem {

    static public FirstPrefixElem get(ParserRuleContext L, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Instance knownType, Visitor visitor) {

        /*if(WalkerUtil.isDirectDescendant(SwiftParser.Parenthesized_expressionContext.class, L)) {
            if(isTuple(L)) {
                return getTuple(L, visitor, knownType);
            }
            else {
                Expression parenthesized = new Expression(((SwiftParser.Primary_expressionContext) L).parenthesized_expression().expression_element_list().expression_element(0).expression(), knownType, visitor);
                return new FirstPrefixElem("(" + parenthesized.code + ")", "", parenthesized.type, null);
            }
        }*/
        if(WalkerUtil.isDirectDescendant(SwiftParser.Array_literalContext.class, L)) {
            return getArray(L, knownType, functionCallParams, visitor);
        }
        if(WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_literalContext.class, L)) {
            return getDictionary(L, knownType, functionCallParams, visitor);
        }
        if(L instanceof SwiftParser.Primary_expressionContext && ((SwiftParser.Primary_expressionContext) L).generic_argument_clause() != null) {
            return getTemplatedConstructor(L, knownType, functionCallParams, visitor);
        }
        if(WalkerUtil.isDirectDescendant(SwiftParser.LiteralContext.class, L)) {
            return getLiteral(L, knownType, visitor);
        }
        if(WalkerUtil.isDirectDescendant(SwiftParser.Closure_expressionContext.class, L)) {
            return getClosure(L, knownType, functionCallParams, visitor);
        }
        return getIdentifier(L, knownType, functionCallParams, visitor);
    }

    /*static private boolean isTuple(ParserRuleContext rChild) {
        SwiftParser.Expression_element_listContext tupleLiteral = ((SwiftParser.Primary_expressionContext) rChild).parenthesized_expression().expression_element_list();
        List<SwiftParser.Expression_elementContext> elementList = tupleLiteral.expression_element();
        if(elementList.size() <= 1) return false;
        return true;
    }
    static public FirstPrefixElem getTuple(ParserRuleContext rChild, Visitor visitor, Instance type) {
        SwiftParser.Expression_element_listContext tupleLiteral = ((SwiftParser.Primary_expressionContext) rChild).parenthesized_expression().expression_element_list();
        List<SwiftParser.Expression_elementContext> elementList = tupleLiteral.expression_element();
        Map<String, Instance> types = new LinkedHashMap<String, Instance>();

        ArrayList<String> keys = null;
        if(type instanceof NestedByIndexType) keys = ((NestedByIndexType) type).keys();

        for(int i = 0, elementI = 0; i < tupleLiteral.getChildCount(); i++) {
            if(!(tupleLiteral.getChild(i) instanceof SwiftParser.Expression_elementContext)) continue;
            SwiftParser.Expression_elementContext child = (SwiftParser.Expression_elementContext) tupleLiteral.getChild(i);
            String index = child.identifier() != null ? child.identifier().getText() : Integer.toString(elementI);
            if(type == null) types.put(index, Type.infer(child.expression(), visitor));
            elementI++;
        }

        if(type == null) type = new NestedByIndexType(types, "tuple", null, null, false, null);
        String code = getTupleCode(keys, elementList, (NestedByIndexType)type, visitor);

        return new FirstPrefixElem(code, "", type, null);
    }
    static public String getTupleCode(ArrayList<String> keys, List<SwiftParser.Expression_elementContext> elementList, NestedByIndexType type, Visitor visitor) {
        String code = "";
        if(visitor.targetLanguage.equals("ts")) {
            code += "{";
            for(int i = 0; i < elementList.size(); i++) {
                String key = keys != null ? keys.get(i) : elementList.get(i).identifier() != null ? elementList.get(i).identifier().getText() : i + "";
                String val = visitor.visit(elementList.get(i).expression());
                if(i > 0) code += ",";
                code += "'" + key + "':" + val;
            }
            code += "}";
        }
        else {
            code += "new InitializableHashMap<String, Object>(";
            for(int i = 0; i < elementList.size(); i++) {
                String key = keys != null ? keys.get(i) : elementList.get(i).identifier() != null ? elementList.get(i).identifier().getText() : i + "";
                String val = visitor.visit(elementList.get(i).expression());
                if(i > 0) code += ",";
                code += "new Pair<String, " + type.resulting(key).targetType(visitor.targetLanguage) + ">(\"" + key + "\", " + val + ")";
            }
            code += ")";
        }
        return code;
    }*/

    static private FirstPrefixElem getArray(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {

        SwiftParser.Array_literalContext arrayLiteral = ((SwiftParser.Primary_expressionContext) rChild).literal_expression().array_literal();

        if(arrayLiteral.array_literal_items() != null && type == null) {
            SwiftParser.ExpressionContext wrappedExpression = arrayLiteral.array_literal_items().array_literal_item(0).expression();
            Instance wrappedType = functionCallParams != null ? new BasicType(wrappedExpression.getText()) : Type.infer(wrappedExpression, visitor);
            type = visitor.cache.find("Array", rChild).object.definition.toInstance();
            type.generics = new ArrayList<Instance>();
            type.generics.add(wrappedType);
        }

        String code = getArrayCode(arrayLiteral, rChild, type, functionCallParams, visitor);

        return new FirstPrefixElem(code, "", type, null);
    }

    static private String getArrayCode(SwiftParser.Array_literalContext arrayLiteral, ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {

        //TODO [1, 2] are special case; for others, revert to inbuilt inits
        String repeatedElement = null, arraySize = "";
        if(functionCallParams != null) {
            if(functionCallParams.size() == 2 && functionCallParams.get(0) instanceof SwiftParser.Expression_elementContext && ((SwiftParser.Expression_elementContext) functionCallParams.get(0)).identifier().getText().equals("repeating") && functionCallParams.get(1) instanceof SwiftParser.Expression_elementContext && ((SwiftParser.Expression_elementContext) functionCallParams.get(1)).identifier().getText().equals("count")) {
                arraySize = visitor.visit(((SwiftParser.Expression_elementContext) functionCallParams.get(1)).expression());
                repeatedElement = visitor.visit(((SwiftParser.Expression_elementContext) functionCallParams.get(0)).expression());
            }
        }

        if(visitor.targetLanguage.equals("ts")) {
            if(functionCallParams != null) {
                return "new Array(" + arraySize + ")" + (repeatedElement != null ? ".fill(" + repeatedElement + ")" : "");
            }
            else {
                String code = visitor.visit(rChild);
                if(type != null && type.uniqueId().equals("Set")) code = "new Set(" + code + ")";
                return code;
            }
        }
        else {
            if(functionCallParams != null) {
                if(repeatedElement != null) {
                    return "new " + type.targetType(visitor.targetLanguage, true, false) + "(Collections.nCopies(" + arraySize + ", " + repeatedElement + "))";
                }
                return "new " + type.targetType(visitor.targetLanguage, true, false) + "(" + arraySize + ")";
            }
            else if(arrayLiteral.array_literal_items() != null) {
                List<SwiftParser.Array_literal_itemContext> values = arrayLiteral.array_literal_items().array_literal_item();
                String valuesList = "";
                for(int i = 0; i < values.size(); i++) {
                    valuesList += (i > 0 ? ", " : "") + values.get(i).getText();
                }
                return "new " + type.targetType(visitor.targetLanguage, true, false) + "(Arrays.asList(" + valuesList + "))";
            }
            else {
                return "new " + type.targetType(visitor.targetLanguage, true, false) + "()";
            }
        }
    }

    static private FirstPrefixElem getDictionary(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {

        SwiftParser.Dictionary_literalContext dictionaryLiteral = ((SwiftParser.Primary_expressionContext) rChild).literal_expression().dictionary_literal();
        String code;

        if(WalkerUtil.isDirectDescendant(SwiftParser.Empty_dictionary_literalContext.class, dictionaryLiteral)) {
            code = visitor.targetLanguage.equals("ts") ? "{}" : "new " + type.targetType(visitor.targetLanguage, true, false) + "()";
        }
        else {
            List<SwiftParser.ExpressionContext> keyVal = dictionaryLiteral.dictionary_literal_items().dictionary_literal_item(0).expression();
            if(type == null) type = new NestedType("Dictionary", Type.infer(keyVal.get(0), visitor), Type.infer(keyVal.get(1), visitor), false, null);
            code = getDictionaryInitializerCode(dictionaryLiteral, (NestedType)type, visitor);
        }

        return new FirstPrefixElem(code, "", type, null);
    }

    static private String getDictionaryInitializerCode(SwiftParser.Dictionary_literalContext dictionaryLiteral, NestedType dictionaryType, Visitor visitor) {
        if(visitor.targetLanguage.equals("ts")) {
            return '{' + visitor.visitWithoutStrings(dictionaryLiteral, "[]") + '}';
        }
        else {
            String diamond = dictionaryType.keyType.targetType(visitor.targetLanguage) + ", " + dictionaryType.valueType.targetType(visitor.targetLanguage);
            String code = "new " + dictionaryType.targetType(visitor.targetLanguage, true, false) + "(";
            List<SwiftParser.Dictionary_literal_itemContext> items = dictionaryLiteral.dictionary_literal_items().dictionary_literal_item();
            for(int i = 0; i < items.size(); i++) {
                code += (i > 0 ? ", " : "") + "new Pair<" + diamond + ">(" + visitor.visitChildren(items.get(i).expression(0)) + ", " + visitor.visitChildren(items.get(i).expression(1)) + ")";
            }
            code += ")";
            return code;
        }
    }

    static private FirstPrefixElem getTemplatedConstructor(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {

        SwiftParser.Generic_argument_clauseContext template = ((SwiftParser.Primary_expressionContext) rChild).generic_argument_clause();
        String typeStr = visitor.visit(rChild.getChild(0)).trim();

        if(typeStr.equals("Set")) {
            if(type == null) type = new NestedType("Set", new BasicType("Int"), new BasicType(template.generic_argument_list().generic_argument(0).getText()), false, null);
            return new FirstPrefixElem(visitor.targetLanguage.equals("ts") ? "new Set()" : "new " + type.targetType(visitor.targetLanguage, true, false) + "()", "", type, null);
        }

        return null;
    }

    static private FirstPrefixElem getLiteral(ParserRuleContext rChild, Instance type, Visitor visitor) {
        String code = visitor.visit(rChild);
        if(WalkerUtil.isDirectDescendant(SwiftParser.Nil_literalContext.class, rChild)) {
            type = new BasicType("Void");
            code = "null ";
        }
        else {
            if(WalkerUtil.isDirectDescendant(SwiftParser.Integer_literalContext.class, rChild)) type = new BasicType("Int");
            else if(WalkerUtil.isDirectDescendant(SwiftParser.Numeric_literalContext.class, rChild)) type = new BasicType("Double");
            else if(WalkerUtil.isDirectDescendant(SwiftParser.String_literalContext.class, rChild)) type = new BasicType("String");
            else if(WalkerUtil.isDirectDescendant(SwiftParser.Boolean_literalContext.class, rChild)) type = new BasicType("Bool");
        }
        return new FirstPrefixElem(code, "", type, null);
    }

    static private FirstPrefixElem getClosure(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {
        return new FirstPrefixElem(FunctionUtil.closureExpression(((SwiftParser.Primary_expressionContext) rChild).closure_expression(), type, functionCallParams, visitor), "", type, null);
    }
    
    static private FirstPrefixElem getIdentifier(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {
        //TODO look in cache, if not found return this

        String code = visitor.visit(rChild).trim();

        if(type == null) {
            CacheBlockAndObject cache = visitor.cache.findLoose(code, rChild);
            type = cache.object.instance;
            if(EntityCache.isStructureBlock(cache.block)) {
                code = "this." + code;
            }
            else if(code.equals("self")) {
                code = "this";
            }
            //if(functionCallParams != null/* && type instanceof FunctionType*/) type = type.resulting("()");
        }

        return new FirstPrefixElem(code, "", type, null);
    }
}
