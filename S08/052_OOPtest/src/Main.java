import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    menu();
    }

    public static void menu() {
        Hamburger oBurger = new Hamburger("regular", "ground beef", 4.95);
        HealthyBurger hBurger = new HealthyBurger();
        DeluxeBurger dBurger = new DeluxeBurger();

        String intro = "Hello and Welcome to Bill's Burgers.\n" +
                "How can we serve you today?\n\n";
        String menu = "+++++MENU+++++\n" +
                      "#1 Original Hamburger -- $4.95\n" +
                      "#2 Healthy Burger     -- $5.21\n" +
                      "#3 Deluxe Burger      -- $5.95\n";
        String choice = "Which would you like to choose?\nEnter # for more info: ";
        System.out.print(intro + menu + choice);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n < 1 || n > 3) {
            System.out.print("\n #" + n + " is an invalid choice. Please choose again.\n\n" + menu + choice);
            n = input.nextInt();
        }
        choice(n);

    }

    public static void choice(int n) {
        String output;
        switch (n) {
            case 1:
                output = "You have chosen an Original Hamburger.\nIngredients include: " +
                         "\nRegular bread, Ground beef patty, Tomato, Lettuce, Condiments, & Cheese";
                break;
            case 2:
                output = "You have chosen a Healthy Burger.\nIngredients include: " +
                         "\nBrown Rye Bread, Veggie patty, Tomato, and Lettuce";
                break;
            case 3:
                output = "You have chosen a Deluxe Burger.\nIngredients include: " +
                         "\nRegular Bread, Ground Beef Patty, Tomato, Lettuce, Condiments, & Cheese" +
                         "\nAlso include: Chips and a drink.";
                break;
            default:
                output = "No choice was made.";
                break;
        }
        System.out.println(output);

    }

}
