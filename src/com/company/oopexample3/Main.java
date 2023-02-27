package com.company.oopexample3;

public class Main {
    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
        vehicleManager.addToVehicle(new Car("BMW", "X3",
                "01.01.2020", 2223.33, 4));
        vehicleManager.addToVehicle(new Car("Audi", "A4",
                "01.01.2010", 4223.33, 5));
        vehicleManager.addToVehicle(new Truck("Man", "TGX",
                "01.01.2015", 7623.33, 40));
        vehicleManager.addToVehicle(new MotorCycle("Kawasaki", "ZX10R",
                "01.01.2020", 223.33, 1000));
        System.out.println(vehicleManager.getVehicleByMaker("Kawasaki").toString());
        System.out.println(vehicleManager.getVehicleWithMaxWeight().getWeight());

    }
}
