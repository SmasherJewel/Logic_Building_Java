import java.util.Scanner;

/* Check whether the given number is a Strong number,
    where the number equals the sum of factorials of its digits. */

public class Q12_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Strong number is defined for non-negative integers only.");
            sc.close();
            return;
        }

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number.");
        } else {
            System.out.println(original + " is NOT a Strong number.");
        }

        sc.close();
    }
}