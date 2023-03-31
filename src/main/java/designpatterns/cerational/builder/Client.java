package designpatterns.cerational.builder;

class Client {
    public void main() {
        F16Builder builder = new F16Builder();
        Director director = new Director(builder);
        director.construct(false);

        IAircraft f16 = builder.getResult();
    }
}
