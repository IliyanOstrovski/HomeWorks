package com.company.oopexample3;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String maker, String model, String dateOfProduction, double weight, int numberOfDoors) {
        super(maker, model, dateOfProduction, weight);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                '}';
    }
}
