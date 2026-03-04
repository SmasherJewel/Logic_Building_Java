import java.util.Scanner;

/* Print all numbers from 1 to n whose binary representation
    contains an even number of 1s. */

public class Q5_EvenBinaryOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.println("Numbers whose binary has even number of 1s:");

        for (int i = 1; i <= n; i++) {

            int num = i;
            int count = 0;

            while (num > 0) {
                if (num % 2 == 1) {
                    count++;
                }
                num /= 2;
            }

            if (count % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}