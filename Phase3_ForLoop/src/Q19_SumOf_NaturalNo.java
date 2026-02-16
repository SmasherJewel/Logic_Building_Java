import java.util.Scanner;

/* Find and print the sum of the first n natural numbers. */

public class Q19_SumOf_NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find sum of first n natural numbers: ");
        long num = sc.nextLong();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        long sum = 0;

        for (long i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + num + " natural numbers is: " + sum);

        sc.close();
    }
}
