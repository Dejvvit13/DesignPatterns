package designpatterns.structural.proxy;

import java.util.Scanner;

public class MainProxy {

    public void client(DroneProxy droneProxy) {
        // perpetual loop that received pilot actions
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();

            switch (action) {
                case "left" -> droneProxy.turnLeft();
                case "right" -> droneProxy.turnRight();
                case "fire" -> droneProxy.firstMissile();
                default -> {
                    System.out.println("Invalid Action");
                    break;
                }
            }
        }
    }


}
