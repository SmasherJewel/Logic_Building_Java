import java.util.Scanner;

/* Print all Perfect numbers between 1 and 1000. */

public class Q9_PerfectNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        // swap if start > end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Perfect numbers in the given range:");

        for (int i = start; i <= end; i++) {

            if (i <= 1) continue;

            int sum = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}