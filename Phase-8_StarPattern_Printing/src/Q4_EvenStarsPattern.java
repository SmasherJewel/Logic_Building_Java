import java.util.Scanner;

/* Print Stars in Even Numbers (2, 4, 6, 8, 10) */

public class Q4_EvenStarsPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}