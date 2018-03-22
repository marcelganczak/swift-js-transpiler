import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class Visitor extends SwiftBaseVisitor<String> {

    public Cache cache;
    protected String targetLanguage;

    @Override protected String aggregateResult(String aggregate, String nextResult) {
        return aggregate + nextResult;
    }

    @Override protected String defaultResult() {
        return "";
    }

    @Override public String visitChildren(RuleNode node) { return visitChildren(node, null); }

    public String visitChildren(RuleNode node, List<Integer> withoutNodes) {
        if(node == null) return "";
        String result = this.defaultResult();
        int n = node.getChildCount();

        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            if(withoutNodes != null && withoutNodes.contains(i)) continue;
            ParseTree c = node.getChild(i);
            String childResult = c instanceof TerminalNode ? printTerminalNode((TerminalNode) c) : c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        return result;
    }

    public String visitWithoutTerminals(RuleNode node) {
        String result = this.defaultResult();
        int n = node.getChildCount();

        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            if(c instanceof TerminalNode) continue;
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        return result;
    }

    public String visitWithoutStrings(RuleNode node, String string) {
        String result = this.defaultResult();
        int n = node.getChildCount();

        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            if(string.contains(c.getText())) continue;
            String childResult = c instanceof TerminalNode ? printTerminalNode((TerminalNode) c) : c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        return result;
    }

    public String visitWithoutClasses(RuleNode node, Class nodeType) {
        String result = this.defaultResult();
        int n = node.getChildCount();

        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            if(c.getClass() == nodeType) continue;
            String childResult = c instanceof TerminalNode ? printTerminalNode((TerminalNode) c) : c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        return result;
    }

    protected String printTerminalNode(TerminalNode c) {
        String text = c.getText();
        if(text.equals("<EOF>")) {
            return "";
        }
        else if(text.equals(".")) {
            return ".";
        }
        return text + " ";
    }
};
