package src.behavioral.responsibility.simple;


public class HandlerA implements BaseHandler{

    private BaseHandler handler; // HandlerB

    @Override
    public void setNext(BaseHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerA 执行开始 ==== " + request.getData() );
        request.setData(request.getData().replace("A",""));
        System.out.println("HandlerA 执行结束 ==== " + request.getData());
        if(handler != null){
            handler.handle(request);
        }
    }
}
