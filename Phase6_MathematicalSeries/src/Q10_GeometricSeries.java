import java.util.Scanner;

/* Calculate and print the value of the series
    1 + x + x² + x³ + … + xⁿ.   */

public class Q10_GeometricSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! n must be non-negative.");
            sc.close();
            return;
        }

        double sum = 0;
        double term = 1;

        for (int i = 0; i <= n; i++) {
            sum += term;
            term *= x;
        }

        System.out.println("Sum of series is: " + sum);

        sc.close();
    }
}