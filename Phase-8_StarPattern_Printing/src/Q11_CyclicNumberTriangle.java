import java.util.Scanner;

/*
    Print a continuous number triangle where numbers increase sequentially
    from 1 to 9 and then wrap back to 0.

    Each row should contain i numbers (where i is the row number).
    After the digit 9, the sequence should continue again from 0.

    Example (n = 7):

    1
    2 3
    4 5 6
    7 8 9 0
    1 2 3 4 5
    6 7 8 9 0 1
    2 3 4 5 6 7 8
*/

public class Q11_CyclicNumberTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");

                num++;

                if (num == 10) {
                    num = 0;
                }
            }

            System.out.println();
        }

        sc.close();
    }
}