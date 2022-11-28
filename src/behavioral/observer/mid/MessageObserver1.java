package src.behavioral.observer.mid;

public class MessageObserver1 implements MessageObserver{
    @Override
    public void update(Message m) {
        System.out.println(" 1 ===== " + m.getContent());
    }
}
