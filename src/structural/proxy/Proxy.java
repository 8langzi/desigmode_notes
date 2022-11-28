package src.structural.proxy;

public class Proxy extends RealObjectImpl{

    @Override
    public void doSomething() {
        System.out.println("=== 通过代理类来执行真实对象");
        super.doSomething();
    }

}
