import java.util.Scanner;

public class meter_to_feet {
    public static void main(String[] args) {
        final double METERS_TO_FEET = 3.28084;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        
        double feet = meters * METERS_TO_FEET;
        
        System.out.printf("%.2f meters = %.2f feet%n", meters, feet);
        
        scanner.close();
    }
}