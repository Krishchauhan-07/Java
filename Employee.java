import java.util.Scanner;

public class Employee {
    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        // Using nextLine() to allow names with spaces
        this.employeeName = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        // Validation to ensure a double is entered could be added here
        this.employeeSalary = scanner.nextDouble();
    }

    
    public void displayEmployeeData() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name:   " + this.employeeName);
        // Formatting salary to show 2 decimal places
        System.out.printf("Salary: $%.2f%n", this.employeeSalary);
        System.out.println("------------------------");
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // 1. Object Creation
        Employee emp = new Employee();

        // 2. Method Invocation
        System.out.println("Reading data for new employee...");
        emp.readEmployeeData();

        System.out.println("Displaying employee data...");
        emp.displayEmployeeData();
    }
}