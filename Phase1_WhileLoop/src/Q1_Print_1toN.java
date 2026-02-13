import java.util.Scanner;
/* Print all numbers from 1 to n using a loop. */

public class Q1_Print_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // Handling Negative Value
        int num = Math.abs(sc.nextInt());

        if (num == 0){
            System.out.println("Enter a number greater than zero");
            return;
        }

        int i = 1;
        System.out.println("Printing No: ");
        while (i <= num){
            System.out.print(i + " ");
            i++;
        }
        sc.close();
    }
}
