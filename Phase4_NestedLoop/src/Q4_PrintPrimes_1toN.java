import java.util.Scanner;

/* Print all prime numbers up to n using nested loop checking. */

public class Q4_PrintPrimes_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range you want to print Prime numbers: ");
        long range = sc.nextLong();

        if (range <= 1){
            System.out.println("There is no Prime numbers in that range");
            sc.close();
            return;
        }

        if (range > 10000){
            System.out.println("Range too large! Please enter number below 10000.");
            sc.close();
            return;
        }

        System.out.println("\nPrime numbers from 1 to " + range + " are:\n");
        for (long i = 2; i <= range; i++) {
            long count = 0;
            for (long j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
