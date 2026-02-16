import java.util.Scanner;

/* Print all prime numbers up to n using nested loop checking. */

public class Q4_PrintPrimes_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range you want to print Prime numbers: ");
        long range = sc.nextLong();

        if (range < 1){
            System.out.println("There is no Prime numbers in that range");
            sc.close();
            return;
        }

        if (range > 1000){

        }
    }
}
