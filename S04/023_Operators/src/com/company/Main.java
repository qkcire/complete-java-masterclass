package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("Result = " + result);

        int previousResult = result;
        result += result - 1;
        System.out.println("New result = " + result + " and old result = " + previousResult);

        previousResult = result;
        result *= 20;
        System.out.println("previousResult times 20 = " + result);

        boolean isAlien = true;
        if (!isAlien)
            System.out.println("\nIt is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("\nYou got the highest score.");

        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than top score and less than 100");

        if (topScore > 90 || secondTopScore <= 90)
            System.out.println("One of these test is true.");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen.");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        //CHALLENGE TIME
        double dValue1 = 20;
        double dValue2 = 80;
        double dValue3 = (dValue1 + dValue2) * 25;
        double dSumRemainder = dValue3 % 40;
        if (dSumRemainder <= 20) {
            System.out.println("Total was over the limit.");
            System.out.println("dSumRemainder = " + dSumRemainder);
        }
    }
}
