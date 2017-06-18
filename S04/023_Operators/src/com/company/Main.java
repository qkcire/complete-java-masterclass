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

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than top score and less than 100");
    }
}
