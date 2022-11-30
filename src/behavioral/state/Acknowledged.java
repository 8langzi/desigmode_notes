package src.behavioral.state;

public class Acknowledged implements PackageState{

    private static Acknowledged instance = new Acknowledged();

    private Acknowledged(){}

    public static PackageState instance(){
        return instance;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("=== state start ...");
        System.out.println("1 - Package is acknowledged!!");
        ctx.setCurrentState(WarehouseProcessing.instance());
    }
}
