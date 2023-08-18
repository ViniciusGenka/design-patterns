import facade.ComputerFacade;
import strategy.EnergySavingPowerManagement;
import strategy.PowerManagementStrategy;
import strategy.StandardPowerManagement;

public class Main {
    public static void main(String[] args) {
        PowerManagementStrategy standardPowerManagementStrategy = new StandardPowerManagement();
        PowerManagementStrategy energySavingPowerManagementStrategy = new EnergySavingPowerManagement();

        ComputerFacade computerFacade = new ComputerFacade();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Turning on the computer with the standard power management strategy");
        System.out.println("-------------------------------------------------------------------");
        computerFacade.turnOnComputer(standardPowerManagementStrategy);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Turning off the computer with the standard power management strategy");
        System.out.println("--------------------------------------------------------------------");
        computerFacade.turnOffComputer();

        System.out.println("\n");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Turning on the computer with the energy-saving power management strategy");
        System.out.println("------------------------------------------------------------------------");
        computerFacade.turnOnComputer(energySavingPowerManagementStrategy);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Turning off the computer with the energy-saving power management strategy");
        System.out.println("-------------------------------------------------------------------------");
        computerFacade.turnOffComputer();
    }
}