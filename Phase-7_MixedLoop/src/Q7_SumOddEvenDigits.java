import java.util.Scanner;

/* Find & print the sum of odd digits & the sum of even digits of the given number. */

public class Q7_SumOddEvenDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        int oddSum = 0;
        int evenSum = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num /= 10;
        }

        System.out.println("Sum of odd digits: " + oddSum);
        System.out.println("Sum of even digits: " + evenSum);

        sc.close();
    }
}