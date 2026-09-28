package lt.vcd;

import java.util.Scanner;

public class Main {
    void main() {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();

        System.out.print("y1 = ");
        int y1 = scanner.nextInt();

        System.out.print("x2 = ");
        int x2 = scanner.nextInt();

        System.out.print("y2 = ");
        int y2 = scanner.nextInt();

        // Calculate length of sides
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y1 - y2);

        // Calculate area (s) and perimeter (p)
        int s = width * height;
        int p = 2 * (width + height);

        // Output results
        System.out.println("s = " + s + " and p = " + p);

        scanner.close();
    }
}