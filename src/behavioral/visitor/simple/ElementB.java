package src.behavioral.visitor.simple;

public class ElementB implements Element{

    private int stateForB = 0;

    @Override
    public void accept(Visitor v) {
        System.out.println("=== 开始访问元素 B===");
        v.visitB(this);
    }

    public int getBState(){
        return stateForB;
    }

    public void setBState(int value){
        stateForB = value;
    }

}
