import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class TranspilerVisitor extends UtilVisitor {

    protected String toJsType(SwiftParser.TypeContext ctx) {
        if(ctx.getChildCount() == 5 && ctx.getChild(0).getText().equals("[") && ctx.getChild(2).getText().equals(":")) return "Object";
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

    public String jsForIn(SwiftParser.For_in_statementContext ctx) {
        return "_.each(" + visit(ctx.expression()) + ", " + visit(ctx.pattern()) + " => " + visit(ctx.code_block()) + ")";
    }

    public String jsDictionaryLiteral(SwiftParser.Dictionary_literalContext ctx) {
        if(ctx.getChildCount() == 3 && ctx.getChild(1).getText().equals(":")) return "{}";
        return '{' + visitChildren(ctx, 1, 1) + '}';
    }

    public String jsFunctionResult(SwiftParser.Function_resultContext ctx) {
        return ":" + visit(ctx.type());
    }

    public boolean isSwiftishDictionaryConstructor(SwiftParser.Function_call_expressionContext ctx) {
        return isDirectDescendant(SwiftParser.Dictionary_literalContext.class, ctx.postfix_expression());
    }

    public boolean isAssignment(SwiftParser.Explicit_member_expression2Context ctx) {
        return ctx.postfix_expression() != null && ctx.identifier() != null && ctx.getChild(1) != null && ctx.getChild(1).getText().equals(".");
    }

    public String jsDictionaryMethod(String varName, String method, SwiftParser.Explicit_member_expression2Context ctx) {
        if(method.equals("count")) {
            return "_.count(" + varName + ")";
        }
        return visitChildren(ctx);
    }
};
