package facade;

import entities.CPU;
import entities.HardDrive;
import entities.LED;
import entities.Memory;
import strategy.PowerManagementStrategy;

public class ComputerFacade {
    private final CPU cpu;
    private final HardDrive hardDrive;
    private final LED led;
    private final Memory memory;
    private PowerManagementStrategy powerManagementStrategy;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.led = new LED();
        this.memory = new Memory();
    }

    public void turnOnComputer(PowerManagementStrategy powerManagementStrategy) {
        this.powerManagementStrategy = powerManagementStrategy;
        this.powerManagementStrategy.turnOn(this.cpu, this.hardDrive, this.led, this.memory);
    }

    public void turnOffComputer() {
        if(this.powerManagementStrategy == null) {
            System.out.println("Computer is already turned off");
            return;
        }
        this.powerManagementStrategy.turnOff(this.cpu, this.hardDrive, this.led, this.memory);
    }
}