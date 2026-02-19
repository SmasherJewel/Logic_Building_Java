import java.util.Scanner;

/* Print the first n terms of a geometric progression
    for the given first term and common ratio. */

public class Q2_GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        long a = sc.nextLong();

        System.out.print("Enter common ratio (r): ");
        long r = sc.nextLong();

        if (r == 0) {
            System.out.println("\nSince common ratio is 0, all terms after first will be 0.\n");
        }

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Number of terms must be positive.");
            sc.close();
            return;
        }

        System.out.println("\nGeometric Progression:");

        long current = a;

        for (int i = 1; i <= n; i++) {
            System.out.print(current + " ");
            current *= r;
        }

        sc.close();
    }
}
