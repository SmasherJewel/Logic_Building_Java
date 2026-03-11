import java.util.Scanner;

/*
Question:
Print the following centered palindromic number pyramid pattern using nested loops.

Each row should start from the maximum number (n) and decrease
until reaching the center value, then increase again to form a palindrome.

Example (for n = 5):

Output:
        5
       545
      54345
     5432345
    543212345

*/


public class Q21_PalindromicNumberPyramid {
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

            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
            }

            for (int j = n - i + 2; j <= n; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}