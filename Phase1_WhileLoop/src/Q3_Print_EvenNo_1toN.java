import java.util.Scanner;

/* Print all even numbers between 1 and n */

public class Q3_Print_EvenNo_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0) {
            System.out.println("Enter a number greater than zero");
            return;
        }

        int i = 2;
        System.out.println("Printing Even Numbers: ");
        while (i <= num) {
            System.out.print(i + " ");
            i += 2;
        }
        sc.close();
    }
}
