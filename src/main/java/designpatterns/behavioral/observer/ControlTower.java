package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Collection;

public class ControlTower implements ISubject {
    Collection<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(final IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(final IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(null));
    }
    /**
     * This is hypothetical function that runs perptually, gathering
     * runway and weather conditions and notifying all observers of
     * them periodically.
     */
    public void run() throws InterruptedException {
        while (true) {
            // get new runway/weather conditions and update observers
            // every five minutes
            Thread.sleep(1000 * 60 * 5);
            notifyObservers();
        }
    }
}
