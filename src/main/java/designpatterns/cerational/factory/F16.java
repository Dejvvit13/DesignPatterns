package designpatterns.cerational.factory;

class F16 {
    F16Engine engine;
    F16Cockpit cockpit;

    protected F16 makeF16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
        return this;
    }
    public void taxi() {
        System.out.println("F16 is taxing on the runway !");
    }

    public void fly() {
       F16 f16 = makeF16();
       f16.taxi();
        System.out.println("F16 with bad design flying");
    }
}