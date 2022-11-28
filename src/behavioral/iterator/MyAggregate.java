package src.behavioral.iterator;


public class MyAggregate implements Aggregate{

    Object[] objects;

    MyAggregate(Object[] objects){
        this.objects = objects;
    }


    @Override
    public Iterator createAggregate() {
        return new MyIterator(objects);
    }
}
