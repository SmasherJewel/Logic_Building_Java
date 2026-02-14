import java.util.Scanner;

/* Check whether the given number is a Perfect number. */

public class Q16_PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is Perfect number or not: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Perfect number must be greater than 1.");
            sc.close();
            return;
        }

        int i = 1, sum = 0;
        while (i <= num / 2) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        sc.close();
        if (num == sum) {
            System.out.print(num + " is a Perfect number");
        } else {
            System.out.print(num + " is not a Perfect number");
        }
    }
}
