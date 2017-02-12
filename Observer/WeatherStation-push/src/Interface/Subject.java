package Interface;

/**
 * Created by minji on 17. 2. 12.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
