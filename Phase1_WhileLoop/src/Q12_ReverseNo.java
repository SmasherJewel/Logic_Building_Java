import java.util.Scanner;

/* Reverse the given number and print the reversed value. */

public class Q12_ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find reverse: ");
        int num = Math.abs(sc.nextInt());
        int rev = 0;

        if (num == 0){
            System.out.println("Reverse of the number is: 0");
            sc.close();
            return;
        }

        while (num > 0){
            rev = (rev * 10) + num % 10;
            num /= 10;
        }
        sc.close();
        System.out.println("Reverse of the number is: " + rev);
    }
}
