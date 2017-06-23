package com.company;

/**
 * Created by eq on 6/23/17.
 */
public class Ferrari extends Car{
    private String trim;

    public Ferrari(int gears, String trim) {
        super("Ferrari", "GTC4Lusso", "white", 2017, 350, gears);
        this.trim = trim;
    }

    public String getTrim() {
        System.out.println("Ferrari.getTrim() called.");
        return trim;
    }
}
