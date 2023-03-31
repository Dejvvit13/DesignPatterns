package designpatterns.cerational.builder;

class Boeing747Builder extends AircraftBuilder {

    Boeing747 boeing747;

    @Override
    public IAircraft getResult() {
        return null;
    }
    @Override
    public void buildEngine() {

    }

    @Override
    public void buildWings() {
    }

    @Override
    public void buildCockpit() {
    }

    @Override
    public void buildBathrooms() {
    }
}
