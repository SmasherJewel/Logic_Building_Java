import java.util.Scanner;

/* Print the Fibonacci pattern row by row,
    where each row prints the next Fibonacci numbers */

/*      `   Row 1 → 1 number
            Row 2 → 2 numbers
            Row 3 → 3 numbers
            Row 4 → 4 numbers       */

public class Q5_FibonacciPattern_RowByRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        if (n > 20) {
            System.out.println("Too many rows! Please enter value below 20.");
            sc.close();
            return;
        }

        System.out.println("\nFibonacci Pattern:\n");

        long a = 0, b = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");

                long next = a + b;
                a = b;
                b = next;
            }

            System.out.println();
        }

        sc.close();
    }
}
