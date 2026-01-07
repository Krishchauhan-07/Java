import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Solve system of linear equations:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println();
        
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter constant e: ");
        double c = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double d = scanner.nextDouble();
        
        System.out.print("Enter coefficient d: ");
        double e = scanner.nextDouble();
        
        System.out.print("Enter constant f: ");
        double f = scanner.nextDouble();
        
        System.out.println();
        
        System.out.println("Your system of equations:");
        System.out.printf("%.2fx + %.2fy = %.2f%n", a, b, e);
        System.out.printf("%.2fx + %.2fy = %.2f%n", c, d, f);
        System.out.println();


        double D = a * d - b * c;

        if (D == 0) {
            System.out.println("Error: The system has no unique solution.");
            System.out.println("The determinant D = 0, which means:");
            System.out.println("- The equations are either parallel (no solution)");
            System.out.println("- Or the equations are identical (infinitely many solutions)");
        } else {
            
            double Dx = e * d - b * f;
            
            double Dy = a * f - c * e;
            
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Solution:");
            System.out.printf("x = %.4f%n", x);
            System.out.printf("y = %.4f%n", y);
            
            System.out.println();
            System.out.println("Verification:");
            double result1 = a * x + b * y;
            double result2 = c * x + d * y;
            System.out.printf("Equation 1: %.2fx + %.2fy = %.4f (should be %.2f)%n", 
                            a, b, result1, e);
            System.out.printf("Equation 2: %.2fx + %.2fy = %.4f (should be %.2f)%n", 
                            c, d, result2, f);
        }
        
        scanner.close();
    }
}