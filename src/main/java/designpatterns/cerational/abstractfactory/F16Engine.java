package designpatterns.cerational.abstractfactory;

class F16Engine implements IEngine {
    @Override
    public void start() {
        System.out.println("F16 engine started");
    }
}
