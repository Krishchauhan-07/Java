// Practical 23
// Base class BankAccount with derived classes SavingAccount and FixedDepositAccount

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Open Account
    void openAccount(int accNo, String name, double initialDeposit) {
        accountNumber     = accNo;
        accountHolderName = name;
        balance           = initialDeposit;
        System.out.println("Account opened successfully!");
        System.out.println("  Account Number : " + accountNumber);
        System.out.println("  Account Holder : " + accountHolderName);
        System.out.println("  Initial Balance: Rs. " + balance);
    }

    // Deposit
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("  Deposited Rs. " + amount);
            System.out.println("  Updated Balance: Rs. " + balance);
        } else {
            System.out.println("  Invalid deposit amount.");
        }
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("  Withdrawn Rs. " + amount);
            System.out.println("  Remaining Balance: Rs. " + balance);
        } else if (amount > balance) {
            System.out.println("  Insufficient balance!");
        } else {
            System.out.println("  Invalid withdrawal amount.");
        }
    }

    // Check Balance
    void checkBalance() {
        System.out.println("  Account Holder : " + accountHolderName);
        System.out.println("  Current Balance: Rs. " + balance);
    }
}

// ─────────────────────────────────────────────
// Derived class: SavingAccount
// ─────────────────────────────────────────────
class SavingAccount extends BankAccount {
    double rateOfInterest; // annual rate in %
    int    years;

    void setSavingDetails(double rate, int years) {
        this.rateOfInterest = rate;
        this.years          = years;
    }

    // Simple Interest = (P * R * T) / 100
    void calculateInterest() {
        double interest = (balance * rateOfInterest * years) / 100;
        System.out.println("  Principal      : Rs. " + balance);
        System.out.println("  Rate of Interest: " + rateOfInterest + "% per annum");
        System.out.println("  Time Period    : " + years + " year(s)");
        System.out.println("  Interest Earned: Rs. " + interest);
        System.out.println("  Total Amount   : Rs. " + (balance + interest));
    }
}

// ─────────────────────────────────────────────
// Derived class: FixedDepositAccount
// ─────────────────────────────────────────────
class FixedDepositAccount extends BankAccount {
    double rateOfInterest; // annual rate in %
    int    tenureMonths;   // tenure in months

    void setFDDetails(double rate, int months) {
        this.rateOfInterest = rate;
        this.tenureMonths   = months;
    }

    // Compound Interest (quarterly): A = P * (1 + r/n)^(n*t)
    // n = 4 (quarterly), t = years
    void maturityAmount() {
        double t          = tenureMonths / 12.0;
        int    n          = 4; // compounded quarterly
        double r          = rateOfInterest / 100.0;
        double maturity   = balance * Math.pow((1 + r / n), n * t);

        System.out.println("  Principal      : Rs. " + balance);
        System.out.println("  Rate of Interest: " + rateOfInterest + "% per annum");
        System.out.println("  Tenure         : " + tenureMonths + " month(s)");
        System.out.printf( "  Maturity Amount: Rs. %.2f%n", maturity);
        System.out.printf( "  Interest Earned: Rs. %.2f%n", (maturity - balance));
    }
}

// ─────────────────────────────────────────────
// Main class
// ─────────────────────────────────────────────
public class practical23 {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("         SAVING ACCOUNT");
        System.out.println("========================================");

        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Rahul Sharma", 50000);
        sa.setSavingDetails(6.5, 2);

        System.out.println("\n-- Deposit --");
        sa.deposit(10000);

        System.out.println("\n-- Withdraw --");
        sa.withdraw(5000);

        System.out.println("\n-- Check Balance --");
        sa.checkBalance();

        System.out.println("\n-- Calculate Interest --");
        sa.calculateInterest();

        System.out.println("\n========================================");
        System.out.println("       FIXED DEPOSIT ACCOUNT");
        System.out.println("========================================");

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(202, "Priya Patel", 100000);
        fd.setFDDetails(7.5, 24); // 24 months, 7.5% per annum

        System.out.println("\n-- Check Balance --");
        fd.checkBalance();

        System.out.println("\n-- Maturity Amount (Quarterly Compound) --");
        fd.maturityAmount();

        System.out.println("\n-- Withdraw Attempt (FD before maturity) --");
        fd.withdraw(20000);

        System.out.println("========================================");
    }
}