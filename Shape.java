import java.util.Scanner;

public abstract class Shape {
    public abstract double calculateArea();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Shape shape;

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            shape = new Circle(radius);
        } else if (choice == 2) {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            shape = new Rectangle(length, width);
        } else if (choice == 3) {
            System.out.print("Enter base: ");
            double base = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            shape = new Triangle(base, height);
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.println("Area: " + shape.calculateArea());

        sc.close();
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}