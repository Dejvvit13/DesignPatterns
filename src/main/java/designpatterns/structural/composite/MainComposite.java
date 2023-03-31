package designpatterns.structural.composite;

public class MainComposite {

    public static void client(){
        Airforce natoAlliance = new Airforce();

        F16 frenchF16 = new F16();
        C130Hercules germanCargo = new C130Hercules();

        natoAlliance.add(frenchF16);
        natoAlliance.add(germanCargo);

        System.out.println(natoAlliance.getPersonnel());
    }

    public static void main(String[] args) {
        client();
    }

}
