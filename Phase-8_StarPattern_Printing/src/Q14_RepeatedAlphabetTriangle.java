import java.util.Scanner;

/*
Question:
Print the following alphabet pattern using nested loops.

Each row should print the same alphabet repeatedly.
The alphabet should increase sequentially from 'A'.
The number of letters in each row should match the row number.

Example (for n = 5):

Output:
A
B B
C C C
D D D D
E E E E E

*/


public class Q14_RepeatedAlphabetTriangle {
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

            char ch = (char)('A' + i - 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}