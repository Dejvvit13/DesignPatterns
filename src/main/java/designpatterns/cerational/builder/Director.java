package designpatterns.cerational.builder;

public class Director {

    AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder) {
        this.aircraftBuilder = aircraftBuilder;
    }


    public void construct(boolean isPassenger) {
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildWings();
        aircraftBuilder.buildCockpit();
        if (isPassenger) {
            aircraftBuilder.buildBathrooms();
        }
    }
}
