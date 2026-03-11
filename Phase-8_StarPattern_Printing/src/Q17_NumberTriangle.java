import java.util.Scanner;

/*
Question:
Print the following number triangle pattern using nested loops.

Each row should start from the number 1 and increase sequentially
until the number equals the row number.

Example (for n = 5):

Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

public class Q17_NumberTriangle {
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
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}