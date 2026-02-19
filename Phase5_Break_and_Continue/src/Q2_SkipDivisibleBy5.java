import java.util.Scanner;

/* Print numbers from 1 to 100, but skip all numbers that are
    divisible by 5 and continue printing the rest. */

public class Q2_SkipDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        if (range <= 0) {
            System.out.println("Invalid input! Please enter a positive number.");
            sc.close();
            return;
        }

        if (range > 1000000) {
            System.out.println("Range too large!");
            sc.close();
            return;
        }

        System.out.println("\nNumbers from 1 to " + range + " (excluding multiples of 5):\n");

        for (int i = 1; i <= range; i++) {

            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
