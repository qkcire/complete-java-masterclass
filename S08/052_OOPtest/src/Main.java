public class Main {

    public static void main(String[] args) {
	    menu();
    }

    public static void menu() {
        String intro = "Hello and Welcome to Bill's Burgers.\n" +
                "How can we serve you today?\n\n";
        String menu = "+++++MENU+++++\n" +
                      "#1) Original Hamburger -- $4.95\n" +
                      "#2) Healthy Burger     -- $5.21\n" +
                      "#3) Deluxe Burger      -- $5.95\n";
        String choice = "Which would you like to choose? Enter #: ";
        System.out.println(intro + menu + choice);
    }
}
