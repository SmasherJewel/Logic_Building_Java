import java.util.Scanner;

/* Reverse the given number and print the reversed value */

public class Q6_ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it: ");
        long num = Math.abs(sc.nextLong());
        long storeNum = num;

        long rev = 0;
        do {
            rev = (rev * 10) + num % 10;
            num /= 10;
        }while (num > 0);
        sc.close();
        System.out.println("Reverse of " + storeNum + " is: " + rev);
    }
}
