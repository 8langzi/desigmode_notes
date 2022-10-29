package src.publisher.mid;

public class Demo {

    public static void main(String[] args) {

        MessageObserver m1 = new MessageObserver1();
        MessageObserver m2 = new MessageObserver2();
        Subject subject = new MessagePublisher();
        subject.attach(m1);
        subject.attach(m2);
        subject.notifyUpdate(new Message("First Message"));
        subject.detach(m1);
        subject.notifyUpdate(new Message("Second Message"));
    }

}
