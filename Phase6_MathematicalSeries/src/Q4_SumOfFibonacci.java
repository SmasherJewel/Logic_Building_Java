import java.util.Scanner;

/* Find and print the sum of Fibonacci series up to n terms */

public class Q4_SumOfFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Number of terms must be positive.");
            sc.close();
            return;
        }

        if (n > 92) {
            System.out.println("Maximum allowed terms is 92 to prevent overflow.");
            sc.close();
            return;
        }

        long a = 0, b = 1;
        long sum = 0;

        if (n >= 1) {
            sum += a;
        }

        if (n >= 2) {
            sum += b;
        }

        for (int i = 3; i <= n; i++) {
            long next = a + b;
            sum += next;
            a = b;
            b = next;
        }

        System.out.println("Sum of Fibonacci series: " + sum);

        sc.close();
    }
}