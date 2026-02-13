import java.util.Scanner;

/* Calculate the sum of all odd numbers from 1 up to n. */

public class Q8_SumOf_OddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        long num = Math.abs(sc.nextLong());

        if (num == 0) {
            System.out.println("Enter a number greater than zero");
            return;
        }

        long sum = 0;
        long i = 1;
        while (i <= num){
            sum += i;
            i += 2;
        }
        sc.close();
        System.out.print("Sum of all Odd numbers: " + sum);
    }
}
