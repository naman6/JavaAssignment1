import java.util.Scanner;
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}

class Triangle {
    private Point[] vertices;

    // Constructor for creating a Triangle with three points
    public Triangle(Point p1, Point p2, Point p3) {
        vertices = new Point[]{p1, p2, p3};
    }

    // Method to calculate the perimeter of the triangle
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < 3; i++) {
            int nextIdx = (i + 1) % 3;
            perimeter += vertices[i].distanceTo(vertices[nextIdx]);
        }
        return perimeter;
    }

    // Method to check if the triangle is isosceles
    public boolean isIsosceles() {
        double side1 = vertices[0].distanceTo(vertices[1]);
        double side2 = vertices[1].distanceTo(vertices[2]);
        double side3 = vertices[2].distanceTo(vertices[0]);

        return (side1 == side2 || side2 == side3 || side3 == side1);
    }
}

class Triangle {
    private Point[] vertices;

    public Triangle(Point p1, Point p2, Point p3) {
        vertices = new Point[]{p1, p2, p3};
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < 3; i++) {
            int nextIdx = (i + 1) % 3;
            perimeter += vertices[i].distanceTo(vertices[nextIdx]);
        }
        return perimeter;
    }

    public boolean isIsosceles() {
        double side1 = vertices[0].distanceTo(vertices[1]);
        double side2 = vertices[1].distanceTo(vertices[2]);
        double side3 = vertices[2].distanceTo(vertices[0]);

        return (side1 == side2 || side2 == side3 || side3 == side1);
    }
}