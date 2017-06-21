package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("*******************");
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("*******************");
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while(count != 6);

        // CHALLENGE #1
//        int number = 5;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            if (isEvenNumber(number)) {
//                System.out.println(number + " is an even number.");
//            }
//            number++;
//        }

        // CHALLENGE #2
        int evenAmount = 0;
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (isEvenNumber(number)) {
                System.out.println(number + " is an even number.");
                evenAmount++;
                if (evenAmount == 5) {
                    break;
                }
            }
            number++;
        }
        System.out.println("Total amount of even numbers found: " + evenAmount);

    }

    public static boolean isEvenNumber(int number) {
//        if (number % 2 != 0){
//            return false;
//        }
//        return true;
        return (number % 2 == 0);
    }
}
