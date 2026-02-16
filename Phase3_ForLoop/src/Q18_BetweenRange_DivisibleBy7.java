import java.util.Scanner;

/* Print all numbers between a and b that are divisible by 7. */

public class Q18_BetweenRange_DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("____Enter range to see how many numbers are divisible by 7____");
        System.out.println("Enter starting range: ");
        long start = sc.nextLong();
        System.out.println("Enter ending range: ");
        long end = sc.nextLong();

        if (start > end) {
            long temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Numbers divisible by 7 between " + start + " and " + end + " are:");
        for (long i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}