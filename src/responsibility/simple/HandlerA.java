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

    public void handler(RequestBody requestBody) {

    }
}
