package lt.vcd;

import java.util.Scanner;

public class Main {
    void main() {
        Scanner scanner = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        // Check if the sides can form a valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            // Calculate semi-perimeter
            double s = (a + b + c) / 2.0;

            // Calculate area using Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Output formatted result
            System.out.printf("Area of the triangle: %.2f%n", area);
        } else {
            System.out.println("The given side lengths do not form a valid triangle.");
        }

        scanner.close();
    }
}