import java.util.Scanner;

/* Print the first n terms of an arithmetic progression
    for the given first term and common difference. */

public class Q1_ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Number of terms must be positive.");
            sc.close();
            return;
        }

        System.out.println("\nArithmetic Progression:");

        int current = a;

        for (int i = 1; i <= n; i++) {
            System.out.print(current + " ");
            current += d;
        }

        sc.close();
    }
}
