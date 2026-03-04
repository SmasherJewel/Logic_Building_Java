import java.util.Scanner;

/* Print all Armstrong numbers between 1 and N. */

public class Q8_ArmstrongNumbers {

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

        System.out.println("Armstrong numbers in the given range:");

        for (int i = start; i <= end; i++) {

            if (i < 0) continue;

            int num = i;
            int temp = i;
            int digits = 0;
            int sum = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}