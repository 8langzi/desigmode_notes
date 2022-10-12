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

    public void handler(RequestBody requestBody) {

    }

}
