import java.util.Scanner;

/* Check whether the given number is a palindrome. */

public class Q7_Palindrome_OR_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is palindrome or not: ");
        long num = sc.nextLong();
        if (num < 0) {
            System.out.println(num + " it is not a Palindrome number");
            sc.close();
            return;
        }
        long storeNum = num;

        long rev = 0;
        do {
            rev = (rev * 10) + num % 10;
            num /= 10;
        } while (num > 0);
        sc.close();

        if (storeNum == rev) {
            System.out.println(storeNum + " it is a Palindrome number");
        } else {
            System.out.println(storeNum + " it is not a Palindrome number");
        }
    }
}
