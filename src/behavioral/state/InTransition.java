package src.behavioral.state;

public class InTransition implements PackageState{

    private static PackageState instance = new InTransition();

    public InTransition(){}

    public static PackageState instance(){
        return instance;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("3 - Package is in transition!");
        ctx.setCurrentState(Delivering.instance());
    }
}
