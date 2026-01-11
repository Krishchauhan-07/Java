public class CommandLineCalculator {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two numbers as arguments.");
            System.out.println("Usage: java CommandLineCalculator <number1> <number2>");
            System.out.println("Example: java CommandLineCalculator 5.5 3.2");
            return;
        }
        
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;
            
            System.out.println("=== Calculator Results ===");
            System.out.println("First number:  " + num1);
            System.out.println("Second number: " + num2);
            System.out.println();
            System.out.println("Sum:        " + num1 + " + " + num2 + " = " + sum);
            System.out.println("Difference: " + num1 + " - " + num2 + " = " + difference);
            System.out.println("Product:    " + num1 + " × " + num2 + " = " + product);
            
            if (num2 != 0) {
                System.out.println("Quotient:   " + num1 + " ÷ " + num2 + " = " + quotient);
            } else {
                System.out.println("Quotient:   Cannot divide by zero");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
            System.out.println("Please provide valid numeric values.");
            System.out.println("Example: java CommandLineCalculator 5.5 3.2");
        }
    }
}