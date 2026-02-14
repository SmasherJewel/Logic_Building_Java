import java.util.Scanner;

/* Print the square of each number from 1 to n. */

public class Q21_SquareOf_N_Number_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range to print square of each number: ");
        int range = sc.nextInt();

        if (range < 1){
            System.out.println("Please enter a positive number");
            sc.close();
            return;
        }

        int i = 1;
        System.out.println("Square of Each number: ");
        while (i <= range){
            System.out.println(i + " * " + i + " : " + (i * i));
            i++;
        }
        sc.close();
    }
}
