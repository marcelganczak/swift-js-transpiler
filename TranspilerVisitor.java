import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.ArrayList;
import java.util.List;

public class TranspilerVisitor extends NativeOverriddenVisitor {

    protected EntityCache cache = new EntityCache();

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

    public String lodashMethod(AbstractType lType, String R) {
        if(lType != null && lType.jsType().equals("Object")) return JsDictionaryMethod.translate(R);
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

    class JsChainResult {
        public String code;
        public AbstractType type;
        JsChainResult(String code, AbstractType type) {this.code = code; this.type = type;}
    }
    public JsChainResult jsChain(ArrayList<ParserRuleContext> chain, int chainPos, String L, AbstractType lType) {
        //if(chainPos >= chain.size()) return new JsChainResult(L, lType);

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

        String R = lodashMethod != null ? lodashMethod : identifierText != null ? (L.length() > 0 ? "." : "") + identifierText : WalkerUtil.isDirectDescendant(SwiftParser.Parenthesized_expressionContext.class, rChild) ? "[" + visitWithoutStrings((RuleNode) rChild.getChild(0), "()") + "]" : visit(rChild);

        String LR = lodashMethod != null ? "_." + lodashMethod + "(" + L + (functionParameters != null ? "," + functionParameters : "") + ")" : L + R + (functionCall != null ? "(" + functionParameters + ")" : "");

        JsChainResult nextChain =
                chainPos + 1 < chain.size() ? jsChain(chain, chainPos + 1, LR, Type.resulting(lType, identifierText, chain.get(0), this))
                                            : new JsChainResult(L, Type.resulting(lType, identifierText, chain.get(0), this));

        boolean isOptional = rChild.getChild(0).getText().equals("?");
        if(isOptional) {
            nextChain.code = "(" + L + "!= null ? " + nextChain.code + " : null )";
        }

        return nextChain;
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
        AbstractType type = Type.fromDefinition(ctx.function_signature().function_result().type());

        cache.cacheOne(jsFunctionName, type, ctx);

        return "function " + jsFunctionName + "(" + jsParameters + ")" + type.jsType() + "{" + defaultValues + visitWithoutStrings(ctx.function_body().code_block(), "{}") + "}";
    }
};
