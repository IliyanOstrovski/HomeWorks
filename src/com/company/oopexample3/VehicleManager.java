package com.company.oopexample3;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> vehicleList = new ArrayList<>();

    public void addToVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    public void removeToVehicle(Vehicle vehicle) {
        this.vehicleList.remove(vehicle);
    }

    public Vehicle getVehicleWithMaxWeight() {
        Vehicle maxWeightVehicle = null;

        double maxWeight = Double.NEGATIVE_INFINITY;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getWeight() > maxWeight) {
                maxWeight = vehicle.getWeight();
                maxWeightVehicle = vehicle;
            }
        }
        return maxWeightVehicle;
    }

    public ArrayList<Vehicle> getVehicleByMaker(String maker) {
        ArrayList<Vehicle> newVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getMaker().equals(maker)) {
                newVehicles.add(vehicle);
            }
        }
        return newVehicles;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
