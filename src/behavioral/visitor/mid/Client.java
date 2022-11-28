package src.behavioral.visitor.mid;

public class Client {

    public static void main(String[] args) {
        LinuxRouterVisitor linuxRouterVisitor = new LinuxRouterVisitor();
        WindowsRouterVisitor windowsRouterVisitor = new WindowsRouterVisitor();
        DLinkRouter dLinkRouter = new DLinkRouter();
        dLinkRouter.accept(linuxRouterVisitor);
        dLinkRouter.accept(windowsRouterVisitor);
        TPLinkRouter tpLinkRouter = new TPLinkRouter();
        tpLinkRouter.accept(linuxRouterVisitor);
        tpLinkRouter.accept(windowsRouterVisitor);


    }

}
