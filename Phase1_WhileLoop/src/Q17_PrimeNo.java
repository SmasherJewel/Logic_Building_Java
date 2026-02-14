import java.util.Scanner;

/* Print all prime numbers between 1 and n. */

public class Q17_PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range to Prime numbers: ");
        int num = Math.abs(sc.nextInt());

        if (num < 2){
            System.out.println("No Prime numbers in this range");
            sc.close();
            return;
        }

        int i = 2;
        System.out.println("Prime numbers up to " + num + ":");
        while (i <= num){
            int divisorCount = 0;
            int j = 1;
            while (j <= i){
                if (i % j == 0){
                    divisorCount++;
                }
                j++;
            }
            if (divisorCount == 2){
                System.out.print(i + " ");
            }
            i++;
        }
        sc.close();
    }
}
