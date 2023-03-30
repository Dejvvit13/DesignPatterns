package designpatterns.cerational.singleton;

class AirforceOneWithDoubleCheckedLocking {

    // The sole instance of the class. Note its marked volatile
    private volatile static AirforceOneWithDoubleCheckedLocking onlyInstance;

    // Private constructor to prevent instantiation
    private AirforceOneWithDoubleCheckedLocking() {
    }

    public void fly() {
        System.out.println("AirforceOne is flying");
    }

    synchronized public static AirforceOneWithDoubleCheckedLocking getInstance() {
        // Double checked locking
        if (onlyInstance == null) {
            // Synchronize only the first time
            synchronized (AirforceOneWithDoubleCheckedLocking.class) {
                if (onlyInstance == null) {
                    onlyInstance = new AirforceOneWithDoubleCheckedLocking();
                }
            }
        }
        return onlyInstance;
    }


}
