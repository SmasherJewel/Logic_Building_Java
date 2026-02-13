import java.util.Scanner;

/* Calculate and print the sum of the first n natural numbers. */

public class Q6_SumOf_N_NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a N range to print sum of N Natural Numbers: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0){
            System.out.println("Please Enter a range greater than Zero");
            return;
        }

        // Using Mathematical Formula

        long sum = (long) num * (num + 1) / 2;

        System.out.println("Sum of first " + num + " natural numbers = " + sum);

        sc.close();

        // Brute force technique
        /* int i = 1, sum = 0;

        while (i <= num){
            sum += i;
            i++;
        }
        sc.close();
        System.out.print("Sum of N natural number: " + sum); */
    }
}
