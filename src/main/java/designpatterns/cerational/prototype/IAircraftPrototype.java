package designpatterns.cerational.prototype;

interface IAircraftPrototype {

    void fly();
    IAircraftPrototype clone();
    void setEngine(F16 f16);

}
