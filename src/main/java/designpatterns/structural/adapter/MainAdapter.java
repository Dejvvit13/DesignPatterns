package designpatterns.structural.adapter;

public class MainAdapter {

    public void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adapter adapter = new Adapter(hotAirBalloon);
        adapter.fly();
    }

}
