import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers()));
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
        System.out.print("numbers in descending order: ");
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int[] sortIntegers(int[] array) {
        int placeHolder;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    placeHolder = array[i];
                    array[i] = array[k];
                    array[k] = placeHolder;
                }
            }
        }
        return array;
    }
}
