package src.structural.adapter;

public class Adapter extends TargetAbstraction{

    private OhterClass ohterClass;

    Adapter(){
        ohterClass = new OhterClass();
    }

    @Override
    public String filter(String str) {
        ohterClass.preCheck(str);
        return ohterClass.replace(str);
    }

}
