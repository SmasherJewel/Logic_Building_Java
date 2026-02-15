import java.util.Scanner;

/* Calculate and print the factorial of a given number. */

public class Q6_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print factorial: ");
        long num = sc.nextLong();

        if (num < 0){
            System.out.println("Please enter a positive number");
            sc.close();
            return;
        }

        if (num == 0 || num == 1) {
            System.out.println("Factorial of " + num + " is: 1");
            sc.close();
            return;
        }

        long fact = 1;
        for (long i = num; i > 1 ; i--) {
            fact *= i;
        }
        sc.close();
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
