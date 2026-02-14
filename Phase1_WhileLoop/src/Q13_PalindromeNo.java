import java.util.Scanner;

/* Check whether the given number is a palindrome. */

public class Q13_PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is palindrome: ");
        int num = Math.abs(sc.nextInt());
        int storeNum = num;
        int rev = 0;

        if (num == 0){
            System.out.println("0 is a Palindrome number");
            sc.close();
            return;
        }

        while (num > 0){
            rev = (rev * 10) + num % 10;
            num /= 10;
        }
        sc.close();
        if (storeNum == rev){
            System.out.print(storeNum + " is a Palindrome number");
        }else {
            System.out.print(storeNum + " is not a Palindrome number");
        }
    }
}
