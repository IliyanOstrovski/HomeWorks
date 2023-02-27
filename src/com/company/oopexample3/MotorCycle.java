package com.company.oopexample3;

public class MotorCycle extends Vehicle {
    private int engineSize;

    public MotorCycle(String maker, String model, String dateOfProduction, double weight, int engineSize) {
        super(maker, model, dateOfProduction, weight);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}
