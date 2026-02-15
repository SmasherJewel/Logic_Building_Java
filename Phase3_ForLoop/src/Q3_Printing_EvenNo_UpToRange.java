import java.util.Scanner;

/* Print all even numbers between 1 and n. */

public class Q3_Printing_EvenNo_UpToRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ending range you want to print: ");
        long num = sc.nextLong();

        if (num < 0){
            System.out.println("Please enter a Positive range");
            sc.close();
            return;
        }

        if (num == 0 || num == 1){
            System.out.println("No even numbers in this range");
            sc.close();
            return;
        }

        System.out.println("Even numbers Up to " + num + " range: ");
        for (long i = 2; i <= num; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
