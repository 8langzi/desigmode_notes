package src.responsibility.dynamic;


public class HandlerB extends Handler{
    private String[] type = new String[]{"2","3","4","b","c","e"};
    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    @Override
    public void handle(RequestBody requestBody) {
        if(requestBody == null){
            return;
        }
        System.out.println("HandlerA 执行开始 ==== " + requestBody.getData() );
        requestBody.setData(requestBody.getData().replace("B",""));
        System.out.println("HandlerA 执行结束 ==== " + requestBody.getData());
    }

}
