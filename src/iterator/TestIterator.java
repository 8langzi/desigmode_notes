package src.iterator;

public class TestIterator {

    public static void main(String[] args) {
        Object[] objects = new Object[2];
        objects[0] = new Object();
        objects[1] = new Object();
        MyAggregate myAggregate = new MyAggregate(objects);
        Iterator aggregate = myAggregate.createAggregate();
        while (aggregate.hasNext()){
            System.out.println(aggregate.next());
        }
    }

}
