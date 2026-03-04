import java.util.Scanner;

/* Print Repeated Numbers per Row (Same Number Repeated) */

public class Q9_RepeatedNumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        sc.close();
    }
}