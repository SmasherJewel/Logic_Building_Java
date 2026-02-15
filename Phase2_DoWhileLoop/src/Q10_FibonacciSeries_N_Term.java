import java.util.Scanner;

/* Print the Fibonacci series up to the required number of terms. */

public class Q10_FibonacciSeries_N_Term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N term to print fibonacci: ");
        long term = sc.nextLong();

        if (term <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }


        long a = 0, b = 1;
        long i = 1;
        System.out.println("Fibonacci Series is: ");
        do {
            System.out.print(a + " ");
            long temp = a + b;
            a = b;
            b = temp;
            i++;
        } while (i <= term);
        sc.close();
    }
}
