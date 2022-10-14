package src.responsibility.dynamic;

public class ResponsibilityTest {

    public static void main(String[] args) throws Exception {
        HandlerExecutor handlerExecutor = new HandlerExecutor();
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        handlerExecutor.addHandler(handlerA);
        handlerExecutor.addHandler(handlerB);
        RequestBody requestBody = new RequestBody();
        requestBody.setData("ABCDEFGH");
        handlerExecutor.generateHandlerMap();
        handlerExecutor.executeHandle("1",requestBody);
        handlerExecutor.executeHandle("4",requestBody);
        System.out.println("1");
    }


}
