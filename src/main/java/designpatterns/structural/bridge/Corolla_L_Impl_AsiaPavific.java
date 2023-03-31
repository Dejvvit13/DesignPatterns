package designpatterns.structural.bridge;

public class Corolla_L_Impl_AsiaPavific extends AbstractCorollaImpl{
    @Override
    void listSafetyEquipment() {
        System.out.println("Not so safe.");
    }

    @Override
    boolean isCarRightHanded() {
        return false;
    }
}
