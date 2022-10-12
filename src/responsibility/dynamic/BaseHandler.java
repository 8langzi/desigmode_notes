package src.responsibility.dynamic;

public interface BaseHandler {

    void setNext(BaseHandler handler);

    void handle(Request request);

}
