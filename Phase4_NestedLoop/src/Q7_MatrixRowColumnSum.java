import java.util.Scanner;

/* Print a matrix, then calculate and display
    the sum of each row and the sum of each column. */

public class Q7_MatrixRowColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid input! Rows and columns must be positive.");
            sc.close();
            return;
        }

        if (rows > 50 || cols > 50) {
            System.out.println("Matrix size too large! Please enter below 50.");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Row sums
        System.out.println("\nSum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }

        // Column sums
        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }

        sc.close();
    }
}
