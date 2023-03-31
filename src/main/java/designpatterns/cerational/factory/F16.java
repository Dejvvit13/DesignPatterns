package designpatterns.cerational.factory;

import designpatterns.cerational.builder.IAircraft;

class F16 implements IAircraft {

    F16Engine engine;

    protected F16 makeF16(){
        F16 f16 = new F16();
        f16.engine = new F16Engine();
        return new F16();
    }

    @Override
    public void fly() {

    }
}
