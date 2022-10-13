package src.responsibility.simple;

import java.util.Arrays;
import java.util.List;

public class HandlerB extends Handler{
    private String[] type = new String[]{"2","3","4"};
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
