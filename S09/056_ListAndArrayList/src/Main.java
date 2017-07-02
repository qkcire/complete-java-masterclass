import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.print("Enter your choice: " );
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print the choice of options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search cor an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem() {
        System.out.print("enter item number to modify: ");
        int itemNo = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("enter item number to modify: ");
        int itemNo = scan.nextInt();
        scan.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scan.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in your grocery list.");
        } else {
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }
}
