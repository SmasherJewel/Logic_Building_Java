import java.util.Scanner;

/* Count and print the number of digits in the given number. */

public class Q5_CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = Math.abs(sc.nextLong());

        if (num == 0){
            System.out.println("Count of digit is: 1");
            sc.close();
            return;
        }
        long count = 0;
        do {
            count++;
            num /= 10;
        }while (num > 0);
        sc.close();
        System.out.println("Count of digit is: " + count);
    }
}
