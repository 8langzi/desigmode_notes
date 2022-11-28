package src.behavioral.iterator;

public class MyIterator implements Iterator{

    private Object[] objects;

    private int position;

    MyIterator(Object[] objects){
        this.objects = objects;
    }

    @Override
    public Object next() {
        return objects[position++];
    }

    @Override
    public boolean hasNext() {
        if(position >= objects.length){
            return false;
        }
        return true;
    }
}
