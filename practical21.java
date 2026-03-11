public class practical21 {

    static double calculateVolume(double side) {
        return side * side * side;
    }

    static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    static double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        double cubeSide = 5.0;
        double rectLength = 8.0, rectWidth = 4.0, rectHeight = 3.0;
        double sphereRadius = 6.0;

        System.out.println("======= Volume Calculator =======\n");

        System.out.println("Shape          : Cube");
        System.out.println("Side           : " + cubeSide);
        System.out.printf("Volume         : %.2f cubic units%n", calculateVolume(cubeSide));

        System.out.println("\n---------------------------------");

        System.out.println("Shape          : Rectangular Cuboid");
        System.out.println("Length         : " + rectLength);
        System.out.println("Width          : " + rectWidth);
        System.out.println("Height         : " + rectHeight);
        System.out.printf("Volume         : %.2f cubic units%n", calculateVolume(rectLength, rectWidth, rectHeight));

        System.out.println("\n---------------------------------");

        System.out.println("Shape          : Sphere");
        System.out.println("Radius         : " + sphereRadius);
        System.out.printf("Volume         : %.2f cubic units%n", calculateVolume(sphereRadius, true));

        System.out.println("\n=================================");
    }
}