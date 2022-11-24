package src.structural.component;

import java.util.ArrayList;
import java.util.List;

public class Node extends AbstractNode{

    private List<AbstractNode>  children;

    private int id;

    private int pid;

    public Node(){
        children = new ArrayList<>();
    }


    @Override
    public boolean isRoot() {
        return pid == -1;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getParentId() {
        return pid;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setParentId(int parentId) {
        this.pid = parentId;
    }

    @Override
    public void add(AbstractNode abstractNode) {
        abstractNode.setParentId(this.children.size());
        abstractNode.setId(this.pid + 1);
        children.add(abstractNode);
    }

    @Override
    public void remove(AbstractNode abstractNode) {
        children.remove(abstractNode);
    }

    @Override
    public AbstractNode getChild(int i) {
        return children.get(i);
    }
}
