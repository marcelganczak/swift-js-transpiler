import org.antlr.v4.runtime.ParserRuleContext;

public interface PrefixOrExpression {
    String code();
    Instance type();
    ParserRuleContext originalCtx();
}
