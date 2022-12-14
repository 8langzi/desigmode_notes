package src.behavioral.responsibility.simple;

public class HandlerC implements BaseHandler{

    private BaseHandler handler;

    @Override
    public void setNext(BaseHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(Request request) {
        System.out.println("HandlerC 执行开始 ==== " + request.getData() );
        request.setData(request.getData().replace("C",""));
        System.out.println("HandlerC 执行结束 ==== " + request.getData());
        if(handler != null){
            handler.handle(request);
        }
    }
}
