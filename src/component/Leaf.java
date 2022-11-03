package src.component;

public class Leaf extends AbstractNode{

    private int id;

    private int pid;

    @Override
    public boolean isRoot() {
        return false;
    }

    @Override
    public int getId() {
        return this.id;
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
    public void setParentId(int pid) {
        this.pid = pid;
    }

    @Override
    public void add(AbstractNode abstractNode) {
        throw new UnsupportedOperationException("this is a leaf node, no method to add");
    }

    @Override
    public void remove(AbstractNode abstractNode) {
        throw new UnsupportedOperationException("this is a leaf node, no method to delete");
    }

    @Override
    public AbstractNode getChild(int i) {
        return null;
    }
}
