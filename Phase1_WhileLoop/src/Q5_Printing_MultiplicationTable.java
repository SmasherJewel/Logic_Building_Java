import java.util.Scanner;

/* Print the multiplication table of a given number from n × 1 to n × 10. */

public class Q5_Printing_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a to Print Multiplication of a Table: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0){
            System.out.println("Enter a number than Zero");
            return;
        }

        System.out.println("Please Enter a Range you want to Print: ");
        int range = Math.abs(sc.nextInt());

        if (range == 0){
            System.out.println("Enter a range greater than Zero");
            return;
        }

        int i = 1;
        System.out.println("Printing Multiplication Table of " + num);
        while (i <= range){
            System.out.println(num + " * " + i + " : " + (i * num));
            i++;
        }
        sc.close();
    }
}
