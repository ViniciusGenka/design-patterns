package strategy;

import entities.CPU;
import entities.HardDrive;
import entities.LED;
import entities.Memory;

public class EnergySavingPowerManagement implements PowerManagementStrategy {

    public EnergySavingPowerManagement() {
    }

    public void turnOn(CPU cpu, HardDrive hardDrive, LED led, Memory memory) {
        cpu.turnOn();
        hardDrive.read();
        memory.load();
    }

    public void turnOff(CPU cpu, HardDrive hardDrive, LED led, Memory memory) {
        memory.release();
        cpu.turnOff();
    }
}
