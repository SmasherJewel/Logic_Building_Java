import java.util.Scanner;

/* Find the smallest digit in the given number */

public class Q28_SmallestDigit_InNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Math.abs(sc.nextInt());


        if (num == 0) {
            System.out.println("Smallest digit is: 0");
            sc.close();
            return;
        }

        int smallest = 9;
        while (num > 0){
            int digit = num % 10;
            if (digit < smallest){
                smallest = digit;
            }
            num /= 10;
        }
        sc.close();
        System.out.println("Smallest digit is: " + smallest);
    }
}
