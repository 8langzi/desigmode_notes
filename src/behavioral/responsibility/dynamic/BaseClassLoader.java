package src.behavioral.responsibility.dynamic;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.ServiceLoader;

public class BaseClassLoader {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        ServiceLoader<Handler> load = ServiceLoader.load(Handler.class);

        Iterator<Handler> iterator = load.iterator();

        Handler next = iterator.next();

        System.out.println();

    }



}
