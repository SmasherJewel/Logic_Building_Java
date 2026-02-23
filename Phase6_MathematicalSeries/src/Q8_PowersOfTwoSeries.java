import java.util.Scanner;

/* Print the series of powers of two: 1 + 2 + 4 + 8 + … + 2ⁿ. */

public class Q8_PowersOfTwoSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! Enter non-negative number.");
            sc.close();
            return;
        }

        if (n > 62) {
            System.out.println("Value too large. It may overflow long.");
        }

        System.out.println("\nSeries:");

        long value = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(value + " ");
            value *= 2;
        }

        sc.close();
    }
}