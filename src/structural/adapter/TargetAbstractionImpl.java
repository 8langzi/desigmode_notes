package src.structural.adapter;

public class TargetAbstractionImpl extends TargetAbstraction{


    @Override
    public String filter(String str) {
        return str.replace("a","A");
    }
}
