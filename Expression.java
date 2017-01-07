import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class Expression implements PrefixOrExpression {

    String code;
    AbstractType type;
    ParserRuleContext originalCtx;
    public String code() {return code;}
    public AbstractType type() {return type;}
    public ParserRuleContext originalCtx() {return originalCtx;}

    public Expression(SwiftParser.ExpressionContext ctx, AbstractType type, Visitor visitor) {
        this(ctx, type, false, visitor);
    }

    public Expression(SwiftParser.ExpressionContext ctx, AbstractType type, boolean skipFirst, Visitor visitor) {
        originalCtx = ctx;

        List<SwiftParser.Binary_expressionContext> binaries = ctx.binary_expressions() != null ? ctx.binary_expressions().binary_expression() : new ArrayList<SwiftParser.Binary_expressionContext>();
        ArrayList<ParserRuleContext> operators = new ArrayList<ParserRuleContext>();
        ArrayList<Object /*ParserRuleContext or BinaryExpression*/> ctxs = new ArrayList<Object>();

        for(int i = -1 + (skipFirst ? 1 : 0); i < binaries.size(); i++) {
            if(skipFirst ? i >= 1 : i >= 0) {
                SwiftParser.Binary_expressionContext binary = binaries.get(i);
                ctxs.add(binary.prefix_expression());
                operators.add(binary.binary_operator() != null ? binary.binary_operator() : binary.conditional_operator() != null ? binary.conditional_operator() : binary.type_casting_operator());
            }
            else {
                ctxs.add(skipFirst ? binaries.get(0).prefix_expression() : ctx.prefix_expression());
            }
        }

        for(int priority = BinaryExpression.minOperatorPriority; priority <= BinaryExpression.maxOperatorPriority; priority++) {
            for(int i = 0; i < operators.size(); i++) {
                ParserRuleContext operator = operators.get(i);
                if(BinaryExpression.priorityForOperator(operator, visitor) != priority) continue;
                Object L = ctxs.get(i);
                Object R = ctxs.get(i + 1);
                BinaryExpression LR = new BinaryExpression(L, R, operator);
                ctxs.remove(i);
                ctxs.remove(i);
                ctxs.add(i, LR);
                operators.remove(i);
                i--;
            }
        }

        if(ctxs.get(0) instanceof SwiftParser.Prefix_expressionContext) {
            Prefix prefix = new Prefix((SwiftParser.Prefix_expressionContext)ctxs.get(0), type, visitor);
            this.code = prefix.code();
            this.type = prefix.type();
        }
        else {
            BinaryExpression top = (BinaryExpression)ctxs.get(0);
            top.compute(type, visitor);
            this.code = top.code;
            this.type = top.type;
        }
    }

    public Expression(String code, AbstractType type) {
        this.code = code;
        this.type = type;
        this.originalCtx = null;
    }
}
