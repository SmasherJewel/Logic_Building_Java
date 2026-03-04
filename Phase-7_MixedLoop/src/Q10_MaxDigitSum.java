import java.util.Scanner;

/* Find the number between 1 and n that has the maximum digit sum,
    and print that number along with its digit sum. */

public class Q10_MaxDigitSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int maxSum = 0;
        int number = 0;

        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum > maxSum) {
                maxSum = sum;
                number = i;
            }
        }

        System.out.println("Number with maximum digit sum: " + number);
        System.out.println("Digit sum: " + maxSum);

        sc.close();
    }
}