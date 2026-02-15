import java.util.Scanner;

/* Check whether the given number is an Armstrong number. */

public class Q8_Armstrong_OR_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is armstrong or not: ");
        long num = sc.nextLong();

        if (num < 0) {
            System.out.println(num + " it is not an Armstrong number");
            sc.close();
            return;
        }

        long count = 0;
        long storeNum = num;

        do {
            count++;
            storeNum /= 10;
        } while (storeNum > 0);

        storeNum = num;
        long sum = 0;

        do {
            long digit = storeNum % 10;
            long power = 1;
            long i = 1;

            while (i <= count) {
                power *= digit;
                i++;
            }
            sum += power;

            storeNum /= 10;
        } while (storeNum > 0);
        sc.close();

        if (num == sum) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
