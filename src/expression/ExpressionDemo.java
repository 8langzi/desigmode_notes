package src.expression;

public class ExpressionDemo {

    public static void main(String[] args) {

        AbstractExpression person1 = new TerminalExpression("mick");
        AbstractExpression person2 = new TerminalExpression("mia");
        AbstractExpression isSimgle = new NonterminalExpression(person1,person2);

        Context context1 = new Context("mick,mia");
        Context context2 = new Context("mia,mock");
        Context context3 = new Context("spike");
        System.out.println(isSimgle.interpreter(context1));
        System.out.println(isSimgle.interpreter(context2));
        System.out.println(isSimgle.interpreter(context3));

    }

}
