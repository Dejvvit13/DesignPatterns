package designpatterns.cerational.factory;

class F16SimpleFactory {
    public F16 makeF16(String variant) {

        return switch (variant) {
            case "A" -> new F16A();
            case "B" -> new F16B();
            default -> new F16();
        };
    }
}
