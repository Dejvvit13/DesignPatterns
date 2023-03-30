package designpatterns.cerational.abstractfactory;

public class Boeing747Factory implements IAircraftFactory{
    @Override
    public IEngine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public ICockpit createCockpit() {
        return new Boeing747Cockpit();
    }

    @Override
    public IWings createWings() {
        return new Boeing747Wings();
    }
}
