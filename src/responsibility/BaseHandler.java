package src.responsibility;

import java.util.logging.Handler;

public interface BaseHandler {

    void setNext(BaseHandler handler);

    void handle(Request request);

}
