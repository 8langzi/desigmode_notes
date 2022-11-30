package src.behavioral.state;

public class WaitForPickUp implements PackageState{

    private static WaitForPickUp instance = new WaitForPickUp();

    private WaitForPickUp(){}

    public static WaitForPickUp instance(){
        return instance;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("5 - Package is wait for pick up!!");
        ctx.setCurrentState(Received.instance());

    }
}
