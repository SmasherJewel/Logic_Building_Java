import java.util.Scanner;

/* Calculate and print the value of the series
    1 + 1/2 + 1/3 + … + 1/n.    */

public class Q7_HarmonicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Sum of harmonic series up to " + n + " terms is: " + sum);

        sc.close();
    }
}