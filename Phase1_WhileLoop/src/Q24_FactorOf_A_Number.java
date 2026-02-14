import java.util.Scanner;

/* Print all factors of the given number. */

public class Q24_FactorOf_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factor of that number: ");
        int num = Math.abs(sc.nextInt());

        int i = 1;
        System.out.println("Factor of " + num + " are: ");
        while (i <= num){
            if (num % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        sc.close();
    }
}
