package src.behavioral.responsibility.simple;

public class HandlerB implements BaseHandler {

    private BaseHandler handler; // HandlerC

    @Override
    public void setNext(BaseHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerB 执行开始 ==== " + request.getData() );
        request.setData(request.getData().replace("B",""));
        System.out.println("HandlerB 执行结束 ==== " + request.getData());
        if(handler != null){
            handler.handle(request);
        }
    }
}
