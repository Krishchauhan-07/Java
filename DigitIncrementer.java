import java.util.Scanner;

public class DigitIncrementer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a five-digit integer: ");
        int number = scanner.nextInt();
        
        if (number < 10000 || number > 99999) {
            System.out.println("Error: Please enter a five-digit integer (10000-99999)");
            scanner.close();
            return;
        }
        
        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;
        
        digit1 = (digit1 + 1) % 10;
        digit2 = (digit2 + 1) % 10;
        digit3 = (digit3 + 1) % 10;
        digit4 = (digit4 + 1) % 10;
        digit5 = (digit5 + 1) % 10;
        
        int result = digit1 * 10000 + digit2 * 1000 + digit3 * 100 + digit4 * 10 + digit5;
        
        System.out.println("Original number: " + number);
        System.out.println("New number: " + result);
        
        scanner.close();
    }
}