// Practical 24
// Method Overriding: Base class Employee and Derived class Manager

class Employee {
    String name;
    String department;
    int    empId;

    // Constructor
    Employee(int empId, String name, String department) {
        this.empId      = empId;
        this.name       = name;
        this.department = department;
    }

    // Method to be overridden
    void displayDetails() {
        System.out.println("  Employee ID  : " + empId);
        System.out.println("  Name         : " + name);
        System.out.println("  Department   : " + department);
    }
}

// ─────────────────────────────────────────────
// Derived class: Manager (overrides displayDetails)
// ─────────────────────────────────────────────
class Manager extends Employee {
    int    teamSize;
    String projectName;

    // Constructor
    Manager(int empId, String name, String department, int teamSize, String projectName) {
        super(empId, name, department); // call base class constructor
        this.teamSize    = teamSize;
        this.projectName = projectName;
    }

    // Overriding displayDetails()
    @Override
    void displayDetails() {
        super.displayDetails();         // call base class version first
        System.out.println("  Role         : Manager");
        System.out.println("  Project Name : " + projectName);
        System.out.println("  Team Size    : " + teamSize + " members");
    }
}

// ─────────────────────────────────────────────
// Main class
// ─────────────────────────────────────────────
public class practical24 {
    public static void main(String[] args) {

        // Base class object
        Employee emp = new Employee(1001, "Amit Verma", "Development");

        // Derived class object
        Manager mgr = new Manager(2001, "Neha Joshi", "Development", 8, "Smart India Portal");

        // Runtime polymorphism using base class reference
        Employee ref;

        System.out.println("==========================================");
        System.out.println("   [1] Employee Object → displayDetails()");
        System.out.println("==========================================");
        emp.displayDetails();

        System.out.println("\n==========================================");
        System.out.println("   [2] Manager Object → displayDetails()");
        System.out.println("==========================================");
        mgr.displayDetails();

        System.out.println("\n==========================================");
        System.out.println("   [3] Runtime Polymorphism Demo");
        System.out.println("==========================================");

        // ref points to Employee — calls Employee's version
        ref = emp;
        System.out.println("\n-- Base class reference → Employee object --");
        ref.displayDetails();

        // ref points to Manager — calls Manager's overridden version at RUNTIME
        ref = mgr;
        System.out.println("\n-- Base class reference → Manager object --");
        ref.displayDetails();

        System.out.println("\n==========================================");
        System.out.println("  Java resolved the correct method at");
        System.out.println("  runtime using Dynamic Method Dispatch.");
        System.out.println("==========================================");
    }
}