package designpatterns.structural.bridge;

public class MainBridge {

    public void main(){
        AbstractCorolla myCorolla = new Corolla_L(new Corolla_L_Impl_AsiaPavific());
        System.out.println(myCorolla.isCarRightHanded());

        myCorolla.setCorollaImpl(new Corolla_L_Impl_NotrhAmerica());
        System.out.println(myCorolla.isCarRightHanded());
    }

}
