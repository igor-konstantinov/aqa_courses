package engines;

import interfaces.IEngine;

public class ElectricMotor implements IEngine {
    private double batteryCapacity;

    public ElectricMotor(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void Move() {
        System.out.println("The car is moving ");
    }

    public String toString(){
        return ("Electric motor");
    }
}
