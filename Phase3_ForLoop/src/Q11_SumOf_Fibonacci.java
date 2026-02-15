import java.util.Scanner;

/* Find and print the sum of the Fibonacci series. */

public class Q11_SumOf_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms to print fibonacci: ");
        long term = sc.nextLong();

        if (term <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        long a = 0, b = 1;
        long sum = 0;
        for (long i = 1; i <= term; i++) {
            sum += a;
            long temp = a + b;
            a = b;
            b = temp;
        }
        sc.close();
        System.out.println("Sum of Fibonacci Series: " + sum);
    }
}
