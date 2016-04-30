import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class TranspilerVisitor extends NativeOverriddenVisitor {

    protected CodeBlockCache cache = new CodeBlockCache();

    protected String resultingType(String lType, String accessor) {
        //TODO
        return null;
    }

    public String jsForIn(SwiftParser.For_in_statementContext ctx) {
        return "_.each(" + visit(ctx.expression()) + ", " + visit(ctx.pattern()) + " => " + visit(ctx.code_block()) + ")";
    }

    public String jsDictionaryLiteral(SwiftParser.Dictionary_literalContext ctx) {
        if(WalkerUtil.isDirectDescendant(SwiftParser.Empty_dictionary_literalContext.class, ctx)) return "{}";
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
        if(lType != null && lType.equals("Object")) return JsDictionaryMethod.translate(R);
        return null;
    }

    public ArrayList<ParserRuleContext> flattenChain(SwiftParser.Prefix_expressionContext ctx) {
        ArrayList<ParserRuleContext> flattened = new ArrayList<ParserRuleContext>();
        SwiftParser.Postfix_expressionContext postfix = ctx.postfix_expression();
        while(postfix.postfix_expression() != null) {
            if(postfix.chain_postfix_expression() != null) flattened.add(0, postfix.chain_postfix_expression());
            postfix = postfix.postfix_expression();
        }
        flattened.add(0, postfix.primary_expression());
        return flattened;
    }

    public String functionNameWithExternalParams(String functionName, List<SwiftParser.Expression_elementContext> parameters) {
        String externalNames = "";
        for(int i = 0; i < parameters.size(); i++) {
            SwiftParser.Expression_elementContext parameter = parameters.get(i);
            if(parameter.identifier() != null) {
                externalNames += "$" + parameter.identifier().getText();
            }
            else {
                externalNames += "$";
            }
        }
        if(externalNames.equals("$")) externalNames = "";
        return functionName + externalNames;
    }

    public String jsChain(ArrayList<ParserRuleContext> chain, int chainPos, String L, String lType) {
        if(chainPos >= chain.size()) return L;

        ParserRuleContext rChild = chain.get(chainPos);
        SwiftParser.IdentifierContext identifier = rChild instanceof SwiftParser.Explicit_member_expressionContext ? ((SwiftParser.Explicit_member_expressionContext) rChild).identifier() : rChild instanceof SwiftParser.Primary_expressionContext ? ((SwiftParser.Primary_expressionContext) rChild).identifier() : null;
        String identifierText = identifier != null ? identifier.getText() : null;

        SwiftParser.Function_call_expressionContext functionCall = null;
        if(chainPos < chain.size() - 1 && chain.get(chainPos + 1) instanceof SwiftParser.Function_call_expressionContext) {
            functionCall = (SwiftParser.Function_call_expressionContext) chain.get(chainPos + 1);
        }

        String lodashMethod = null;
        if(identifierText != null) lodashMethod = this.lodashMethod(lType, identifierText);

        String functionParameters = null;
        if(functionCall != null) {
            functionParameters = visitWithoutStrings(functionCall.parenthesized_expression(), "()");
            chainPos++;
        }

        if(lodashMethod == null && identifierText != null && functionCall != null) {
            identifierText = functionNameWithExternalParams(identifierText, functionCall.parenthesized_expression().expression_element_list().expression_element());
        }

        String R = lodashMethod != null ? lodashMethod : identifierText != null ? (L.length() > 0 ? "." : "") + identifierText : visit(rChild);

        String LR = lodashMethod != null ? "_." + lodashMethod + "(" + L + (functionParameters != null ? "," + functionParameters : "") + ")" : L + R + (functionCall != null ? "(" + functionParameters + ")" : "");

        String chainText = jsChain(chain, chainPos + 1, LR, resultingType(lType, identifierText));

        boolean isOptional = rChild.getChild(0).getText().equals("?");
        if(isOptional) {
            return "(" + L + "!= null ? " + chainText + " : null )";
        }
        else {
            return chainText;
        }
    }

    public String toJsIf(SwiftParser.If_statementContext ctx) {
        String condition = visitWithoutStrings(ctx.condition_clause(), "()");
        String beforeBlock = "";
        if(WalkerUtil.isDirectDescendant(SwiftParser.Optional_binding_conditionContext.class, ctx.condition_clause())) {
            SwiftParser.Optional_binding_headContext ifLet = ctx.condition_clause().condition_list().condition(0).optional_binding_condition().optional_binding_head();
            String constVar = visitWithoutTerminals(ifLet.pattern());
            String var = visitWithoutTerminals(ifLet.initializer().expression());
            condition = var + " != null";
            beforeBlock = "const " + constVar + " = " + var + ";";
        }
        return "if(" + condition + ") {" + beforeBlock + visitWithoutStrings(ctx.code_block(), "{") + visitChildren(ctx.else_clause());
    }

    public String jsFunctionDeclaration(SwiftParser.Function_declarationContext ctx) {
        String defaultValues = "", externalNames = "", jsParameters = "";
        List<SwiftParser.ParameterContext> parameters = ctx.function_signature().parameter_clauses().parameter_clause().parameter_list().parameter();

        for(int i = 0; i < parameters.size(); i++) {
            SwiftParser.ParameterContext parameter = parameters.get(i);
            if(parameter.external_parameter_name() != null) {
                externalNames += "$" + (parameter.external_parameter_name().getText().equals("_") ? "" : visit(parameter.external_parameter_name()).trim());
            }
            else {
                externalNames += "$" + (i > 0 ? visit(parameter.local_parameter_name()).trim() : "");
            }
            if(parameter.default_argument_clause() != null) {
                defaultValues += "if(typeof " + visit(parameter.local_parameter_name()) + " === 'undefined') " + visit(parameter.local_parameter_name()) + " = " + visit(parameter.default_argument_clause().expression()) + ";";
            }
            jsParameters += (jsParameters.length() > 0 ? "," : "") + visit(parameter.local_parameter_name()) + visit(parameter.type_annotation());
        }

        if(externalNames.equals("$")) externalNames = "";
        String functionName = visit(ctx.function_name()).trim();
        String jsFunctionName = functionName + externalNames;
        String jsType = visit(ctx.function_signature().function_result()).trim();

        cache.cacheOne(functionName, jsType, jsFunctionName, ctx);

        return "function " + jsFunctionName + "(" + jsParameters + ")" + jsType + "{" + defaultValues + visitWithoutStrings(ctx.function_body().code_block(), "{}") + "}";
    }
};
