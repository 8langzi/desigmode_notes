package src.responsibility;

public class ResponsibilityTest {

    public static void main(String[] args) {
        BaseHandler handlerA = new HandlerA();
        BaseHandler handlerB = new HandlerB();
        BaseHandler handlerC = new HandlerC();
        Request request = new Request();
        request.setData("ABCDEFG");
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
        handlerA.handle(request);
    }

}
