import java.util.Scanner;

/* Check whether the given number is a prime number. */

public class Q8_Check_PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Prime or not: ");
        long num = sc.nextLong();

        if (num < 2) {
            System.out.println(num + " is not a prime number.");
            sc.close();
            return;
        }

        boolean isPrime = true;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        sc.close();
        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }
}
