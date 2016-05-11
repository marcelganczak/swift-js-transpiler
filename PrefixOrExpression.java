import org.antlr.v4.runtime.ParserRuleContext;

public interface PrefixOrExpression {
    String code();
    AbstractType type();
    ParserRuleContext originalCtx();
}
