public class practical18 {

    String accountHolderName;
    double balance;
    static double interestRate = 4.5;

    practical18(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void displayInterest() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : Rs. " + balance);
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Interest Earned: Rs. " + calculateInterest());
        System.out.println("-----------------------------");
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to: " + interestRate + "%\n");
    }

    public static void main(String[] args) {

        practical18 acc1 = new practical18("Aakash Mehta", 50000);
        practical18 acc2 = new practical18("Bhavna Shah", 120000);
        practical18 acc3 = new practical18("Chirag Patel", 75000);

        System.out.println("===== Interest Before Rate Update =====\n");
        acc1.displayInterest();
        acc2.displayInterest();
        acc3.displayInterest();

        updateInterestRate(6.0);

        System.out.println("===== Interest After Rate Update =====\n");
        acc1.displayInterest();
        acc2.displayInterest();
        acc3.displayInterest();
    }
}