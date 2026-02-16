import java.util.Scanner;

/* Find and print the sum of all factors of the given number. */

public class Q13_FactorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factors of that: ");
        long num = sc.nextLong();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        long sum = 0;
        for (long i = 1; i <= num; i++) {
            if (num % i == 0){
                sum += i;
            }
        }
        sc.close();
        System.out.println("Sum of the factors is: " + sum);
    }
}
