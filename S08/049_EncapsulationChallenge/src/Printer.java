/**
 * Created by eq on 6/23/17.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillToner(int toner) {
        if (tonerLevel == 100) {
            System.out.println("Toner is full.");
        } else if (tonerLevel + toner >= 100) {
            tonerLevel = 100;
            System.out.println("Toner replenished to 100%.");
        } else {
            tonerLevel += toner;
            System.out.println("Toner replenished to " + getTonerLevel() + "%.");
        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
