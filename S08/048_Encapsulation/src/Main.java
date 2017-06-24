public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "axe";

//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Axe");
        System.out.println("Initial health is " + player.getHealth());
    }
}
