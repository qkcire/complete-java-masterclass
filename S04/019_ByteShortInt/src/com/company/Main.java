package com.company;

public class Main {

    public static void main(String[] args) {

//        // int has a width of 32
//        int myMinValue = -2_147_483_648; //
//        int myMaxValue =  2_147_483_647;
//        int myTotal = (myMinValue/2);
//        System.out.println("MyTotal = " + myTotal);
//
//        // int has a width of 8
//        byte myByteValue = -128; // largest is 127
//        byte myNewByteValue = (byte)(myByteValue/2); // type-casting because it treats it as an int
//        System.out.println("myNewBytevalue = " + myNewByteValue);
//        // int has a width of 16
//        short myShortValue = -32_768; // largest = 32_767
//        short myNewShortValue = (short) (myShortValue/2);
//        // long has a width of 64
//        long myLongValue = -9_223_372_036_854_775_807L;
        byte tByte = 13;
        short tShort = 1312;
        int tInt = 3;
        long tLong = (50000 + 10 * (tByte + tShort + tInt));
        System.out.println("tLong = " + tLong);
    }
}
