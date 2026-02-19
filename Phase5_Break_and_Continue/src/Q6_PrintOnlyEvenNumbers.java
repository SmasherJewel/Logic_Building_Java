import java.util.Scanner;

/* Skip all odd numbers and print only the even numbers. */

public class Q6_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        if (range <= 0) {
            System.out.println("Invalid input! Please enter a positive number.");
            sc.close();
            return;
        }

        System.out.println("\nEven numbers from 1 to " + range + ":");

        for (int i = 1; i <= range; i++) {

            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);
        }

        sc.close();
    }
}
