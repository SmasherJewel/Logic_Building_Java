import java.util.Scanner;

/* Calculate and print the value of the series
    1! + 2! + 3! + … + n!.  */

public class Q9_SumOfFactorialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        if (n > 20) {
            System.out.println("Maximum allowed value is 20 to prevent overflow.");
            sc.close();
            return;
        }

        long sum = 0;
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }

        System.out.println("Sum of factorial series up to " + n + " is: " + sum);

        sc.close();
    }
}