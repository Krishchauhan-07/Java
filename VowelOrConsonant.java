import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single letter: ");
        String input = scanner.nextLine();
        
        if (input.length() != 1) {
            System.out.println("Error: Please enter exactly one character.");
            scanner.close();
            return;
        }
        
        char ch = input.charAt(0);
        
        if (!Character.isLetter(ch)) {
            System.out.println("Error: '" + ch + "' is not a letter.");
            scanner.close();
            return;
        }
        
        char lowerCh = Character.toLowerCase(ch);
        
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || 
            lowerCh == 'o' || lowerCh == 'u') {
            System.out.println("'" + ch + "' is a vowel.");
        } else {
            System.out.println("'" + ch + "' is a consonant.");
        }
        
        scanner.close();
    }
}