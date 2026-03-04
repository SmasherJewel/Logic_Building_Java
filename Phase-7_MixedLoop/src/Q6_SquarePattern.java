import java.util.Scanner;

/* Print a pattern where the i-th row prints the value i × i. */

public class Q6_SquarePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }

        sc.close();
    }
}