/**
 * Created by eq on 6/23/17.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardslots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardslots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardslots = cardslots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading. . .");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardslots() {
        return cardslots;
    }

    public String getBios() {
        return bios;
    }
}
