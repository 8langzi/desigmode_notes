package src.behavioral.responsibility.simple;

public interface BaseHandler {

    void setNext(BaseHandler handler);

    void handle(Request request);

}
