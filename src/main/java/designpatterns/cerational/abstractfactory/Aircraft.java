package designpatterns.cerational.abstractfactory;

public class Aircraft {
    IEngine engine;
    IWings wings;
    ICockpit cockpit;
    IAircraftFactory factory;

    Aircraft(final IAircraftFactory factory) {
        this.factory = factory;
    }

    protected Aircraft makeAircraft() {
        engine = factory.createEngine();
        wings = factory.createWings();
        cockpit = factory.createCockpit();
        return this;
    }
    private void taxi() {
        System.out.println("Taxiing on runway");
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();
        aircraft.taxi();
        System.out.println("Flying");
    }
}
