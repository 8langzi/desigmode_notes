package src.structural.bridge;

public class DetailEntityB extends AbstractEntity{

    DetailEntityB(AbstractBehavior abstractBehavior) {
        super(abstractBehavior);
    }

    @Override
    public void request() {
        super.myBehavior.operation2();
    }
}
