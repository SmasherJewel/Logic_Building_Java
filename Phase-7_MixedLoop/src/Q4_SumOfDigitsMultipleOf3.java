import java.util.Scanner;

/* Print all numbers from 1 to 100 whose sum of digits is a multiple of 3. */

public class Q4_SumOfDigitsMultipleOf3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        // Swap if start > end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        System.out.println("Numbers whose sum of digits is multiple of 3:");

        for (int i = start; i <= end; i++) {

            int num = Math.abs(i);
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            // Special case: if number is 0
            if (i == 0 || sum % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}