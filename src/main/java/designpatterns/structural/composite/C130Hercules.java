package designpatterns.structural.composite;

import designpatterns.cerational.builder.IAircraft;

public class C130Hercules implements IAircraft,IAlliancePart {
    @Override
    public void fly() {

    }

    @Override
    public int getPersonnel() {
        return 5;
    }
}
