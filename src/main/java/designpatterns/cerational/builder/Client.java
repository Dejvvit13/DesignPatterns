package designpatterns.cerational.builder;

public class Client {
    public void main() {
        F16Builder builder = new F16Builder();
        Director director = new Director(builder);
        director.construct(false);

        IAirCraft f16 = builder.getResult();
    }
}
