import java.util.Scanner;

/*
    Print a binary triangle pattern where each row contains alternating
    0s and 1s. Odd rows start with 1 and even rows start with 0.

    Example (n = 5):

    1
    0 1
    0 1 0
    1 0 1 0
    1 0 1 0 1

*/

public class Q12_BinaryTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {

            int num;

            if (i % 2 == 1)
                num = 1;
            else
                num = 0;

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");

                num = 1 - num;
            }

            System.out.println();
        }

        sc.close();
    }
}