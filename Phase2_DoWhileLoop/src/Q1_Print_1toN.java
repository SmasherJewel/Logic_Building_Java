import java.util.Scanner;

/* Print all numbers from 1 to n. */

public class Q1_Print_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range you want to print: ");
        long num = sc.nextLong();

        if (num < 1){
            System.out.println("Please enter a number greater than 0");
            sc.close();
            return;
        }

        long i = 1;
        System.out.println("Printing Up to " + num + " range: ");
        do {
            System.out.print(i + " ");
            i++;
        }while (i <= num);
        sc.close();
    }
}
