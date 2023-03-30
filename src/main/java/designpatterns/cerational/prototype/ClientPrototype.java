package designpatterns.cerational.prototype;

class ClientPrototype {
    public void main() {
        IAircraftPrototype prototype = new F16();
        IAircraftPrototype f16Clone = prototype.clone();
        f16Clone.fly();
    }
}
