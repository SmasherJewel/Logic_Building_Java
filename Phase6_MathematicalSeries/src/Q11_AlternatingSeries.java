import java.util.Scanner;

/* Calculate and print the value of the series
    x − x²/2! + x³/3! − x⁴/4! + ….  */

public class Q11_AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Number of terms must be positive.");
            sc.close();
            return;
        }

        double sum = 0;
        double term = x;
        int sign = 1;

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                sum += term;
            } else {
                term = term * x / i;
                sign *= -1;
                sum += sign * term;
            }
        }

        System.out.println("Sum of series: " + sum);

        sc.close();
    }
}