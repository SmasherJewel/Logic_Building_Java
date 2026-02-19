import java.util.Scanner;

/* Print numbers from 1 to N and stop when a number divisible by 17 is encountered */

public class Q1_StopAtDivisibleBy17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        if (range <= 0) {
            System.out.println("Please enter a positive range.");
            sc.close();
            return;
        }

        boolean stopped = false;

        for (int i = 1; i <= range; i++) {
            System.out.println(i);

            if (i % 17 == 0) {
                System.out.println("Loop stopped at " + i + " (divisible by 17)");
                stopped = true;
                break;
            }
        }

        if (!stopped) {
            System.out.println("No number divisible by 17 found within the given range.");
        }

        sc.close();
    }
}