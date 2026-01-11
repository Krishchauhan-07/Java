import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the lengths of three sides of a triangle:");
        System.out.print("Side a: ");
        double a = scanner.nextDouble();
        System.out.print("Side b: ");
        double b = scanner.nextDouble();
        System.out.print("Side c: ");
        double c = scanner.nextDouble();
        
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: All side lengths must be positive numbers.");
            scanner.close();
            return;
        }
        
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Error: These side lengths cannot form a valid triangle.");
            System.out.println("The sum of any two sides must be greater than the third side.");
            scanner.close();
            return;
        }
    
        double s = (a + b + c) / 2;
        
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("\n--- Triangle Information ---");
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Side c: " + c);
        System.out.println("Semi-perimeter (s): " + s);
        System.out.printf("Area of triangle: %.2f square units\n", area);
        
        scanner.close();
    }
}