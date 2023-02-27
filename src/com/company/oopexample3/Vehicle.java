package com.company.oopexample3;

public abstract class Vehicle {
    private String maker;
    private String model;
    private String dateOfProduction;
    private double weight;

    public Vehicle(String maker, String model, String dateOfProduction, double weight) {
        this.maker = maker;
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this.weight = weight;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle " + maker + ", "
                + model + ", "
                + dateOfProduction + ", "
                + weight;
    }
}
