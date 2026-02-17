import java.util.Scanner;

/* Generate and print a number triangle pattern using nested loops. */

public class Q6_NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        if (n > 50) {
            System.out.println("Too many rows! Please enter value below 50.");
            sc.close();
            return;
        }

        System.out.println("\nNumber Triangle Pattern:\n");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}