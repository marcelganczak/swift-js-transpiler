import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

//deals with prefix_expression context (as defined in Swift.g4), e.g instance.method() or instance[2]
//breaks up the chain into PrefixElems, e.g.:
// - [{code: "instance", type: "Class"}, {code: "method", functionCallParams: [], typeBeforeCall: "Function", type: "Void"}]
// - [{code: "instance", type: "Class"}, {code: "2", isSubscript: true, typeBeforeCall: "Function", type: "String"}]
//computes the code by running through the PrefixElems and joining them
//in the process, works out code replacement:
// - for native classes (e.g. string.characters.count -> string.length)
// - for assignments (e.g. dictionary["key"] = null -> delete dictionary["key"])
public class Prefix implements PrefixOrExpression {

    private ParserRuleContext originalCtx;
    private SwiftParser.Prefix_operatorContext prefixOperatorContext;
    public ArrayList<PrefixElem> elems = new ArrayList<PrefixElem>();
    public ParserRuleContext originalCtx() {return originalCtx;}

    public Prefix(SwiftParser.Prefix_expressionContext prefixCtx, Instance knownType, Visitor visitor) {
        ArrayList<ParserRuleContext> chain = flattenChain(prefixCtx);
        originalCtx = prefixCtx;
        prefixOperatorContext = prefixCtx.prefix_operator();

        Instance currType = null;
        boolean nextIsOptional = false;
        
        for(int chainPos = 0; chainPos < chain.size(); chainPos++) {
            ParserRuleContext ctx = chain.get(chainPos);

            List<ParserRuleContext/*Expression_elementContext or Closure_expressionContext*/> functionCallParams = null;
            if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_expressionContext) {
                SwiftParser.Function_call_expressionContext functionCall = (SwiftParser.Function_call_expressionContext) chain.get(chainPos + 1);
                functionCallParams = new ArrayList<ParserRuleContext>();
                if(functionCall.parenthesized_expression().expression_element_list() != null) for(int i = 0; i < functionCall.parenthesized_expression().expression_element_list().expression_element().size(); i++) functionCallParams.add(functionCall.parenthesized_expression().expression_element_list().expression_element().get(i));
            }
            else if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_with_closure_expressionContext) {
                SwiftParser.Function_call_with_closure_expressionContext functionCall = (SwiftParser.Function_call_with_closure_expressionContext) chain.get(chainPos + 1);
                functionCallParams = new ArrayList<ParserRuleContext>();
                if(functionCall.parenthesized_expression() != null && functionCall.parenthesized_expression().expression_element_list() != null) for(int i = 0; i < functionCall.parenthesized_expression().expression_element_list().expression_element().size(); i++) functionCallParams.add(functionCall.parenthesized_expression().expression_element_list().expression_element().get(i));
                functionCallParams.add(functionCall.trailing_closure().explicit_closure_expression());
            }

            PrefixElem elem = PrefixElem.get(ctx, functionCallParams, chain, chainPos, currType, (chainPos + (functionCallParams != null ? 1 : 0) >= chain.size() - 1) ? knownType : null, visitor);
            Map<String, String> codeReplacement = elem.codeReplacement();
            boolean skip = codeReplacement != null && codeReplacement.containsKey(visitor.targetLanguage) && codeReplacement.get(visitor.targetLanguage).equals("");

            if(functionCallParams != null) {
                chainPos++;
                if(visitor instanceof CacheVisitor) {
                    for(int i = 0; i < functionCallParams.size(); i++) {
                        if(functionCallParams.get(i) instanceof SwiftParser.Explicit_closure_expressionContext) {
                            ((CacheVisitor)visitor).visitExplicit_closure_expression(elem, (SwiftParser.Explicit_closure_expressionContext)functionCallParams.get(i), i);
                        }
                    }
                }
            }

            if(!skip) {
                elems.add(elem);
                currType = elem.type;
            }

            if(nextIsOptional) {
                nextIsOptional = false;
                elem.isOptional = true;
            }
            if(ctx.getChild(0).getText().equals("?")) {
                if(!skip) elem.isOptional = true;
                else nextIsOptional = true;
            }
        }
    }

    public String code(ParseTree ctx, Visitor visitor) {
        return elemCode(elems, 0, initString(), null, prefixOperatorContext != null && prefixOperatorContext.getText().equals("&"), ctx, visitor);
    }
    public String code(String assignment, ParseTree ctx, Visitor visitor) {
        return elemCode(elems, 0, initString(), assignment, prefixOperatorContext != null && prefixOperatorContext.getText().equals("&"), ctx, visitor);
    }
    public String code(String assignment, int limit, ParseTree ctx, Visitor visitor) {
        return elemCode(elems.subList(0, limit), 0, initString(), assignment, prefixOperatorContext != null && prefixOperatorContext.getText().equals("&"), ctx, visitor);
    }
    private String initString() {
        return prefixOperatorContext != null && !prefixOperatorContext.getText().equals("&") ? prefixOperatorContext.getText() : "";
    }
    static public Map<String, String> replacements(List<PrefixElem> elems, int chainPos, boolean isLast, String assignment, Visitor visitor) {
        PrefixElem elem = elems.get(chainPos);
        Map<String, String> codeReplacement = elem.codeReplacement();
        if(chainPos > 0 && elems.get(chainPos - 1).type.definition instanceof ClassDefinition && ((ClassDefinition) elems.get(chainPos - 1).type.definition).superClass != null && ((ClassDefinition)((ClassDefinition) elems.get(chainPos - 1).type.definition).superClass.object).name.equals("Tuple")) {
            codeReplacement = new HashMap<String, String>();
            codeReplacement.put("java", "((" + elem.type.targetType(visitor.targetLanguage) + ")#L.get(\"#R\"))");
            codeReplacement.put("javaAssignment", "#L.put(\"#R\", #ASS)");
        }
        Map<String, String> replacements = new HashMap<String, String>();
        if(codeReplacement != null && codeReplacement.containsKey(visitor.targetLanguage)) replacements.put("", codeReplacement.get(visitor.targetLanguage));
        if(codeReplacement != null && isLast && assignment != null && assignment.contains("T") && codeReplacement.containsKey(visitor.targetLanguage + "Assignment")) replacements.put("T", codeReplacement.get(visitor.targetLanguage + "Assignment"));
        if(codeReplacement != null && isLast && assignment != null && assignment.contains("N") && codeReplacement.containsKey(visitor.targetLanguage + "AssignmentNil")) replacements.put("N", codeReplacement.get(visitor.targetLanguage + "AssignmentNil"));
        return replacements;
    }
    static private String elemCode(List<PrefixElem> elems, int chainPos, String L, String assignment/*null/"T"/"N"/"TN"*/, boolean isInOutExpression, ParseTree ctx, Visitor visitor) {
        PrefixElem elem = elems.get(chainPos);
        boolean isLast = chainPos + 1 >= elems.size();

        String LR;
        Map<String, String> replacement = replacements(elems, chainPos, isLast, assignment, visitor);
        if(!replacement.isEmpty()) {
            LR =
                replacement.containsKey("T") && replacement.containsKey("N") ? "if((#ASS) != null) { " + replacement.get("T") + "; } else { " + replacement.get("N") + "; }" :
                replacement.containsKey("T") ? replacement.get("T") :
                replacement.containsKey("N") ? replacement.get("N") :
                replacement.get("");
        }
        else {
            LR = "#L" + (chainPos == 0 ? "#R" : elem.isSubscript ? "[#R]" : ".#R");
            if(isLast) {
                if(assignment != null) {
                    if(elem.type.isGetterSetter) LR += "$set(#ASS)";
                    else if(elem.type.isInout) LR += ".set(#ASS)";
                }
                else {
                    if(elem.type.isGetterSetter) LR += "$get()";
                    else if(elem.type.isInout) LR += ".get()";
                }
            }
            if(elem.initializerSignature != null) LR = "new " + LR + "(\"" + elem.initializerSignature + "\",#AA)";
            else if(elem.functionCallParams != null) LR += "(#AA)";
        }

        LR = LR.replaceAll("#L", Matcher.quoteReplacement(L)).replaceAll("#R", Matcher.quoteReplacement(elem.code.trim()));
        if(elem.functionCallParams != null) {
            String paramsJoined = "";
            for(int i = 0; i < elem.functionCallParams.size(); i++) paramsJoined += (i > 0 ? ", " : "") + elem.functionCallParams.get(i);
            LR = LR.replaceAll("#AA", Matcher.quoteReplacement(paramsJoined));
            for(int i = 0; i < elem.functionCallParams.size(); i++) LR = LR.replaceAll("#A" + i, Matcher.quoteReplacement(elem.functionCallParams.get(i)));
        }
        if(elem.type.generics != null) {
            for(String key : elem.type.generics.keySet()) LR = LR.replaceAll("#" + key, Matcher.quoteReplacement(elem.type.generics.get(key).targetType(visitor.targetLanguage, false, true)));
        }

        String nextCode =
                !isLast ? elemCode(elems, chainPos + 1, LR, assignment, isInOutExpression, ctx, visitor)
                : LR;

        if(elem.isOptional && assignment == null) {
            nextCode = "(" + L + "!= null ? " + nextCode + " : null )";
        }

        if(elem.initializerSignature != null) {
            Instance initializer = elem.type.getProperty("init" + elem.initializerSignature);
            if(initializer != null && initializer.isFailableInitializer) {
                nextCode = "_.failableInit(" + nextCode + ")";
            }
        }

        if(isLast && isInOutExpression) {
            nextCode = "{get: () => " + nextCode + ", set: $val => " + nextCode + " = $val}";
        }

        return nextCode;
    }

    public Instance type() {
        return elems.get(elems.size() - 1).type.withoutPropertyInfo();
    }

    public boolean hasOptionals() {
        for(int i = 0; i < elems.size(); i++) {
            if(elems.get(i).isOptional) return true;
        }
        return false;
    }

    static private ArrayList<ParserRuleContext> flattenChain(SwiftParser.Prefix_expressionContext ctx) {
        ArrayList<ParserRuleContext> flattened = new ArrayList<ParserRuleContext>();
        SwiftParser.Postfix_expressionContext postfix = ctx.postfix_expression();
        while(postfix.postfix_expression() != null) {
            if(postfix.chain_postfix_expression() != null && !(postfix.chain_postfix_expression() instanceof SwiftParser.Chain_postfix_operatorContext)) {
                flattened.add(0, postfix.chain_postfix_expression());
                if(postfix.chain_postfix_expression() instanceof SwiftParser.Explicit_member_expression_number_doubleContext) flattened.add(0, postfix.chain_postfix_expression());
            }
            postfix = postfix.postfix_expression();
        }
        flattened.add(0, postfix.primary_expression());
        return flattened;
    }
}
