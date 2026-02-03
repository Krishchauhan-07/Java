public class Rectangle {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
        // Fields are already initialized to 1.0 above
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    // Getters and Setters (Optional, but good practice)
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    // Main method for testing
    public static void main(String[] args) {
        // Test 1: Default Rectangle
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 (Default):");
        System.out.println("Width: " + rect1.width);
        System.out.println("Height: " + rect1.height);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println("-------------------");

        // Test 2: Custom Rectangle
        Rectangle rect2 = new Rectangle(4.0, 40.0);
        System.out.println("Rectangle 2 (Custom):");
        System.out.println("Width: " + rect2.width);
        System.out.println("Height: " + rect2.height);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}