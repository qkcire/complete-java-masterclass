package com.company;

/**
 * Created by eq on 6/22/17.
 */
public class Car extends Vehicle {
    private int gears;
    private int seats;
    private int maxHorsePower;
    private String transmission;
    private String handSteering;

    public Car(int speed, String body, String color, boolean Steering, int gears,
               int seats, int maxHorsePower, String transmission, String handSteering) {
        super(4, speed, body, color, Steering);
        this.gears = gears;
        this.seats = seats;
        this.maxHorsePower = maxHorsePower;
        this.transmission = transmission;
        this.handSteering = handSteering;
    }

    public int getGears() {
        return gears;
    }

    public int getSeats() {
        return seats;
    }

    public int getMaxHorsePower() {
        return maxHorsePower;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getHandSteering() {
        return handSteering;
    }
}
