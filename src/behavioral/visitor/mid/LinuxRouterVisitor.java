package src.behavioral.visitor.mid;

public class LinuxRouterVisitor implements RouterVisitor{
    @Override
    public void visit(DLinkRouter router) {
        System.out.println("=== DLinkRouter Linux visit success!");
    }

    @Override
    public void visit(TPLinkRouter router) {
        System.out.println("=== TPLinkRouter Linux visit success!");
    }
}
