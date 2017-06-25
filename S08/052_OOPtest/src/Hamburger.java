/**
 * Created by eq on 6/25/17.
 */
public class Hamburger {
    //requirements
    private String breadRoll;
    private String meat;
    private double price;
    //addons
    private int tomato;
    private int lettuce;
    private int condiments;
    private int cheese;
    private int totalAddonCount = 0;

    public Hamburger(String breadRoll, String meat, double price) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public int getTomato() {
        return tomato;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getCondiments() {
        return condiments;
    }

    public int getCheese() {
        return cheese;
    }

    //if cust wants addons:
    //  create methods to add addons onto burger
    //  boolean switches & incrementing overall price of burgers.
    public boolean addTomato() {
        if (allowAddOns()){
            tomato += 1;
            price = 0.45;
            totalAddonCount += 1;
            return true;
        } else {
            return noMoreAddOns();
        }
    }

    public boolean addLettuce() {
        if (allowAddOns()) {
            lettuce += 1;
            price = 0.30;
            totalAddonCount += 1;
            return true;
        } else {
            return noMoreAddOns();
        }
    }

    public boolean addCondiments() {
        if (allowAddOns()) {
            condiments += 1;
            price = 0.13;
            totalAddonCount += 1;
            return true;
        } else {
            return noMoreAddOns();
        }
    }

    public boolean addCheese() {
        if (allowAddOns()) {
            cheese += 1;
            price = 0.20;
            totalAddonCount += 1;
            return true;
        } else {
            return noMoreAddOns();
        }
    }

    private boolean allowAddOns() {
        if (totalAddonCount < 4){
            return true;
        }
        return false;
    }

    private boolean noMoreAddOns() {
        return false;
    }
}
