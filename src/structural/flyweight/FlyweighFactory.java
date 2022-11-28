package src.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweighFactory {

    public Map<String,Flyweight> pool = new HashMap<>();
    FlyweighFactory(){
        pool.put("A",new ConcreteFlyweight("A"));
        pool.put("B",new ConcreteFlyweight("B"));
        pool.put("C",new ConcreteFlyweight("C"));
    }

    public Flyweight getFlyweight(String key){
        if(pool.containsKey(key)){
            System.out.println("====享元池中存在，直接复用，key：" + key);
            return pool.get(key);
        }else {
            System.out.println("====享元池中没有，重新创建并复用，key：" + key);
            Flyweight flyweightNew = new ConcreteFlyweight(key);
            pool.put(key,flyweightNew);
            return flyweightNew;
        }
    }


}
