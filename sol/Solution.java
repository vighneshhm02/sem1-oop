package sol;

import shapes.Square;
import shapes.Triangle;
import shapes.Circle;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Area of Square: " + square.calculateArea());
                break;

            case 2: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Area of Triangle: " + triangle.calculateArea());
                break;

            case 3: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of Circle: " + circle.calculateArea());
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
                break;
        }

        scanner.close();
    }
}