import java.util.Scanner;

/*
Question:
Print the following star pattern using nested loops.

The pattern should first increase the number of stars from 1 to n
and then decrease back to 1.

Example (for n = 4):

Output:
*
**
***
****
*****
****
***
**
*

*/


public class Q19_DiamondStarPattern {
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
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}