package com.company.oopExample4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", Transmission.AUTOMATIC, 5, "Black", true);
        car1.repair();
        System.out.println(car1);
    }
}
