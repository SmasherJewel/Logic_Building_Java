import java.util.Scanner;

/* Print all Pythagorean triplets whose values are less than or equal to n. */

public class Q8_PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        if (n > 1000) {
            System.out.println("Range too large! Please enter number below 1000.");
            sc.close();
            return;
        }

        System.out.println("\nPythagorean triplets up to " + n + ":\n");

        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {

                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c * c == cSquared && c <= n) {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }
        sc.close();
    }
}
