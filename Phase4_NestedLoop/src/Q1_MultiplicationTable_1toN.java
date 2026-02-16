import java.util.Scanner;

/* Print the multiplication tables for all numbers from 1 to 10. */

public class Q1_MultiplicationTable_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range you want to print from 1 to n: ");
        long range = sc.nextLong();

        if (range <= 0) {
            System.out.println("Invalid input! Enter positive number.");
            sc.close();
            return;
        }

        if (range > 1000) {
            System.out.println("Range too large! Please enter number below 1000.");
            sc.close();
            return;
        }

        for (long i = 1; i <= range; i++) {
            System.out.println("Multiplication Table of: " + i);
            for (long j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " : " + (i * j));
            }
            System.out.println();
        }
        sc.close();
    }
}
