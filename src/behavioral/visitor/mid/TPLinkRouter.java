package src.behavioral.visitor.mid;

public class TPLinkRouter implements Router{



    @Override
    public void sendDate(char[] data) {

    }

    @Override
    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}
