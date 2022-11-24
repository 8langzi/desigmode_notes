package src.structural.component;

public abstract class AbstractNode  {

    public abstract boolean isRoot();

    public abstract int getId();

    public abstract int getParentId();

    public abstract void setId(int id);

    public abstract void setParentId(int pid);

    public abstract void add(AbstractNode abstractNode);

    public abstract void remove(AbstractNode abstractNode);

    public abstract AbstractNode getChild(int i);

}
