import java.util.Scanner;

/* Take 5 numbers as input, skip any number that is 0 using continue, and
    calculate the sum of the remaining numbers. */

public class Q3_SkipZeroAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int validCount = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                continue;
            }
            sum += num;
            validCount++;
        }
        if (validCount == 0) {
            System.out.println("All entered numbers were zero. No valid numbers to sum.");
        } else {
            System.out.println("Sum of non-zero numbers: " + sum);
        }
        sc.close();
    }
}
