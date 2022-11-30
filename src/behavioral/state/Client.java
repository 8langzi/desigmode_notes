package src.behavioral.state;

public class Client {

    public static void main(String[] args) {
        PackageContext ctx = new PackageContext(null,"Test123");
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }

}
