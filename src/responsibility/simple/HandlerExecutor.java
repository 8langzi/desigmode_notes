package src.responsibility.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandlerExecutor {

    private Map<String, List<Handler>> handlerMap = new HashMap<>();

    private List<Handler> handlers = new ArrayList<>();

    public boolean generateHandlerMap() throws Exception {
        if(handlers == null || handlers.size() == 0){
            throw new Exception("Set valid handlers");
        }
        this.handlerMap = handlers.stream().flatMap(handler -> {
            String[] types = handler.getType();
            Map<String, List<Handler>> k1 = Stream.of(types).flatMap(k -> {
                Map<String, Handler> handlerMap = new HashMap<>();
                handlerMap.put(k, handler);
                return handlerMap.entrySet().stream();
            }).collect(Collectors.toMap(k -> k.getKey(), k -> {
                List<Handler> handlers = new ArrayList<>();
                handlers.add(k.getValue());
                return handlers;
            }));
            return k1.entrySet().stream();
        }).collect(Collectors.toMap(k -> k.getKey(), k -> k.getValue(), (v1, v2) -> {
            v1.addAll(v2);
            return v1;
        }));
        return true;
    }

    public void executeHandle(String type,RequestBody requestBody){
        List<Handler> keyHandlers = handlerMap.get(type);
        keyHandlers.stream().forEach(item -> {
            item.handle(requestBody);
        });
    }

    public List<Handler> getHandlers() {
        return handlers;
    }

    public void setHandlers(List<Handler> handlers) {
        this.handlers = handlers;
    }

    public void addHandler(Handler handler){
        this.handlers.add(handler);
    }
}