import java.util.Scanner;

/* Print all possible pairs (i, j) where both i and j range from 1 to n. */

public class Q2_AllPossiblePairs_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        System.out.println("\nAll possible pairs from 1 to " + n + " are:\n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("(" + i + ", " + j + " )");
            }
            System.out.println();
        }
        sc.close();
    }
}
