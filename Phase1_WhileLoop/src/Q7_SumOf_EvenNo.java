import java.util.Scanner;

/* Calculate the sum of all even numbers from 1 up to n. */

public class Q7_SumOf_EvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        long num = Math.abs(sc.nextLong());

        if (num == 0) {
            System.out.println("Enter a number greater than zero");
            return;
        }

        long sum = 0;
        long i = 2;
        while (i <= num){
            sum += i;
            i += 2;
        }
        sc.close();
        System.out.print("Sum of all Even numbers: " + sum);
    }
}
