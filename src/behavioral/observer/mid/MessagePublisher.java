package src.behavioral.observer.mid;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{

    private List<MessageObserver> messageObservers = new ArrayList<>();

    @Override
    public void attach(MessageObserver m) {
        messageObservers.add(m);
    }

    @Override
    public void detach(MessageObserver m) {
        messageObservers.remove(m);
    }

    @Override
    public void notifyUpdate(Message m) {
        messageObservers.forEach(o -> o.update(m));
    }
}
