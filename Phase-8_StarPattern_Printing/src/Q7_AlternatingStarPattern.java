import java.util.Scanner;

/* Print Stars and Spaces Alternating (Stars and Blank Spaces) (b = blank space here) */

public class Q7_AlternatingStarPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("b");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j % 2 == 1)
                    System.out.print("*");
                else
                    System.out.print("b");
            }

            System.out.println();
        }

        sc.close();
    }
}