package src.publisher.mid;

public class MessageObserver2 implements MessageObserver{
    @Override
    public void update(Message m) {
        System.out.println(" 2 ===== " + m.getContent());
    }
}
