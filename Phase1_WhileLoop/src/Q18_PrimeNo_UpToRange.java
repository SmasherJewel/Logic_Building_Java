import java.util.Scanner;

/* Print all prime numbers between 1 and n. */

public class Q18_PrimeNo_UpToRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range to Prime numbers: ");
        int num = sc.nextInt();

        if (num < 2){
            System.out.println("No Prime numbers in this range");
            sc.close();
            return;
        }

        int i = 2;
        System.out.println("Prime numbers up to " + num + ":");
        while (i <= num){
            boolean isPrime = true;
            int j = 2;
            while (j * j <= i){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime){
                System.out.print(i + " ");
            }
            i++;
        }
        sc.close();
    }
}
