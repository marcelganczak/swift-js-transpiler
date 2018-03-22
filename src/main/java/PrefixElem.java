import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

//deals with primary_expression and chain_postfix_expression context (as defined in Swift.g4), e.g instance.method() or instance[2]
//primary_expression is always the first element in the chain and can be an identifier (varA) or a literal ([] or 1)
//works out the type from the identifier/literal
//also has some hardcoded functionality for more complicated literals such as ["key": "val"] or [Int](repeating: 0, count: 3)
//chain_postfix_expression are the successive elements in the chain, such as .methodCall() or [2]
public class PrefixElem {
    public String code;
    public boolean isSubscript;
    public Instance type;
    public List<String> functionCallParams;
    public Object/*Defintion/Instance*/ typeBeforeCall;
    public String initializerSignature;
    public boolean isOptional;
    public PrefixElem(String code, boolean isSubscript, Instance type, List<String> functionCallParams, Object typeBeforeCall, String initializerSignature) { this.code = code; this.isSubscript = isSubscript; this.type = type; this.functionCallParams = functionCallParams; this.typeBeforeCall = typeBeforeCall; this.initializerSignature = initializerSignature; this.isOptional = false; }

    static public PrefixElem get(ParserRuleContext rChild, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, ArrayList<ParserRuleContext> chain, int chainPos, Instance lType, Instance rType, Visitor visitor) {

        if(chainPos == 0 && WalkerUtil.isDirectDescendant(SwiftParser.Parenthesized_expressionContext.class, rChild)) {
            if(isTuple(rChild)) {
                return getTuple(rChild, visitor, rType);
            }
            else {
                Expression parenthesized = new Expression(((SwiftParser.Primary_expressionContext) rChild).parenthesized_expression().expression_element_list().expression_element(0).expression(), rType, visitor);
                return new PrefixElem("(" + parenthesized.code + ")", false, parenthesized.type, null, null, null);
            }
        }
        if(chainPos == 0 && WalkerUtil.isDirectDescendant(SwiftParser.Array_literalContext.class, rChild)) {
            return getArray(rChild, rType, functionCallParams, visitor);
        }
        if(chainPos == 0 && WalkerUtil.isDirectDescendant(SwiftParser.Dictionary_literalContext.class, rChild)) {
            return getDictionary(rChild, rType, functionCallParams, visitor);
        }
        if(chainPos == 0 && rChild instanceof SwiftParser.Primary_expressionContext && ((SwiftParser.Primary_expressionContext) rChild).generic_argument_clause() != null) {
            return getTemplatedConstructor(rChild, rType, functionCallParams, visitor);
        }
        if(chainPos == 0 && WalkerUtil.isDirectDescendant(SwiftParser.LiteralContext.class, rChild)) {
            return getLiteral(rChild, rType, visitor);
        }
        if(chainPos == 0 && WalkerUtil.isDirectDescendant(SwiftParser.Closure_expressionContext.class, rChild)) {
            return getClosure(rChild, rType, functionCallParams, visitor);
        }
        return getBasic(rChild, functionCallParams, chain, chainPos, lType, rType, visitor);
    }

    static private boolean isTuple(ParserRuleContext rChild) {
        SwiftParser.Expression_element_listContext tupleLiteral = ((SwiftParser.Primary_expressionContext) rChild).parenthesized_expression().expression_element_list();
        List<SwiftParser.Expression_elementContext> elementList = tupleLiteral.expression_element();
        if(elementList.size() <= 1) return false;
        return true;
    }
    static public PrefixElem getTuple(ParserRuleContext rChild, Visitor visitor, Instance type) {
        SwiftParser.Expression_element_listContext tupleLiteral = ((SwiftParser.Primary_expressionContext) rChild).parenthesized_expression().expression_element_list();
        List<SwiftParser.Expression_elementContext> elementList = tupleLiteral.expression_element();
        LinkedHashMap<String, Instance> types = new LinkedHashMap<String, Instance>();

        ArrayList<String> keys = null;
        if(type != null) keys = new ArrayList<String>(((ClassDefinition)type.definition).properties.keySet());

        for(int i = 0, elementI = 0; i < tupleLiteral.getChildCount(); i++) {
            if(!(tupleLiteral.getChild(i) instanceof SwiftParser.Expression_elementContext)) continue;
            SwiftParser.Expression_elementContext child = (SwiftParser.Expression_elementContext) tupleLiteral.getChild(i);
            String index = child.identifier() != null ? child.identifier().getText() : Integer.toString(elementI);
            if(type == null) types.put(index, TypeUtil.infer(child.expression(), visitor));
            elementI++;
        }

        if(type == null) {
            ClassDefinition tupleDefinition = new ClassDefinition(null, visitor.cache.find("Tuple", rChild), types, new ArrayList<String>());
            type = new Instance(tupleDefinition);
        }
        String code = getTupleCode(keys, elementList, type, rChild, visitor);

        return new PrefixElem(code, false, type, null, null, null);
    }
    static public String getTupleCode(ArrayList<String> keys, List<SwiftParser.Expression_elementContext> elementList, Instance type, ParserRuleContext ctx, Visitor visitor) {
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
                code += "new Pair<String, " + type.getProperty(key).targetType(visitor.targetLanguage) + ">(\"" + key + "\", " + val + ")";
            }
            code += ")";
        }
        return code;
    }

    static private PrefixElem getArray(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {

        SwiftParser.Array_literalContext arrayLiteral = ((SwiftParser.Primary_expressionContext) rChild).literal_expression().array_literal();

        if(arrayLiteral.array_literal_items() != null && type == null) {
            SwiftParser.ExpressionContext wrappedExpression = arrayLiteral.array_literal_items().array_literal_item(0).expression();
            Instance wrappedType = functionCallParams != null ? new Instance(wrappedExpression.getText(), rChild, visitor.cache) : TypeUtil.infer(wrappedExpression, visitor);
            type = new Instance("Array", rChild, visitor.cache);
            type.generics = new HashMap<String, Instance>();
            type.generics.put("Value", wrappedType);
        }

        String code = getArrayCode(arrayLiteral, rChild, type, functionCallParams, visitor);

        return new PrefixElem(code, false, type, null, null, null);
    }

    static private String getArrayCode(SwiftParser.Array_literalContext arrayLiteral, ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {

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

    static private PrefixElem getDictionary(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {

        SwiftParser.Dictionary_literalContext dictionaryLiteral = ((SwiftParser.Primary_expressionContext) rChild).literal_expression().dictionary_literal();
        String code;

        if(WalkerUtil.isDirectDescendant(SwiftParser.Empty_dictionary_literalContext.class, dictionaryLiteral)) {
            code = visitor.targetLanguage.equals("ts") ? "{}" : "new " + type.targetType(visitor.targetLanguage, true, false) + "()";
        }
        else {
            List<SwiftParser.ExpressionContext> keyVal = dictionaryLiteral.dictionary_literal_items().dictionary_literal_item(0).expression();
            if(type == null) {
                type = new Instance("Dictionary", rChild, visitor.cache);
                type.generics = new HashMap<String, Instance>();
                type.generics.put("Key", TypeUtil.infer(keyVal.get(0), visitor));
                type.generics.put("Value", TypeUtil.infer(keyVal.get(1), visitor));
            }
            code = getDictionaryInitializerCode(dictionaryLiteral, type, visitor);
        }

        return new PrefixElem(code, false, type, null, null, null);
    }

    static private String getDictionaryInitializerCode(SwiftParser.Dictionary_literalContext dictionaryLiteral, Instance dictionaryType, Visitor visitor) {
        if(visitor.targetLanguage.equals("ts")) {
            return '{' + visitor.visitWithoutStrings(dictionaryLiteral, "[]") + '}';
        }
        else {
            String diamond = dictionaryType.generics.get("Key").targetType(visitor.targetLanguage) + ", " + dictionaryType.generics.get("Value").targetType(visitor.targetLanguage);
            String code = "new " + dictionaryType.targetType(visitor.targetLanguage, true, false) + "(";
            List<SwiftParser.Dictionary_literal_itemContext> items = dictionaryLiteral.dictionary_literal_items().dictionary_literal_item();
            for(int i = 0; i < items.size(); i++) {
                code += (i > 0 ? ", " : "") + "new Pair<" + diamond + ">(" + visitor.visitChildren(items.get(i).expression(0)) + ", " + visitor.visitChildren(items.get(i).expression(1)) + ")";
            }
            code += ")";
            return code;
        }
    }

    static private PrefixElem getTemplatedConstructor(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {

        SwiftParser.Generic_argument_clauseContext template = ((SwiftParser.Primary_expressionContext) rChild).generic_argument_clause();
        String typeStr = visitor.visit(rChild.getChild(0)).trim();

        if(typeStr.equals("Set")) {
            if(type == null) {
                type = new Instance("Set", rChild, visitor.cache);
                type.generics = new HashMap<String, Instance>();
                type.generics.put("Value", new Instance(template.generic_argument_list().generic_argument(0).getText(), rChild, visitor.cache));
            }
            return new PrefixElem(visitor.targetLanguage.equals("ts") ? "new Set()" : "new " + type.targetType(visitor.targetLanguage, true, false) + "()", false, type, null, null, null);
        }

        return null;
    }

    static private PrefixElem getLiteral(ParserRuleContext rChild, Instance type, Visitor visitor) {
        String code = visitor.visit(rChild);
        if(WalkerUtil.isDirectDescendant(SwiftParser.Nil_literalContext.class, rChild)) {
            type = new Instance("Void", rChild, visitor.cache);
            code = "null ";
        }
        else {
            if(WalkerUtil.isDirectDescendant(SwiftParser.Integer_literalContext.class, rChild)) type = new Instance("Int", rChild, visitor.cache);
            else if(WalkerUtil.isDirectDescendant(SwiftParser.Numeric_literalContext.class, rChild)) type = new Instance("Double", rChild, visitor.cache);
            else if(WalkerUtil.isDirectDescendant(SwiftParser.String_literalContext.class, rChild)) type = new Instance("String", rChild, visitor.cache);
            else if(WalkerUtil.isDirectDescendant(SwiftParser.Boolean_literalContext.class, rChild)) type = new Instance("Bool", rChild, visitor.cache);
        }
        return new PrefixElem(code, false, type, null, null, null);
    }

    static private PrefixElem getClosure(ParserRuleContext rChild, Instance type, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, Visitor visitor) {
        return new PrefixElem(FunctionUtil.closureExpression(((SwiftParser.Primary_expressionContext) rChild).closure_expression(), type, functionCallParams, visitor), false, type, null, null, null);
    }

    static private PrefixElem getBasic(ParserRuleContext rChild, List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams, ArrayList<ParserRuleContext> chain, int chainPos, Instance lType, Instance rType, Visitor visitor) {
        String code = null;
        boolean isSubscript = false;
        List<String> functionCallParamsStr = null;
        Instance type = null;
        Object typeBeforeCall = null;
        if(rChild instanceof SwiftParser.Explicit_member_expressionContext) {
            code = ((SwiftParser.Explicit_member_expressionContext) rChild).identifier().getText();
        }
        else if(rChild instanceof SwiftParser.Primary_expressionContext) {
            code = ((SwiftParser.Primary_expressionContext) rChild).identifier() != null ? ((SwiftParser.Primary_expressionContext) rChild).identifier().getText() : visitor.visit(rChild);
        }
        else if(rChild instanceof SwiftParser.Initializer_expressionContext) {
            code = "init";
        }
        else if(rChild instanceof SwiftParser.Subscript_expressionContext) {
            code = visitor.visit(((SwiftParser.Subscript_expressionContext) rChild).expression_list());
            typeBeforeCall = lType.getProperty("[]");
            type = ((Instance)typeBeforeCall).result();
            isSubscript = true;
        }
        else if(rChild instanceof SwiftParser.Explicit_member_expression_numberContext) {
            code = visitor.visitWithoutStrings(rChild, "?.");
            isSubscript = true;
        }
        else if(rChild instanceof SwiftParser.Explicit_member_expression_number_doubleContext) {
            String[] split = visitor.visit(rChild).split("\\.");
            int pos = 1, i = chainPos;
            while(i > 0 && chain.get(i - 1) instanceof SwiftParser.Explicit_member_expression_number_doubleContext) {i--; pos = pos == 1 ? 2 : 1;}
            code = split[pos].replaceAll("\\?", "");
            isSubscript = true;
        }
        else {
            code = visitor.visit(rChild);
        }

        String augment = null;
        boolean isInitializer = false;
        Cache.CacheBlockAndObject classDefinition = null;
        if(functionCallParams != null) {
            classDefinition = visitor.cache.find(code, rChild);
            isInitializer = lType == null && classDefinition != null && classDefinition.object instanceof ClassDefinition;
        }

        Map<String, Cache.CacheBlockAndObject> allProperties =
            isInitializer ? ((ClassDefinition)classDefinition.object).getAllProperties() :
            lType != null && lType.definition instanceof ClassDefinition ? ((ClassDefinition)lType.definition).getAllProperties() :
            visitor.cache.getAllTypes(rChild);

        if(functionCallParams != null) {
            List<Instance> parameterTypes = FunctionUtil.parameterTypes(functionCallParams, visitor);
            if(parameterTypes != null) augment = FunctionUtil.augmentFromCall(code, parameterTypes, FunctionUtil.parameterExternalNames(functionCallParams), lType, isInitializer, allProperties);
            if(!isInitializer && augment != null) code += augment;
        }

        if(type == null) {
            String varName = code.trim();
            Cache.CacheBlockAndObject cacheBlockAndObject = null;
            Object/*Instance/Definition*/ instanceOrDefinition = null;
            if(lType == null) {
                if(varName.equals("self")) cacheBlockAndObject = visitor.cache.findNearestAncestorStructure(chain.get(0));
                else if(varName.equals("super")) cacheBlockAndObject = ((ClassDefinition)visitor.cache.findNearestAncestorStructure(chain.get(0)).object).superClass;
                else cacheBlockAndObject = visitor.cache.find(varName, chain.get(0));
                if(cacheBlockAndObject != null) instanceOrDefinition = cacheBlockAndObject.object;
            }
            else {
                instanceOrDefinition = lType.getProperty(varName);
            }
            if(instanceOrDefinition == null) {
                cacheBlockAndObject = FunctionUtil.findFirstMatching(varName, isInitializer, allProperties);
                if(cacheBlockAndObject != null) instanceOrDefinition = cacheBlockAndObject.object;
                if(lType != null && instanceOrDefinition instanceof Instance) instanceOrDefinition = lType.specifyGenerics((Instance)instanceOrDefinition);
            }

            if(augment == null && instanceOrDefinition instanceof FunctionDefinition) {
                code = ((FunctionDefinition)instanceOrDefinition).name;
            }
            else if(augment == null && instanceOrDefinition instanceof Instance && ((Instance)instanceOrDefinition).definition instanceof FunctionDefinition) {
                code = ((FunctionDefinition)((Instance)instanceOrDefinition).definition).name;
            }

            if(cacheBlockAndObject != null && Cache.isStructureBlock(cacheBlockAndObject.block)) {
                code = "this." + code;
            }
            else if(varName.equals("self")) {
                code = "this";
                instanceOrDefinition = new Instance((ClassDefinition)instanceOrDefinition);
            }
            else if(varName.equals("super")) {
                instanceOrDefinition = new Instance((ClassDefinition)instanceOrDefinition);
            }
            if(functionCallParams != null) {
                typeBeforeCall = instanceOrDefinition;
                if(instanceOrDefinition instanceof Definition) {
                    if(instanceOrDefinition instanceof FunctionDefinition) type = ((FunctionDefinition)instanceOrDefinition).result;
                    else type = new Instance((Definition)instanceOrDefinition);
                }
                else {
                    type = ((Instance)instanceOrDefinition).result();
                }
            }
            else {
                if(instanceOrDefinition instanceof Definition) {
                    type = new Instance((Definition)instanceOrDefinition);
                }
                else type = (Instance)instanceOrDefinition;
            }
        }

        if(functionCallParams != null) {
            functionCallParamsStr = new ArrayList<String>();
            for(int i = 0; i < functionCallParams.size(); i++) {
                String paramStr;
                if(functionCallParams.get(i) instanceof SwiftParser.Explicit_closure_expressionContext) {
                    paramStr = FunctionUtil.explicitParamClosureExpression(type, typeBeforeCall, (SwiftParser.Explicit_closure_expressionContext) functionCallParams.get(i), i, visitor);
                }
                else {
                    FunctionDefinition functionDefinition =
                        isInitializer ? (FunctionDefinition)type.getProperty("init" + augment).definition :
                        typeBeforeCall instanceof FunctionDefinition ? (FunctionDefinition)typeBeforeCall :
                        typeBeforeCall instanceof Instance ? (FunctionDefinition)((Instance)typeBeforeCall).definition :
                        null;
                    Instance knownType = functionDefinition != null && functionDefinition.parameterTypes.size() >= i + 1 ? type.specifyGenerics(functionDefinition.parameterTypes.get(i).withoutPropertyInfo()) : null;
                    paramStr = new Expression(((SwiftParser.Expression_elementContext)functionCallParams.get(i)).expression(), knownType, visitor).code;
                }
                functionCallParamsStr.add(paramStr);
            }
        }

        return new PrefixElem(code, isSubscript, type, functionCallParamsStr, typeBeforeCall, isInitializer ? augment : null);
    }

    public Map<String, String> codeReplacement() {
        return (
            type.codeReplacement != null ? type.codeReplacement :
            typeBeforeCall instanceof Instance ? ((Instance) typeBeforeCall).codeReplacement :
            typeBeforeCall instanceof FunctionDefinition ? ((FunctionDefinition)typeBeforeCall).codeReplacement :
            initializerSignature != null ? type.getProperty("init" + initializerSignature).codeReplacement :
            null
        );
    }
}
