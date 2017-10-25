import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public interface PrefixOrExpression {
    String code(ParseTree ctx, Visitor visitor);
    Instance type();
    ParserRuleContext originalCtx();
}
