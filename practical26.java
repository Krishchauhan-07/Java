// Practical 26
// Method Overriding: Online Payment System
// Superclass: Payment | Subclasses: CreditCardPayment, UPIPayment

import java.util.Scanner;

class Payment {
    // Base method (to be overridden)
    void processPayment(int amount) {
        System.out.println("  Processing payment of Rs. " + amount + "...");
    }
}

// ─────────────────────────────────────────────
// Subclass 1: CreditCardPayment
// ─────────────────────────────────────────────
class CreditCardPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("  Payment of Rs. " + amount + " done Using Credit Card.");
    }
}

// ─────────────────────────────────────────────
// Subclass 2: UPIPayment
// ─────────────────────────────────────────────
class UPIPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("  Payment of Rs. " + amount + " done using UPI.");
    }
}

// ─────────────────────────────────────────────
// Main class
// ─────────────────────────────────────────────
public class practical26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("       ONLINE PAYMENT SYSTEM");
        System.out.println("==========================================");
        System.out.println("  Select Payment Method:");
        System.out.println("  1. Credit Card");
        System.out.println("  2. UPI");
        System.out.println("==========================================");
        System.out.print("  Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("  Enter amount (Rs.): ");
        int amount = sc.nextInt();

        System.out.println("==========================================");

        // Runtime polymorphism: base class reference
        Payment p;

        if (choice == 1) {
            p = new CreditCardPayment();
            p.processPayment(amount);
        } else if (choice == 2) {
            p = new UPIPayment();
            p.processPayment(amount);
        } else {
            System.out.println("  Invalid choice! Please select 1 or 2.");
        }

        System.out.println("==========================================");
        sc.close();
    }
}