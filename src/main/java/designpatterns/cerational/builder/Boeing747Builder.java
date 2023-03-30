package designpatterns.cerational.builder;

class Boeing747Builder extends AircraftBuilder {

    Boeing747 boeing747;

    @Override
    public IAirCraft getResult() {
        return boeing747();
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
