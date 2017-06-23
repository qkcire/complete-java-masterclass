/**
 * Created by eq on 6/23/17.
 */
public class Room {
    private String bedSize;
    private int numberOfWindows;
    private boolean hasTV;

    public Room(String bedSize, int numberOfWindows, boolean hasTV) {
        this.bedSize = bedSize;
        this.numberOfWindows = numberOfWindows;
        this.hasTV = hasTV;
    }

    public String getBedSize() {
        return bedSize;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void hasTV() {
        if (hasTV) {
            System.out.println("The room has a TV.");
        }else{
            System.out.println("The room does not have a TV.");
        }
    }
}
