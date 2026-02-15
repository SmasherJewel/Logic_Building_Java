import java.util.Scanner;

/* Find and print the sum of digits of the given number. */

public class Q14_SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find sum of digit: ");
        long num = Math.abs(sc.nextLong());
        long storeNum = num;

        if (num == 0){
            System.out.println("Sum of Zero is: 0");
            sc.close();
            return;
        }

        long sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        }while (num > 0);
        sc.close();
        System.out.println("Sum of " + storeNum + " is: " + sum);
    }
}
