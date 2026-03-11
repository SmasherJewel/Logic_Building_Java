import java.util.Scanner;

/*
Question:
Print the following centered diamond star pattern using nested loops.

The pattern should first increase the number of stars in odd counts
(1, 3, 5, 7, ...) up to n rows, and then decrease symmetrically.

Example (for n = 5):

Output:
        *
       ***
      *****
     *******
    *********
     *******
      *****
       ***
        *

*/

public class Q20_DiamondStarPatternCentered {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}