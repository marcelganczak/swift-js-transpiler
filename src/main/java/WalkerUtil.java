import org.antlr.v4.runtime.tree.ParseTree;

public class WalkerUtil {

    public static boolean isDirectDescendant(Class nodeType, ParseTree node) {
        if(node == null) return false;
        if(node.getClass() == nodeType) return true;
        if(node.getChildCount() != 1) return false;
        return isDirectDescendant(nodeType, node.getChild(0));
    }

    public static boolean isRightMostDescendant(Class nodeType, ParseTree node) {
        if(node == null) return false;
        if(node.getClass() == nodeType) return true;
        return isRightMostDescendant(nodeType, node.getChild(node.getChildCount() - 1));
    }

    public static boolean has(Class nodeType, ParseTree node) {
        if(node == null) return false;
        if(node.getClass() == nodeType) return true;
        for(int i = 0; i < node.getChildCount(); i++) {
            if(has(nodeType, node.getChild(i))) return true;
        }
        return false;
    }
}
