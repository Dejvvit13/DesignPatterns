package designpatterns.cerational.factory;

import java.util.ArrayList;
import java.util.Collection;

class Main {
    public void main() {
        Collection<F16> myAirForce = new ArrayList<>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        myAirForce.add(f16A);
        myAirForce.add(f16B);
        myAirForce.forEach(F16::fly);
    }
}
