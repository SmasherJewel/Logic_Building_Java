import java.util.Scanner;

/* Keep taking numbers from the user and print them
    until a negative number appears, then stop the loop. */

public class Q5_StopAtNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (negative number to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Negative number entered. Loop stopped.");
                break;
            }

            System.out.println(num);
        }

        sc.close();
    }
}
