public class practical12 {
    private int x, y;

    public practical12() {
        this.x = 5;
        this.y = 5;
        System.out.println("Default Constructor called.");
    }

    public practical12(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parameterized Constructor called.");
    }

    public practical12(practical12 other) {
        this.x = other.x;
        this.y = other.y;
        System.out.println("Copy Constructor called.");
    }

    public void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        System.out.println("--- Testing Constructors ---");
        practical12 p1 = new practical12();
        p1.display();

        practical12 p2 = new practical12(12, 25);
        p2.display();

        practical12 p3 = new practical12(p2);
        p3.display();
        
        System.out.println("---------------------------");
    }
}