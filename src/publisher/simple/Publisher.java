package src.publisher.simple;

public interface Publisher {

    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notify(double amt);

}
