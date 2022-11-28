package src.behavioral.expression;

public class NonterminalExpression implements AbstractExpression{

    AbstractExpression expr1;

    AbstractExpression expr2;

    public NonterminalExpression(AbstractExpression expr1,AbstractExpression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }


    @Override
    public boolean interpreter(Context context) {
        return expr1.interpreter(context) && expr2.interpreter(context);
    }
}
