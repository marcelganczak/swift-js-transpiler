import org.antlr.v4.runtime.tree.ParseTree;

public class WalkerUtil {

    public static boolean isDirectDescendant(Class nodeType, ParseTree node) {
        if(node == null) return false;
        if(node.getClass() == nodeType) return true;
        if(node.getChildCount() != 1) return false;
        return isDirectDescendant(nodeType, node.getChild(0));
    }
}
