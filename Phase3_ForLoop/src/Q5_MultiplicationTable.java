import java.util.Scanner;

/* Print the multiplication table of a given number. */

public class Q5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to print the table: ");
        long num = sc.nextLong();
        System.out.println("Enter an ending range you want to print: ");
        long range = sc.nextLong();

        if (range <= 0){
            System.out.println("Please enter a Positive range");
            sc.close();
            return;
        }

        for (long i = 1; i <= range; i++) {
            System.out.println(num + " * " + i + " : " + (i * num));
        }
        sc.close();
    }
}
