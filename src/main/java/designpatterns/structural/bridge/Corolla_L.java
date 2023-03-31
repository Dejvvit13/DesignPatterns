package designpatterns.structural.bridge;

public class Corolla_L extends AbstractCorolla{

    Corolla_L(final AbstractCorollaImpl corollaImpl) {
        super(corollaImpl);
    }

    @Override
    void listSafetyEquipment() {
        corollaImpl.listSafetyEquipment();
    }

    @Override
    boolean isCarRightHanded() {
        return corollaImpl.isCarRightHanded();
    }

}
