package com.company.oopexample3;

public class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(String maker, String model, String dateOfProduction, double weight, int cargoCapacity) {
        super(maker, model, dateOfProduction, weight);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
