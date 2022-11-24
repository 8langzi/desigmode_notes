package src.structural.bridge;

public class DetailBehaviorA extends AbstractBehavior{
    @Override
    public void operation1() {
        System.out.println("op-1 from detailBehaviorA");
    }

    @Override
    public void operation2() {
        System.out.println("op-2 from detailBehaviorB");
    }
}
