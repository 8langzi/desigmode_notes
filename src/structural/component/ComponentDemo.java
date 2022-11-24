package src.structural.component;

public class ComponentDemo {

    public static void main(String[] args) {

        AbstractNode rootNood = new Node();
        rootNood.setId(0);
        rootNood.setParentId(-1);
        AbstractNode node1 = new Node();
        node1.add(new Leaf());
        node1.add(new Leaf());
        rootNood.add(new Leaf());
        rootNood.add(new Leaf());
        rootNood.add(node1);

        System.out.println(node1.getId());

    }

}
