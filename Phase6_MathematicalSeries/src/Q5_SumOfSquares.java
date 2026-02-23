import java.util.Scanner;

/* Calculate and print the value of the series
    1² + 2² + 3² + … + n².  */

public class Q5_SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }

        System.out.println("Sum of squares up to " + n + " is: " + sum);

        sc.close();
    }
}