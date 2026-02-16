import java.util.Scanner;

/* Find the LCM (Least Common Multiple) of the given numbers. */

public class Q15_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("____Find LCM of two number____");
        System.out.println("Enter 1st number: ");
        long num1 = sc.nextLong();
        System.out.println("Enter 2nd number: ");
        long num2 = sc.nextLong();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Please enter positive numbers.");
            sc.close();
            return;
        }

        long maxValue = Math.max(num1,num2);
        // Always true there is no condition
        for (long i = maxValue; ; i++) {
            if (i % num1 == 0 && i % num2 == 0){
                System.out.println("LCM is: " + i);
                break;
            }
        }
        sc.close();
    }
}
