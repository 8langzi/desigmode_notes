package src.structural.decorator;

public class BaseDecorator  implements Component{

    private Component wrapper;

    BaseDecorator(Component component){
        this.wrapper = component;
    }

    @Override
    public void excute() {
        wrapper.excute();
    }
}
