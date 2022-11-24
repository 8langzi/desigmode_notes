package src.structural.bridge;

public class DetailBehaviorB extends AbstractBehavior{
    @Override
    public void operation1() {
        System.out.println("op-1 from detailBehaviorB");
    }

    @Override
    public void operation2() {
        System.out.println("op-2 from detailBehaviorB");
    }
}
