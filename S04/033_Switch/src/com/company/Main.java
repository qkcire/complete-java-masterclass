package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
//	    int value = 2;
//	    if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;
	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
	    }

	    char switchChar = 'c';
	    switch (Character.toUpperCase(switchChar)) {
            case 'A':
                System.out.println("A has been found");
                break;
            case 'B':
                System.out.println("B has been found");
                break;
            case 'C':
                System.out.println("C has been found");
                break;
            case 'D':
                System.out.println("D has been found");
            default:
                System.out.println("Character " + switchChar + " was not found");
        }
    }
}
