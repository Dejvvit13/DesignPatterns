package designpatterns.cerational.builder;

class F16Builder extends AircraftBuilder {

    F16 f16;

    @Override
    public void buildEngine() {

    }

    @Override
    public void buildWings() {

    }

    @Override
    public void buildCockpit() {
        f16 = new F16();
    }

    @Override
    public void buildBathrooms() {

    }
    @Override
    public IAircraft getResult() {
        return null;
    }
}
