import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of triangles:");
        int numTriangles = scanner.nextInt();
        Triangle[] triangles = new Triangle[numTriangles];

        for (int i = 0; i < numTriangles; i++) {
            System.out.println("Enter the vertices of Triangle " + (i + 1));
            Point p1 = createPoint(scanner);
            Point p2 = createPoint(scanner);
            Point p3 = createPoint(scanner);
            triangles[i] = new Triangle(p1, p2, p3);
        }

        for (int i = 0; i < numTriangles; i++) {
            double perimeter = triangles[i].calculatePerimeter();
            System.out.println("Triangle " + (i + 1) + " Perimeter: " + perimeter);

            if (triangles[i].isIsosceles()) {
                System.out.println("Triangle " + (i + 1) + " is isosceles");
            } else {
                System.out.println("Triangle " + (i + 1) + " is not isosceles");
            }
        }
    }

    public static Point createPoint(Scanner scanner) {
        System.out.println("Enter the x-coordinate:");
        double x = scanner.nextDouble();
        System.out.println("Enter the y-coordinate:");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }
}