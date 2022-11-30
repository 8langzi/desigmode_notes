package src.behavioral.state;

public class Delivering implements PackageState{

    private static Delivering instance = new Delivering();

    public Delivering(){}

    public static PackageState instance(){
        return instance;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("4 - Package is Delivering!!");
        ctx.setCurrentState(WaitForPickUp.instance());
    }
}
