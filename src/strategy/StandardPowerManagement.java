package strategy;

import entities.CPU;
import entities.HardDrive;
import entities.LED;
import entities.Memory;

public class StandardPowerManagement implements  PowerManagementStrategy{

    public StandardPowerManagement() {
    }

    public void turnOn(CPU cpu, HardDrive hardDrive, LED led, Memory memory) {
        cpu.turnOn();
        hardDrive.read();
        led.turnOn();
        memory.load();
    }

    public void turnOff(CPU cpu, HardDrive hardDrive, LED led, Memory memory) {
        memory.release();
        led.turnOff();
        cpu.turnOff();
    }
}
