package src.expression;

public class TerminalExpression implements AbstractExpression{

    private String data;

    TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpreter(Context context) {
        if(context.getData().contains(data)){
            return true;
        }
        return false;
    }
}
