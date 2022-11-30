package src.behavioral.state;

public class Received implements PackageState{

    private static PackageState instance = new Received();

    public Received(){}

    public static PackageState instance(){
        return instance;
    }

    @Override
    public void updateState(PackageContext ctx) {
        System.out.println("6 - Package is Received!!");
        System.out.println("=== state end!!");
    }
}
