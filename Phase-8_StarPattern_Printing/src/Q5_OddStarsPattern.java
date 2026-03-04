import java.util.Scanner;

/* Print Stars in Odd Numbers (1, 3, 5, 7, 9) */

public class Q5_OddStarsPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}