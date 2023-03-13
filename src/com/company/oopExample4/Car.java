package com.company.oopExample4;

class Car extends Vehicle implements Repairable {
    private int numDoors;
    private String color;
    private boolean isElectric;
    private Transmission transmission;

    public Car(String brand, Transmission transmission, int numDoors, String color, boolean isElectric) {
        super(brand);
        this.numDoors = numDoors;
        this.color = color;
        this.isElectric = isElectric;
        this.transmission = transmission;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Transmission getTransmission() {
        return this.transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void drive() {
        System.out.println("Driving the car...");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the car...");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand is: ").append(getBrand()).append("\n");
        sb.append("Transmission: ").append(transmission).append("\n");
        sb.append("Number of doors are: ").append(numDoors).append("\n");
        sb.append("Color: ").append(color).append("\n");
        sb.append("is Electric: ").append(isElectric).append("\n");

        String[] lines = sb.toString().split("\n");
        for (String line : lines) {
            System.out.println(line);
            try {
                Thread.sleep(1000); // sleep for 1 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}


