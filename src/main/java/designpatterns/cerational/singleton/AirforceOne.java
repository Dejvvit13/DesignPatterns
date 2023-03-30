package designpatterns.cerational.singleton;

class AirforceOne {

    // The sole instance of the class
    private static AirforceOne onlyInstance;

    // Private constructor to prevent instantiation
    private AirforceOne() {
    }
    public void fly() {
        System.out.println("AirforceOne is flying");
    }

    // The only way to get the instance of the class
    public static AirforceOne getInstance() {
        if (onlyInstance == null) {
            onlyInstance = new AirforceOne();
        }
        return onlyInstance;
    }
}
