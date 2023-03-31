package designpatterns.structural.composite;

import designpatterns.cerational.builder.IAircraft;

public class F16 implements IAircraft,IAlliancePart {
    @Override
    public void fly() {

    }
    @Override
    public int getPersonnel() {
        return 2;
    }
}
