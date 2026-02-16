import java.util.Scanner;

/* Print all factors of the given number */

public class Q12_FactorsOf_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factors of that: ");
        long num = sc.nextLong();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        System.out.println("Factors of that number is: ");
        for (long i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
