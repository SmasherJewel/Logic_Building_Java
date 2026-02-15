import java.util.Scanner;

/* Print numbers from n down to 1 in reverse order. */

public class Q2_PrintNo_ReverseOrder_Nto1 {
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
        for (long i = num; i > 0; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
