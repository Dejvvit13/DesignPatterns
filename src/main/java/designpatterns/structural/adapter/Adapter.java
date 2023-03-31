package designpatterns.structural.adapter;

import designpatterns.cerational.builder.IAircraft;

public class Adapter implements IAircraft {

    HotAirBalloon hotAirBalloon;

    Adapter(final HotAirBalloon hotAirBalloon) {
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void fly() {
        String fuelUsed = hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(fuelUsed);
    }
}
