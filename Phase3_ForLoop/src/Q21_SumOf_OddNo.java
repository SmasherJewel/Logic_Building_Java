import java.util.Scanner;

/* Find and print the sum of all odd numbers from 1 up to n. */

public class Q21_SumOf_OddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long num = sc.nextLong();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        long sum = 0;

        for (long i = 1; i <= num; i += 2) {
            sum += i;
        }

        System.out.println("Sum of odd numbers up to " + num + " is: " + sum);

        sc.close();
    }
}
