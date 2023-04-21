package behavioral.observer.pushStyle;

import java.util.ArrayList;
// Observable
import java.util.List;
public class Subject<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    public void notifyObservers(T value) {
        for (Observer<T> observer : observers) {
            observer.update(value);
        }
    }
}
