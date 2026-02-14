import java.util.Scanner;

/* Find the largest digit in the given number */

public class Q29_HighestDigit_InNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0) {
            System.out.println("Largest digit is: 0");
            sc.close();
            return;
        }

        int largest = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                largest = digit;
            }
            num /= 10;
        }

        sc.close();
        System.out.println("Largest digit is: " + largest);
    }
}
