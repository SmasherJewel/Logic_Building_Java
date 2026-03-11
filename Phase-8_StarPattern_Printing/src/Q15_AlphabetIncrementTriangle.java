import java.util.Scanner;

/*
Question:
Print the following alphabet triangle pattern using nested loops.

Each row should start from the letter 'A' and continue sequentially
until the number of characters equals the row number.

Example (for n = 5):

Output:
A
A B
A B C
A B C D
A B C D E

*/

public class Q15_AlphabetIncrementTriangle {
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

            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }

        sc.close();
    }
}