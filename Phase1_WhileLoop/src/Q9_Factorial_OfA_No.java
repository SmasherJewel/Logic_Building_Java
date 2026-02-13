import java.util.Scanner;

/* Calculate and print the factorial of a given number. */

public class Q9_Factorial_OfA_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        long num = sc.nextLong();
        long originalNum = num;
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            sc.close();
            return;
        }

        long fact = 1;

        if (num == 0 || num == 1) {
            System.out.println("Factorial of " + originalNum + " is: " + fact);
            sc.close();
            return;
        }

        while (num > 1){
            fact *= num;
            num--;
        }
        sc.close();
        System.out.println("Factorial of " + originalNum + " is: " + fact);
    }
}
