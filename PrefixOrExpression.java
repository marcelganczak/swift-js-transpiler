import org.antlr.v4.runtime.ParserRuleContext;

public interface PrefixOrExpression {
    String code(Visitor visitor);
    Instance type();
    ParserRuleContext originalCtx();
}
