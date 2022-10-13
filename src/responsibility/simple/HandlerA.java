package src.responsibility.simple;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandlerA extends Handler {

    private String[] type = new String[]{"1","2","3"};
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
        requestBody.setData(requestBody.getData().replace("A",""));
        System.out.println("HandlerA 执行结束 ==== " + requestBody.getData());
    }
}
