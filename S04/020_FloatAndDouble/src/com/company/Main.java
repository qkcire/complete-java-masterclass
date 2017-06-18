package com.company;

public class Main {

    public static void main(String[] args) {
        // width of int = length of 32 ( 4 bytes )
        int myIntValue = 5 / 3;
        // width of float = length of 32 ( 4 bytes )
        float myFloatValue = 3.24f;
        // width of double = length of 64 ( 8 bytes )
        double myDoubleValue = 200d;
        System.out.println("My int value    = " + myIntValue);
        System.out.println("My float value  = " + myFloatValue);
        System.out.println("My double value = " + myDoubleValue);

        //CHALLENGE TIME!------
        // 1. create a variable to store the number of pounds
        // 2. calculate the number of kilograms for the number above and store in a variable
        // 3. print out the result
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double kgToLbs = 0.45359237;
        System.out.println(" ");
        System.out.println("My int value in kg    = " + myIntValue * kgToLbs);
        System.out.println("My float value in kg  = " + myFloatValue * kgToLbs);
        System.out.println("My double value in kg = " + myDoubleValue * kgToLbs);

    }
}
