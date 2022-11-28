package src.behavioral.visitor.simple;

public class VisitorBehavior implements Visitor{
    @Override
    public void visitA(ElementA elementA) {
        int x = elementA.getAState();
        x++;
        System.out.println("=== 当前A的State为： ===");
        elementA.setAState(x);
    }

    @Override
    public void visitB(ElementB elementB) {
        int x = elementB.getBState();
        x++;
        System.out.println("=== 当前B的State为： ===");
        elementB.setBState(x);
    }
}
