package src.behavioral.observer.mid;

public interface Subject {

    void attach(MessageObserver m); // 增加观察者

    void detach(MessageObserver m); // 删除观察者

    void notifyUpdate(Message m);   // 更新通知

}
