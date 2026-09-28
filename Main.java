package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // Input room dimensions and tile price
        System.out.print("Enter the length of the room (integer): ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the room (integer): ");
        int width = scanner.nextInt();

        System.out.print("Enter the price per square unit of tile: ");
        double pricePerUnit = scanner.nextDouble();
        // Calculate base area and required area including 5% extra for waste
        int baseArea = length * width;
        double totalAreaNeeded = baseArea * 1.05;

        // Calculate total price
        double totalPrice = totalAreaNeeded * pricePerUnit;

        // Output formatted result
        System.out.println("\n--- Summary ---");
        System.out.println("Base Area: " + baseArea + " sq units");
        System.out.printf("Total Area Needed (with 5%% waste): %.2f sq units%n", totalAreaNeeded);
        System.out.printf("Total Cost: $%.2f%n", totalPrice);

        scanner.close();
    }
}