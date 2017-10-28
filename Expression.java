import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

//deals with expression context (as defined in Swift.g4), which is a basic code building block
//breaks the expression up into binary operations (e.g. instance.method() + 1) and arranges them in the order of priority
//then delegates the calculations to BinaryExpression (e.g. instance.method() + 1) and Prefix (e.g. instance.method())
//perhaps it might be worth it to join BinaryExpression & Prefix into one module, s binary expressions are really just static functions
//(e.g. 1 + 2 is Int.add(1, 2), but that's some major refactoring, so let's leave it as is for now
public class Expression implements PrefixOrExpression {

    String code;
    Instance type;
    ParserRuleContext originalCtx;
    public String code(ParseTree ctx, Visitor visitor) {return code;}
    public Instance type() {return type;}
    public ParserRuleContext originalCtx() {return originalCtx;}

    public Expression(SwiftParser.ExpressionContext ctx, Instance type, Visitor visitor) {
        this(ctx, type, false, visitor);
    }

    public Expression(SwiftParser.ExpressionContext ctx, Instance knownType, boolean skipFirst, Visitor visitor) {
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
                if(BinaryExpression.priorityForOperator(operator, ctx, visitor) != priority) continue;
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
            Prefix prefix = new Prefix((SwiftParser.Prefix_expressionContext)ctxs.get(0), knownType, visitor);
            this.code = prefix.code(ctx, visitor);
            this.type = prefix.type();
        }
        else {
            BinaryExpression top = (BinaryExpression)ctxs.get(0);
            top.compute(knownType, ctx, visitor);
            this.code = top.code;
            this.type = top.type;
        }
    }

    public Expression(String code, Instance type) {
        this.code = code;
        this.type = type;
        this.originalCtx = null;
    }
}
