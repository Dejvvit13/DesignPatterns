package designpatterns.cerational.abstractfactory;

public interface IAircraftFactory {
    IEngine createEngine();
    ICockpit createCockpit();
    IWings createWings();
}
