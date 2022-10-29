package src.publisher.simple;

public class PublisherDemo {

    public static void main(String[] args) {

        Publisher account = new PublisherImpl("TEST1023",10);
        Observer bill = new ObserverImpl();
        account.addObserver(bill);
        account.notify(11.00);

    }

}
