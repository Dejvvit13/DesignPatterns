package designpatterns.cerational.singleton;

class ClientAirFroceOne {
    public void main() {
        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();
    }
}
