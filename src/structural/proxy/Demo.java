package src.structural.proxy;

public class Demo {

    public static void main(String[] args) {
        RealObject realObjectProxy = new Proxy();
        realObjectProxy.doSomething();
    }

}
