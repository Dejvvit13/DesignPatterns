package designpatterns.structural.bridge;

public abstract class AbstractCorolla {

    protected AbstractCorollaImpl corollaImpl;

    AbstractCorolla(final AbstractCorollaImpl impl) {
        this.corollaImpl = impl;
    }

    abstract void listSafetyEquipment();
    abstract boolean isCarRightHanded();

    void setCorollaImpl(final AbstractCorollaImpl corollaImpl) {
        this.corollaImpl = corollaImpl;
    }
}
