import java.util.Scanner;

public class ATMCashDispenser {
    
    private static final int[] DENOMINATIONS = {100, 50, 10, 5, 2, 1};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ATM Cash Dispenser ===");
        System.out.println();
        
        
        System.out.print("Enter the amount to dispense: ");
        int amount = scanner.nextInt();
        
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            scanner.close();
            return;
        }
        
        System.out.println();
        System.out.println("Dispensing $" + amount + "...");
        System.out.println();
        
    
        int remainingAmount = amount;
        int totalNotes = 0;
        
        System.out.println("Currency Notes Breakdown:");
        System.out.println("-------------------------");
        
        for (int denomination : DENOMINATIONS) {
            if (remainingAmount >= denomination) {
                int noteCount = remainingAmount / denomination;
                remainingAmount = remainingAmount % denomination;
                totalNotes += noteCount;
                
                System.out.printf("$%-3d x %2d = $%d%n", 
                    denomination, noteCount, denomination * noteCount);
            }
        }
        
        System.out.println("-------------------------");
        System.out.println("Total notes: " + totalNotes);
        System.out.println();
        System.out.println("Transaction complete!");
        
        scanner.close();
    }
}