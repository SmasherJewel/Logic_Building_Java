/* Print all numbers between 1 and 100 whose sum of digits is even. */

import java.util.Scanner;

public class Q1_SumOfDigitsEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Numbers whose sum of digits is even:");

        for (int i = start; i <= end; i++) {

            int num = Math.abs(i);
            int sum = 0;

            if (num == 0) {
                sum = 0;
            }

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            if (sum % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}