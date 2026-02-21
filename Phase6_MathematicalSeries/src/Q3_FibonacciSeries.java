import java.util.Scanner;

/* Print the Fibonacci series up to the required number of terms. */

public class Q3_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Number of terms must be positive.");
            sc.close();
            return;
        }

        System.out.println("\nFibonacci Series:");

        long a = 0, b = 1;

        if (n >= 1) {
            System.out.print(a + " ");
        }

        if (n >= 2) {
            System.out.print(b + " ");
        }

        if (n > 92) {
            System.out.println("Number of terms is too large. Please enter 92 or less.");
            sc.close();
            return;
        }

        for (int i = 3; i <= n; i++) {
            long next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        sc.close();
    }
}