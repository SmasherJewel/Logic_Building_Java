import java.util.Scanner;

/* Continuously add numbers in a loop and stop the loop
    when the sum becomes greater than 100 */

public class Q7_StopWhenSumExceeds100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter numbers (loop stops when sum exceeds 100):");

        while (true) {
            int num = sc.nextInt();
            sum += num;

            if (sum > 100) {
                System.out.println("Sum exceeded 100!");
                break;
            }

            System.out.println("Current sum: " + sum);
        }
        System.out.println("Final sum: " + sum);
        sc.close();
    }
}
