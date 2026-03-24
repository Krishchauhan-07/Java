// Practical 25
// Multi-level Inheritance: Vehicle → Car → ElectricCar
// Demonstrates: Constructor Chaining, Method Overriding, super keyword,
//               protected access, instanceof, Upcasting & Downcasting

class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    // Base class constructor
    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand         = brand;
        this.fuelType      = fuelType;
        System.out.println("  [Vehicle constructor called]");
    }

    void displayDetails() {
        System.out.println("  Vehicle Number : " + vehicleNumber);
        System.out.println("  Brand          : " + brand);
        System.out.println("  Fuel Type      : " + fuelType);
    }
}

// ─────────────────────────────────────────────
// Level 1 Derived class: Car
// ─────────────────────────────────────────────
class Car extends Vehicle {
    protected int     numberOfSeats;
    protected boolean acAvailable;

    // Constructor chaining via super()
    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean acAvailable) {
        super(vehicleNumber, brand, fuelType); // calls Vehicle constructor
        this.numberOfSeats = numberOfSeats;
        this.acAvailable   = acAvailable;
        System.out.println("  [Car constructor called]");
    }

    @Override
    void displayDetails() {
        super.displayDetails(); // invoke parent method
        System.out.println("  Number of Seats: " + numberOfSeats);
        System.out.println("  AC Available   : " + (acAvailable ? "Yes" : "No"));
    }
}

// ─────────────────────────────────────────────
// Level 2 Derived class: ElectricCar
// ─────────────────────────────────────────────
class ElectricCar extends Car {
    private double batteryCapacity; // in kWh
    private int    chargingTime;    // in hours

    // Constructor chaining via super()
    ElectricCar(String vehicleNumber, String brand,
                int numberOfSeats, boolean acAvailable,
                double batteryCapacity, int chargingTime) {
        super(vehicleNumber, brand, "Electric", numberOfSeats, acAvailable); // calls Car constructor
        this.batteryCapacity = batteryCapacity;
        this.chargingTime    = chargingTime;
        System.out.println("  [ElectricCar constructor called]");
    }

    @Override
    void displayDetails() {
        super.displayDetails(); // invoke Car's displayDetails (which calls Vehicle's too)
        System.out.println("  Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("  Charging Time   : " + chargingTime + " hour(s)");
    }

    // ElectricCar-specific method
    void chargingStatus() {
        System.out.println("  Charging " + brand + " (" + vehicleNumber + ")...");
        System.out.println("  Full charge in " + chargingTime + " hour(s).");
    }
}

// ─────────────────────────────────────────────
// Main class
// ─────────────────────────────────────────────
public class practical25 {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("  [1] Vehicle Object");
        System.out.println("==========================================");
        Vehicle v1 = new Vehicle("GJ01AB1234", "Bajaj", "Diesel");
        System.out.println();
        v1.displayDetails();

        System.out.println("\n==========================================");
        System.out.println("  [2] Car Object");
        System.out.println("==========================================");
        Car c1 = new Car("GJ05CD5678", "Maruti Suzuki", "Petrol", 5, true);
        System.out.println();
        c1.displayDetails();

        System.out.println("\n==========================================");
        System.out.println("  [3] ElectricCar Object");
        System.out.println("==========================================");
        ElectricCar e1 = new ElectricCar("GJ01EV9999", "Tata Nexon EV", 5, true, 40.5, 8);
        System.out.println();
        e1.displayDetails();

        // ── Upcasting ────────────────────────────────
        System.out.println("\n==========================================");
        System.out.println("  [4] Upcasting: Vehicle ref → Car object");
        System.out.println("==========================================");
        Vehicle vRef = new Car("MH12XY4321", "Honda City", "Petrol", 5, true);
        System.out.println();
        vRef.displayDetails(); // calls Car's overridden version (runtime polymorphism)

        // ── instanceof + Downcasting ──────────────────
        System.out.println("\n==========================================");
        System.out.println("  [5] Downcasting with instanceof check");
        System.out.println("==========================================");

        Vehicle vRef2 = new ElectricCar("DL3CEV0101", "MG ZS EV", 5, true, 50.3, 7);
        System.out.println();
        vRef2.displayDetails();

        System.out.println();
        if (vRef2 instanceof ElectricCar) {
            System.out.println("  instanceof check: vRef2 IS an ElectricCar → Downcasting...");
            ElectricCar ec = (ElectricCar) vRef2; // safe downcast
            ec.chargingStatus();                   // access subclass-specific method
        }

        // ── instanceof checks for all types ──────────
        System.out.println("\n==========================================");
        System.out.println("  [6] instanceof Type Checks");
        System.out.println("==========================================");
        System.out.println("  e1 instanceof Vehicle    : " + (e1 instanceof Vehicle));
        System.out.println("  e1 instanceof Car        : " + (e1 instanceof Car));
        System.out.println("  e1 instanceof ElectricCar: " + (e1 instanceof ElectricCar));
        System.out.println("  c1 instanceof ElectricCar: " + (c1 instanceof ElectricCar));
        System.out.println("  v1 instanceof Car        : " + (v1 instanceof Car));

        System.out.println("\n==========================================");
        System.out.println("  Program Completed Successfully.");
        System.out.println("==========================================");
    }
}