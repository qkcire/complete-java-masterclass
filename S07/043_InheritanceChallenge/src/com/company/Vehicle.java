package com.company;

/**
 * Created by eq on 6/22/17.
 */
public class Vehicle {
    private int wheels;
    private int maxSpeed;
    private String body;
    private String color;
    private boolean Steering;

    public Vehicle(int wheels, int maxSpeed, String body, String color, boolean Steering) {
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.body = body;
        this.color = color;
        this.Steering = Steering;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBody() {
        return body;
    }

    public String getColor() {
        return color;
    }

    public boolean isSteering() {
        return Steering;
    }
}
