package com.company;

/**
 * Created by eq on 6/22/17.
 */
public class Vehicle {
    private int wheels;
    private int maxSpeed;
    private int gears;

    public Vehicle(int wheels, int maxSpeed, int gears) {
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.gears = gears;
    }

    public int getWheels() {
        System.out.println("Vehicle.getWheels() called.");
        return wheels;
    }

    public int getMaxSpeed() {
        System.out.println("Vehicle.getMaxSpeed() called.");
        return maxSpeed;
    }

    public int getGears() {
        System.out.println("Vehicle.getGears() called.");
        return gears;
    }
}
