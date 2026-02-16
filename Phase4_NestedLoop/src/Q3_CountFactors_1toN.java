import java.util.Scanner;

/* For every number from 1 to n, count and print the total number of its factors. */

public class Q3_CountFactors_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        long n = sc.nextLong();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        if (n > 1000){
            System.out.println("Range too large! Please enter number below 1000.");
            sc.close();
            return;
        }

        System.out.println("Factors count from 1 to " + n + " is: ");
        for (long i = 1; i <= n; i++) {
            long count = 0;
            for (long j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            System.out.println("Number of factors of " + i + " is: " + count);
        }
        sc.close();
    }
}
