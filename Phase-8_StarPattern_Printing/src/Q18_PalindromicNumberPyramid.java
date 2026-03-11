import java.util.Scanner;

/*
Question:
Print the following palindromic number pyramid pattern using nested loops.

Each row should first print numbers in increasing order starting from 1
up to the row number, and then print numbers in decreasing order back to 1.
The pattern should be centered.

Example (for n = 5):

Output:
        1
       121
      12321
     1234321
    123454321

*/

public class Q18_PalindromicNumberPyramid {
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

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}