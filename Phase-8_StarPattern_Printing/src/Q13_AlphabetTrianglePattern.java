import java.util.Scanner;

/*
Question:
Print the following alphabet triangle pattern using nested loops.

Each row should print sequential uppercase letters starting from 'A'.
The number of letters in each row should match the row number.

Example (for n = 5):

Output:
A
B C
D E F
G H I J
K L M N O

*/

public class Q13_AlphabetTrianglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        char ch = 'A';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }

        sc.close();
    }
}