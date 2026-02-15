import java.util.Scanner;

/* Calculate and print the factorial of every number from 1 to n. */

public class Q7_FactorialOf_1toN_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a range you want to print factorial: ");
        long num = sc.nextLong();

        if (num < 1){
            System.out.println("Please enter a positive number");
            sc.close();
            return;
        }


        long fact = 1;
        System.out.println("Factorial Up to " + num + " range: ");
        for (long i = 1; i <= num; i++) {
            fact *= i;
            System.out.print(fact + " ");
        }
        sc.close();
    }
}
