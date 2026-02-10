import java.util.Scanner;

class BankAccount {
    private String accountId;
    private String accountHolderName;
    private double balance;

    public void assignValues(String id, String name, double initialBalance) {
        this.accountId = id;
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    public void displayValues() {
        System.out.println("ID: " + accountId + " | Name: " + accountHolderName + " | Balance: $" + balance);
    }


    public String getAccountId() {
        return accountId;
    }
}

public class practical14 {
    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        accounts[0].assignValues("B001", "Alice", 1500.50);
        accounts[1].assignValues("B002", "Bob", 2800.00);
        accounts[2].assignValues("B003", "Charlie", 50.75);
        accounts[3].assignValues("B004", "Diana", 12400.00);
        accounts[4].assignValues("B005", "Edward", 310.20);

        System.out.println("--- All Bank Accounts ---");
        for (BankAccount acc : accounts) {
            acc.displayValues();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Account ID to search: ");
        String searchId = sc.next();

        boolean found = false;
        for (BankAccount acc : accounts) {
            if (acc.getAccountId().equalsIgnoreCase(searchId)) {
                System.out.println("Account Found!");
                acc.displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Error: Account with ID " + searchId + " not found.");
        }
        
        sc.close();
    }
}