import java.util.Scanner;

/* Print all odd numbers between 1 and 100. */

public class Q4_Print_OddNo_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0) {
            System.out.println("Enter a number greater than zero");
            return;
        }

        int i = 1;
        System.out.println("Printing Odd Numbers: ");
        while (i <= num) {
            System.out.print(i + " ");
            i += 2;
        }
        sc.close();
    }
}
