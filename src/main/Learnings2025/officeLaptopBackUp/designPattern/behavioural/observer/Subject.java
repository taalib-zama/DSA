package designPattern.behavioural.observer;

import designPattern.behavioural.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
