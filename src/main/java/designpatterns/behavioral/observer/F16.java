package designpatterns.behavioral.observer;

import designpatterns.cerational.builder.IAircraft;

class F16 implements IObserver, IAircraft {
    ISubject observable;

    F16(final ISubject observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(final Object newState) {
        // Take appropriate action based on newState
    }

    public void land() {
        observable.removeObserver(this);
    }

    @Override
    public void fly() {
        System.out.println("F16 is flying ...");
    }
}
