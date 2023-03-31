package designpatterns.structural.facade;

public class AutopilotFacade {
    private BoeingAltitudeMonitor altitudeMonitor;
    private BoeingEngineController engineController;
    private BoeingFuelMonitor feulMonitor;
    private BoeingNavigationSystem navigationSystem;

    public AutopilotFacade(BoeingAltitudeMonitor altitudeMonitor, BoeingEngineController engineController,
                           BoeingFuelMonitor feulMonitor, BoeingNavigationSystem navigationSystem) {
        this.altitudeMonitor = altitudeMonitor;
        this.engineController = engineController;
        this.feulMonitor = feulMonitor;
        this.navigationSystem = navigationSystem;
    }
    // The facade is encapsulating the logic required to activate and deactivate the autopilot
    // in the autopilotOn and autopilotOff methods.
    // It is also being passed in all the subsystems required in its constructor.
    public void autopilotOn() {
        altitudeMonitor.autoMonitor();
        engineController.setEngineSpeed(700);
        navigationSystem.setDirectionBasedOnSpeedAndFeul(
                engineController.getEngineSpeed(),
                feulMonitor.getRemainingFeulInGallons());
    }

    public void autopilotOff() {
        altitudeMonitor.turnOff();
        engineController.turnOff();
        navigationSystem.turnOff();
        feulMonitor.turnOff();
    }

}
