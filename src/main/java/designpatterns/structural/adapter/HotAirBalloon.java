package designpatterns.structural.adapter;

public class HotAirBalloon {

    String gasUsed = "Helium";

    void fly(String gasUsed) {
    }

    String inflateWithGas() {
        return gasUsed;
    }
}
