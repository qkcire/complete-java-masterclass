public class Main {
    // intro to composition vs inheritance
    // when building a program, always look at building a composed structure first
    // rather than a inherited structure.
    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20, 5);
//	      Case theCase = new Case("220B", "Dell", "240", dimensions);
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();

        Room masterBedroom = new Room("California King", 3, true);
        House grandmasHouse = new House(masterBedroom);
        grandmasHouse.tVCheck();

    }
}
