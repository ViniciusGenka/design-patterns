package strategy;

import entities.CPU;
import entities.HardDrive;
import entities.LED;
import entities.Memory;

public interface PowerManagementStrategy {
    void turnOn(CPU cpu, HardDrive hardDrive, LED led, Memory memory);
    void turnOff(CPU cpu, HardDrive hardDrive, LED led, Memory memory);
}
