package com.company;

public class Main {

    public static void main(String[] args) {
//        Vehicle bike = new Vehicle(2, 30, 8);
//        System.out.println("bike wheels: " + bike.getWheels() + '\n');
//        System.out.println("bike max speed: " + bike.getMaxSpeed() + '\n');
//        System.out.println("bike gears: " + bike.getGears());
//
        Car toyotaCamry = new Car("Toyota", "Camry", "red", 2017, 140, 5);
        System.out.println("Camry wheels: " + toyotaCamry.getWheels() + '\n');
        System.out.println("Camry model: " + toyotaCamry.getModel() + '\n');
        System.out.println("Camry make: " + toyotaCamry.getMake() + '\n');
        System.out.println("Camry color: " + toyotaCamry.getColor() + '\n');
        System.out.println("Camry year: " + toyotaCamry.getYear() + '\n');
        System.out.println("Camry max speed: " + toyotaCamry.getMaxSpeed() + '\n');
        System.out.println("Camry gears: " + toyotaCamry.getGears());
    }
}
