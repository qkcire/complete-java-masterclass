package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("My string is equal to: " + myString);
        myString += ", and this is more.";
        System.out.println("my string is equal to: " + myString);
        myString += " \u00A9 2017";
        System.out.println("my string is equal to: " + myString);

        String numberString = "250.55";
        numberString += " 49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString += " " + doubleNumber;
        System.out.println("LastString value: " + lastString);
    }

}
