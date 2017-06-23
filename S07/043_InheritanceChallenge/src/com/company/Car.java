package com.company;

/**
 * Created by eq on 6/22/17.
 */
public class Car extends Vehicle {
    private String make;
    private String model;
    private String color;
    private int year;

    public Car(String make, String model, String color, int year, int maxSpeed, int gears) {
        super(4, maxSpeed, gears);
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getMake() {
        System.out.println("Car.getMake() called.");
        return make;
    }

    public String getModel() {
        System.out.println("Car.getModel() called.");
        return model;
    }

    public String getColor() {
        System.out.println("Car.getColor() called.");
        return color;
    }

    public int getYear() {
        System.out.println("Car.getYear() called.");
        return year;
    }

    @Override
    public int getWheels() {
        System.out.println("Car.getWheels() called.");
        return super.getWheels();
    }
}
