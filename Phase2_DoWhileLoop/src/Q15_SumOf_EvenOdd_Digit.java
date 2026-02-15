import java.util.Scanner;

/* Calculate and print the sum of even digits and
    the sum of odd digits of the given number separately */

public class Q15_SumOf_EvenOdd_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find sum of digit: ");
        long num = Math.abs(sc.nextLong());

        if (num == 0){
            System.out.println("Sum of Zero is: 0");
            sc.close();
            return;
        }

        long sumEven = 0;
        long sumOdd = 0;
        do {
            long digit = num % 10;
            if (digit % 2 == 0){
                sumEven += digit;
            }else {
                sumOdd += digit;
            }
            num /= 10;
        }while (num > 0);
        sc.close();
        System.out.println("Sum of Even Digit is: " + sumEven);
        System.out.println("Sum of Odd Digit is: " + sumOdd);
    }
}
