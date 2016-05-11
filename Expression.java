import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class Expression implements PrefixOrExpression {

    String code;
    AbstractType type;
    public String code() {return code;}
    public AbstractType type() {return type;}

    public Expression(SwiftParser.ExpressionContext ctx, Visitor visitor) {

        List<SwiftParser.Binary_expressionContext> binaries = ctx.binary_expressions() != null ? ctx.binary_expressions().binary_expression() : new ArrayList<SwiftParser.Binary_expressionContext>();
        ArrayList<PrefixOrExpression> elems = new ArrayList<PrefixOrExpression>();
        ArrayList<ParserRuleContext> operators = new ArrayList<ParserRuleContext>();
        for(int i = -1; i < binaries.size(); i++) {
            if(i >= 0) {
                SwiftParser.Binary_expressionContext binary = binaries.get(i);
                elems.add(new Prefix(binary.prefix_expression(), visitor));
                operators.add(binary.binary_operator() != null ? binary.binary_operator() : binary.conditional_operator());
            }
            else {
                elems.add(new Prefix(ctx.prefix_expression(), visitor));
            }
        }

        for(int priority = 4; priority <= 9; priority++) {
            for(int i = 0; i < operators.size(); i++) {
                ParserRuleContext operator = operators.get(i);
                if(BinaryExpression.priorityForOperator(operator) != priority) continue;
                PrefixOrExpression L = elems.get(i);
                PrefixOrExpression R = elems.get(i + 1);
                PrefixOrExpression LR = BinaryExpression.compute(operator, L, R, visitor);
                elems.remove(i);
                elems.remove(i);
                elems.add(i, LR);
                operators.remove(i);
                i--;
            }
        }

        this.code = elems.get(0).code();
        this.type = elems.get(0).type();
    }

    public Expression(String code, AbstractType type) {
        this.code = code;
        this.type = type;
    }
}
