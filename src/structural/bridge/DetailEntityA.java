package src.structural.bridge;

public class DetailEntityA extends AbstractEntity{


    DetailEntityA(AbstractBehavior abstractBehavior) {
        super(abstractBehavior);
    }

    @Override
    public void request() {
        super.myBehavior.operation1();
    }
}
