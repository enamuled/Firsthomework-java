import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        System.out.print("Enter average number of books read per month (v): ");
        int v = sc.nextInt();

        System.out.print("Enter total number of visitors per year (n): ");
        int n = sc.nextInt();

        // Calculate total books read in a year
        double k = (v * 12.0) / n;

        // Display result
        System.out.printf("Average books read per visitor in a year (k) = %.2f\n", k);

        sc.close();
    }
}