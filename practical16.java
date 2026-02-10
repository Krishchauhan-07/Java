public class practical16 {

    
    private double performMath(double P, int years, double annualRate) {
        double r = annualRate / 12 / 100; 
        int n = years * 12; 
        
        return (P * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    }


    public void calculateEMI(int principal, int time, float rate) {
        double emi = performMath(principal, time, rate);
        System.out.printf("Home Loan EMI: %.2f per month (at %.1f%% interest)\n", emi, rate);
    }

    public void calculateEMI(double principal, int time, double rate) {
        double emi = performMath(principal, time, rate);
        System.out.printf("Vehicle Loan EMI: %.2f per month (at %.1f%% interest)\n", emi, rate);
    }


    public void calculateEMI(int principal, int time) {
        double fixedRate = 10.0;
        double emi = performMath(principal, time, fixedRate);
        System.out.printf("Personal Loan EMI: %.2f per month (Fixed 10%% interest)\n", emi);
    }

    public static void main(String[] args) {
        practical16 calculator = new practical16();

        System.out.println("--- Loan EMI Calculator ---");

        calculator.calculateEMI(5000000, 20, 8.5f);

        calculator.calculateEMI(800000.0, 5, 12.0);

        calculator.calculateEMI(200000, 3);
        
        System.out.println("---------------------------");
    }
}