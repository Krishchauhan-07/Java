import java.util.Scanner;

public class BMICalculator {

    private static final double POUNDS_TO_KG = 0.45359237;
    private static final double INCHES_TO_METERS = 0.0254;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== BMI Calculator ===");
        System.out.println();
        
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();
        
        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();
        
        double weightKg = weightPounds * POUNDS_TO_KG;
        double heightMeters = heightInches * INCHES_TO_METERS;
        
        double bmi = weightKg / (heightMeters * heightMeters);
        
        System.out.println();
        System.out.println("=== Results ===");
        System.out.printf("Weight: %.2f lbs (%.2f kg)%n", weightPounds, weightKg);
        System.out.printf("Height: %.2f inches (%.2f meters)%n", heightInches, heightMeters);
        System.out.printf("Your BMI: %.2f%n", bmi);
        System.out.println();
        
        System.out.println("BMI Category: " + getBMICategory(bmi));
        
        scanner.close();
    }
    
    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}