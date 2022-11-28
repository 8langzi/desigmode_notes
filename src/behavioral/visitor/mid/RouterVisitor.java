package src.behavioral.visitor.mid;

public interface RouterVisitor {
    void visit(DLinkRouter router);
    void visit(TPLinkRouter router);
}
