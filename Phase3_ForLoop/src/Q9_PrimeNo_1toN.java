import java.util.Scanner;

/* Print all prime numbers between 1 and n. */

public class Q9_PrimeNo_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print all prime numbers up to: ");
        long num = sc.nextLong();

        if (num < 2) {
            System.out.println(num + " is not a prime number.");
            sc.close();
            return;
        }

        System.out.println("Prime numbers Up to " + num + " range is: ");
        for (long i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (long j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
