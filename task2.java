import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        System.out.print("Enter price per square meter: ");
        double price = sc.nextDouble();

        // Calculate floor area
        double area = length * width;

        // Add 5% for waste/damage
        double totalArea = area * 1.05;

        // Calculate total cost
        double totalCost = totalArea * price;

        // Output
        System.out.printf("Total amount required = %.2f%n", totalCost);

        sc.close();
    }
}