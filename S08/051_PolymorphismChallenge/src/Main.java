class Car {
    private boolean engine;
    private int numberOfCylinders;
    private int numberOfWheels;
    private String name;

    public Car(int numberOfCylinders, String name) {
        this.engine = true;
        this.numberOfCylinders = numberOfCylinders;
        this.numberOfWheels = 4;
        this.name = name;

    }

    public boolean isEngine() {
        return engine;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car.startEngine() called.\nEngine initiated.";
    }

    public String accelerate() {
        return "Car.accelerate() called.\nAcceleration initiated.";
    }

    public String brake() {
        return "Car.brake() called.\nBraking initiated.";
    }
}

class Mazda extends Car {
    public Mazda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mazda.startEngine() called.\nEngine initiated.";
    }

    @Override
    public String accelerate() {
        return "Mazda.accelerate() called.\nAcceleration initiated.";
    }

    @Override
    public String brake() {
        return "Mazda.brake() called.\nBraking initiated.";
    }
}

class Toyota extends Car {
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Toyota.startEngine() called.\nEngine initiated.";
    }

    @Override
    public String accelerate() {
        return "Toyota.accelerate() called.\nAcceleration initiated.";
    }

    @Override
    public String brake() {
        return "Toyota.brake() called.\nBraking initiated.";

    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4, "van");
        System.out.println(car.getName() + '\n');
        System.out.println(car.accelerate() + '\n');
        System.out.println(car.brake() + '\n');
        System.out.println(car.startEngine() + '\n');
        System.out.println("**************");
        Car mazda3 = new Mazda(8, "Mazda3");
        System.out.println(mazda3.accelerate() + '\n');
        System.out.println(mazda3.brake() + '\n');
        System.out.println(mazda3.startEngine() + '\n');
        System.out.println("**************");
        Toyota camry = new Toyota(4, "Camry");
        System.out.println(camry.accelerate() + '\n');
        System.out.println(camry.brake() + '\n');
        System.out.println(camry.startEngine() + '\n');
    }
}
