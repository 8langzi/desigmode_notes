package src.behavioral.visitor.mid;

public interface Router {
    void sendDate(char[] data);
    void accept(RouterVisitor v);
}
