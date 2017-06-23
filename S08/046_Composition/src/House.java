/**
 * Created by eq on 6/23/17.
 */
public class House {
    private Room bedroom;

    public House(Room bedroom) {
        this.bedroom = bedroom;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public void tVCheck() {
        System.out.println("House.tVCheck() called.");
        houseInspection();
    }

    private void houseInspection() {
        System.out.println("House.");
        bedroom.hasTV();
    }
}
