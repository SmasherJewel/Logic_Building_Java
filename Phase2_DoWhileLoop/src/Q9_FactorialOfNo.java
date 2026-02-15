import java.util.Scanner;

/* Calculate and print the factorial of the given number. */

public class Q9_FactorialOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find  factorial of it: ");
        long num = sc.nextLong();
        long storeNum = num;

        if (num < 0) {
            System.out.println("Negative numbers cannot have factorial");
            sc.close();
            return;
        }

        if (num == 0 || num == 1) {
            System.out.println("Factorial of " + storeNum + " is: 1");
            sc.close();
            return;
        }

        if (num > 20) {
            System.out.println("Number too large, factorial will overflow.");
            sc.close();
            return;
        }


        long fact = 1;

        do {
            fact *= num;
            num--;
        } while (num > 1);
        sc.close();
        System.out.println("Factorial of " + storeNum + " is: " + fact);
    }
}
