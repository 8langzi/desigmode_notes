package src.behavioral.state;

public class WarehouseProcessing implements PackageState{

    private static WarehouseProcessing instance = new WarehouseProcessing();

    public WarehouseProcessing(){}

    public static PackageState instance(){
        return instance;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("2 - Package is WarehouseProcessing");
        ctx.setCurrentState(InTransition.instance());
    }
}
