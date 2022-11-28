package src.behavioral.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher{

    private String acct;

    private double balance;

    private List<Observer> myObservers;

    PublisherImpl(String acct,double balance){
        this.acct = acct;
        this.balance = balance;
        myObservers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        myObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        myObservers.remove(o);
    }

    @Override
    public void notify(double amt) {
        balance -= amt;
        if(balance < 0 ){
            overdrawn();
        }
    }

    private void overdrawn(){
        for (Observer o: myObservers){
            o.notify(acct,balance);
        }
    }

}
