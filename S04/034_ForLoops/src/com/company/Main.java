package com.company;

public class Main {

    public static void main(String[] args) {
//        // increment
//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i )));
//        }
//        System.out.println("**************");
//        // decrement
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i )));
//        }

        // CHALLENGES
        double nBegin = System.nanoTime();
        int n = (int)(100.0 * Math.random()) + 1;
        int primeCount = 0;
        for (int i = n; i < (int)Math.pow(n, 2); i++) {
            if (primeCount == 10){
                System.out.println("Exiting loop.");
                break;
            }
            if (isPrime(i + 1)) {
                System.out.println((i + 1) + " is prime.");
                primeCount++;
            }

        }
        System.out.println("nano Time: " + (System.nanoTime() - nBegin));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
