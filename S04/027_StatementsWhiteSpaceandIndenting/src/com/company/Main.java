package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        // statements, an entire line that ends in semi-colon
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                            " another" +
                            " still more.");
        System.out.println("This works as usual.");

        // valid, however, confusing
        int anotherVariable = 50; myVariable--; System.out.println("This is another another test.");

        if (myVariable == 40) {
            System.out.println("Printed");
        }
    }
}
