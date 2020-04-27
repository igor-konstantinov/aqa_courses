package Car_plant;

import engines.ElectricMotor;
import interfaces.IEngine;

public class Car {
    private String model;
    private String color;
    private IEngine engineType;
    private int productionYear;
    private int age;
    private ElectricMotor electricMotor;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IEngine getEngineType() {
        return engineType;
    }

    public void setEngineType(IEngine engineType) {
        this.engineType = engineType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Car() {
    }

    public Car(String model, String color, IEngine EngineType, int productionYear) {
        this.model = model;
        this.color = color;
        this.engineType = EngineType;
        this.productionYear = productionYear;
        this.age = 2020 - productionYear;
    }

    public void Move() {
        electricMotor.Move();
    }

    public String toString() {
        return ("Car model: " + model + "| " + "Car color: " + color + "| " + "Car engine capacity: " + engineCapacity + "| " + "Car production year: " + productionYear + "| " + "Car age: " + age + "\n");
    }
}