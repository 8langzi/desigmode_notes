package src.behavioral.visitor.mid;

public class WindowsRouterVisitor implements RouterVisitor{
    @Override
    public void visit(DLinkRouter router) {
        System.out.println("=== DLinkRouter Windows visit success!");
    }
    @Override
    public void visit(TPLinkRouter router) {
        System.out.println("=== DLinkRouter Windows visit success!");
    }
}
