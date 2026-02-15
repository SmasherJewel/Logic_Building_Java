import java.util.Scanner;

/* Print the multiplication table of a given number. */

public class Q2_Printing_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print multiplication table: ");
        long num = Math.abs(sc.nextLong());
        System.out.println("Enter a range you want to Print: ");
        long range = Math.abs(sc.nextLong());

        if (range <= 0){
            System.out.println("Range must be greater than 0.");
            sc.close();
            return;
        }

        int i = 1;
        System.out.println("Multiplication table of " + num + " is: ");
        do {
            System.out.println(num + " * " + i + " : " + (i * num));
            i++;
        }while (i <= range);
        sc.close();
    }
}
