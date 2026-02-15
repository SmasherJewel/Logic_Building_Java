import java.util.Scanner;

/* Print all odd numbers between 1 and 100. */

public class Q4_Printing_OddNo_UpToRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ending range you want to print: ");
        long num = sc.nextLong();

        if (num < 0){
            System.out.println("Please enter a Positive range");
            sc.close();
            return;
        }

        if (num == 0){
            System.out.println("in that range we don't have any Odd no");
            sc.close();
            return;
        }

        System.out.println("Odd numbers Up to " + num + " range: ");
        for (long i = 1; i <= num; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
