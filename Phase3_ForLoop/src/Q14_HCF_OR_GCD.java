import java.util.Scanner;

/* Find the HCF (Highest Common Factor) or GCD of the given numbers. */

public class Q14_HCF_OR_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("____Find HCF of two number____");
        System.out.println("Enter 1st number: ");
        long num1 = sc.nextLong();
        System.out.println("Enter 2nd number: ");
        long num2 = sc.nextLong();

        if (num1 < 0 || num2 < 0){
            System.out.println("Please enter a positive number");
            sc.close();
            return;
        }

        if (num1 == 0 && num2 == 0) {
            System.out.println("HCF is undefined for 0 and 0.");
            sc.close();
            return;
        }

        if (num1 == 0) {
            System.out.println("HCF is: " + num2);
            sc.close();
            return;
        }

        if (num2 == 0) {
            System.out.println("HCF is: " + num1);
            sc.close();
            return;
        }

        long minValue = Math.min(num1,num2);

        for (long i = minValue; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0){
                System.out.println("HCF is: " + i);
                break;
            }
        }
        sc.close();
    }
}
