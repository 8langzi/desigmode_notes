package src.structural.bridge;

public abstract class AbstractEntity {

    protected AbstractBehavior myBehavior;

    AbstractEntity(AbstractBehavior abstractBehavior){
        myBehavior = abstractBehavior;
    }

    public abstract void request();


}
