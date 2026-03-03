import java.util.Scanner;

/* Print all palindrome numbers between 1 and N. */

public class Q3_PalindromeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        // swap if start > end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Palindrome numbers in given range:");

        for (int i = start; i <= end; i++) {

            int num = Math.abs(i);
            int original = num;
            int reverse = 0;

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            // Special case: 0
            if (i == 0) {
                System.out.print(i + " ");
            }
            else if (original == reverse) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}