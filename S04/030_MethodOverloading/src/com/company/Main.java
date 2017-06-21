package com.company;

public class Main {

    public static void main(String[] args) {
//	    int newScore = calculateScore("Tim", 500);
//        System.out.println("new score is " + newScore);
//        calculateScore(75);
//        calculateScore();
//
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(1548));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid parameters.");
            return -1;
        }
        double convertFeetToInches = 12D * feet;
        return (convertFeetToInches + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameters.");
            return -1;
        }
        double convertInchesToFeet = inches / 12D;
        return calcFeetAndInchesToCentimeters((int)convertInchesToFeet, (convertInchesToFeet % 1) * 12);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
