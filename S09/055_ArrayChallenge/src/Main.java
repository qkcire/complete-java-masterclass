import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printArray(getIntegers());
    }

    public static int[] getIntegers() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to add? ");
        int arrSize = input.nextInt();
        int[] array = new int[arrSize];
        int element;
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter #" + (i + 1) + ": ");
            element = input.nextInt();
            array[i] = element;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element: " + i + ", value: " + array[i]);
        }
    }
}
