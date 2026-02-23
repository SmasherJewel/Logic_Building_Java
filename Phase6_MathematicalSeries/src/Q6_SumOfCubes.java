import java.util.Scanner;

/* Calculate and print the value of the series
    1³ + 2³ + 3³ + … + n³.  */

public class Q6_SumOfCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (long) i * i * i;
        }

        System.out.println("Sum of cubes up to " + n + " is: " + sum);

        sc.close();
    }
}