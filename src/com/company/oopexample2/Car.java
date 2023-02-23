package com.company.oopexample2;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int power;
    private String typeOfEngine;
    private String typeOfGearbox;
    private String yearOfCreate;

    public Car() {

    }

    public Car(String brand, String model, String color, int power, String typeOfEngine, String typeOfGearbox, String yearOfCreate) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.typeOfEngine = typeOfEngine;
        this.typeOfGearbox = typeOfGearbox;
        this.yearOfCreate = yearOfCreate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfGearbox() {
        return typeOfGearbox;
    }

    public void setTypeOfGearbox(String typeOfGearbox) {
        this.typeOfGearbox = typeOfGearbox;
    }

    public String getYearOfCreate() {
        return yearOfCreate;
    }

    public void setYearOfCreate(String yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }
}
