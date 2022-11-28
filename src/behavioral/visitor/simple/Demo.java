package src.behavioral.visitor.simple;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Element> elementList = new ArrayList<>();
        ElementA elementA = new ElementA();
        elementA.setAState(11);
        ElementB elementB = new ElementB();
        elementB.setBState(12);
        elementList.add(elementA);
        elementList.add(elementB);

        for (Element element:elementList){
            element.accept(new VisitorBehavior());
        }

    }

}
