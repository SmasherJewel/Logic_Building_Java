import java.util.Scanner;

/* Find and print the product of all digits of a given number. */

public class Q10_ProductOf_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Product of Digit: ");
        long num = Math.abs(sc.nextLong());
        long originalNum = num;

        if (num == 0){
            System.out.println("Product of digits of " + originalNum + " is: 0");
            sc.close();
            return;
        }

        long pro = 1;
        while (num > 0){
            pro *= num % 10;
            num /= 10;
        }
        sc.close();
        System.out.println("Product of digits of " + originalNum + " is: " + pro);
    }
}
