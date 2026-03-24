// Practical 22
// Base class Shape with derived classes Triangle and Rectangle

class Shape {
    double d1, d2;

    // Method to initialize dimensions
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class Triangle
class Triangle extends Shape {
    double area() {
        // Area of Triangle = 0.5 * base * height
        return 0.5 * d1 * d2;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    double area() {
        // Area of Rectangle = length * breadth
        return d1 * d2;
    }
}

// Main class
public class practical22 {
    public static void main(String[] args) {

        // Triangle object
        Triangle t = new Triangle();
        t.getData(6.0, 4.0);
        System.out.println("Triangle:");
        System.out.println("  Base    = " + t.d1);
        System.out.println("  Height  = " + t.d2);
        System.out.println("  Area    = " + t.area());

        System.out.println();

        // Rectangle object
        Rectangle r = new Rectangle();
        r.getData(5.0, 3.0);
        System.out.println("Rectangle:");
        System.out.println("  Length  = " + r.d1);
        System.out.println("  Breadth = " + r.d2);
        System.out.println("  Area    = " + r.area());
    }
}