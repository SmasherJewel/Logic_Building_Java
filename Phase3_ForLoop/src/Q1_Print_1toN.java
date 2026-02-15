import java.util.Scanner;

/* Print all numbers from 1 to n. */

public class Q1_Print_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ending range you want to print: ");
        long num = sc.nextLong();

        if (num < 0){
            System.out.println("Please enter a Positive range");
            sc.close();
            return;
        }

        System.out.println("Printing Up to " + num + " range: ");
        for (long i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
