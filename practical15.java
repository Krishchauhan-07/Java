class BillGenerator {

    
    public void generateBill(int itemTotal) {
        double finalAmount = itemTotal;
        System.out.println("Customer Type: Regular");
        System.out.println("Original Total: " + itemTotal);
        System.out.println("Final Bill Amount: " + finalAmount);
    }


    public void generateBill(int itemTotal, int discount) {
        double finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Privileged");
        System.out.println("Original Total: " + itemTotal);
        System.out.println("Flat Discount: " + discount);
        System.out.println("Final Bill Amount: " + finalAmount);
    }

    public void generateBill(int itemTotal, double discountPercent) {
        double discountAmount = itemTotal * (discountPercent / 100);
        double finalAmount = itemTotal - discountAmount;
        System.out.println("Customer Type: Festive Offer");
        System.out.println("Original Total: " + itemTotal);
        System.out.println("Discount (" + discountPercent + "%): " + discountAmount);
        System.out.println("Final Bill Amount: " + finalAmount);
    }
}

public class practical15 {
    public static void main(String[] args) {
        BillGenerator mallBill = new BillGenerator();

        System.out.println("--- Shopping Mall Billing System ---");


        mallBill.generateBill(1000);
        System.out.println("------------------------------------");

        mallBill.generateBill(1000, 150);
        System.out.println("------------------------------------");

        mallBill.generateBill(1000, 10.0);
        System.out.println("------------------------------------");
    }
}