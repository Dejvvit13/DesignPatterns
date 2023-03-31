package designpatterns.structural.decorator;

public class BulletProof extends BoeingDecorator {

    IAircraft boeing;

    BulletProof(final IAircraft boeing) {
        this.boeing = boeing;
    }


    @Override
    public void fly() {
        boeing.fly();
    }

    @Override
    public void land() {
        boeing.land();
    }

    @Override
    public float getWeight() {
        return 50f + boeing.getWeight();
    }
}