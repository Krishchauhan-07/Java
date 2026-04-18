abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();

    void display() {
        System.out.println("Fuel Type : " + fuelType());
        System.out.println("No of Wheels : " + noOfWheels());
    }
}

class Car extends Vehicle {
    private String fuel;

    Car(String fuel) {
        this.fuel = fuel;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class Practical30 {
    public static void main(String[] args) {
        Car petrolCar = new Car("Petrol");
        Car dieselCar = new Car("Diesel");
        Bike bike = new Bike();

        System.out.println("===== Petrol Car =====");
        petrolCar.display();

        System.out.println("\n===== Diesel Car =====");
        dieselCar.display();

        System.out.println("\n===== Bike =====");
        bike.display();
    }
}