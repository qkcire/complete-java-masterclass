package com.company;

/**
 * Created by eq on 6/21/17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("name", 0, "email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "email");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
