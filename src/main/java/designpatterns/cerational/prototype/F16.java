package designpatterns.cerational.prototype;

class F16 implements IAircraftPrototype {

    F16Engine f16Engine = new F16Engine();

    @Override
    public void fly() {
        System.out.println("F-16 flying...");
    }

    @Override
    public IAircraftPrototype clone() {
        // Deep clone self and return the product
        return new F16();
    }

    @Override
    public void setEngine(final F16 f16) {
        f16.f16Engine = f16Engine;
    }
}
