import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);
//	    int[] myIntArray = new int[10];
//	    int[] myIntArr = {1,3,3,5,1};
        System.out.println("the average is " + getAverage(myIntArray));


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("element [" + i + "]: " + arr[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
