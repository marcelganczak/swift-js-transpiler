import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Iterator;

public class MyListener extends SwiftBaseListener {

    @Override public void exitTop_level(SwiftParser.Top_levelContext ctx) {
        System.out.println("exitTop_level");
    }

    /*@Override public void exitDeclaration(SwiftParser.DeclarationContext ctx) {
        System.out.println("exitDeclaration");
        System.out.println(ctx.getText());
    }

    @Override public void exitInteger_literal(SwiftParser.Integer_literalContext ctx) {
        System.out.println("exitInteger_literal");
        System.out.println(ctx.start.getText());
        System.out.println(ctx.stop.getText());
    }

    @Override public void exitVariable_declaration_head(SwiftParser.Variable_declaration_headContext ctx) {
        System.out.println("exitVariable_declaration_head");
        System.out.println(ctx.start.getText());
        System.out.println(ctx.stop.getText());
    }

    @Override public void exitStatement(SwiftParser.StatementContext ctx) {
        System.out.println("exitStatement");
        System.out.println(ctx.getText());
    }*/

    @Override public void exitFor_in_statement(SwiftParser.For_in_statementContext ctx) {
        System.out.println(ctx.getText());
        System.out.println("------->");
        System.out.println("_.each(" + this.getAnyNode(ctx, 3).getText() + ", " + this.getAnyNode(ctx, 1).getText() + " => " + this.getAnyNode(ctx, 4).getText() + ")");
        //System.out.println(ctx.getChildCount());
    }

    /*@Override public void exitIdentifier(SwiftParser.IdentifierContext ctx) {
        System.out.println("exitIdentifier");
        System.out.println(ctx.getText());
        System.out.println(ctx.getChildCount());
    }

    @Override public void exitVariable_declaration(SwiftParser.Variable_declarationContext ctx) {
        System.out.println("exitVariable_declaration");
        System.out.println(ctx.start.getText());
        System.out.println(ctx.stop.getText());
    }*/

    private ParseTree getAnyNode(ParserRuleContext ctx, int i) {
        int j = -1;
        Iterator i$ = ctx.children.iterator();

        while(i$.hasNext()) {
            ParseTree o = (ParseTree)i$.next();
            ++j;
            if(j == i) {
                return o;
            }
        }
        return null;
    }
}
