import java.util.Scanner;

/*
Question:
Print the following hollow square star pattern using nested loops.

The border of the square should contain stars (*) while
the inside should contain spaces.

Example (for n = 5):

Output:
*****
*   *
*   *
*   *
*****

*/

public class Q22_HollowSquarePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

        sc.close();
    }
}