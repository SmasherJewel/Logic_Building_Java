import java.util.Scanner;

/* Print numbers from n down to 1 in reverse order. */

public class Q2_Print_Nto1_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0){
            System.out.println("Enter a number greater than zero");
            return;
        }

        System.out.println("Printing No: ");
        while (num > 0){
            System.out.print(num + " ");
            num--;
        }
        sc.close();
    }
}
