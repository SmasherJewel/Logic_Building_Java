import java.util.Scanner;

/* Check whether the given number is a prime number. */

public class Q17_Check_PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is Prime or Not: ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println(num + " is not a prime number.");
            sc.close();
            return;
        }

        int i = 2;
        boolean isPrime = true;
        while (i * i <= num) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        sc.close();
        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }
}
