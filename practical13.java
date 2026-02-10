public class practical13 {
    
    private double width;
    private double height;

    public practical13(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayInfo(String name) {
        System.out.println("--- " + name + " ---");
        System.out.println("Width:     " + width);
        System.out.println("Height:    " + height);
        System.out.println("Area:      " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println();
    }

    public static void main(String[] args) {

        practical13 rect1 = new practical13(4, 40);
        practical13 rect2 = new practical13(3.5, 35.9);

        rect1.displayInfo("Rectangle 1");
        rect2.displayInfo("Rectangle 2");

        System.out.println("--- Comparison ---");
        if (rect1.getArea() > rect2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (rect2.getArea() > rect1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}