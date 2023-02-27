package com.company.oopExample4;

abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public abstract void drive();
}