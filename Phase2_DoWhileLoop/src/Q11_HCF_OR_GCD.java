import java.util.Scanner;

/* Find the HCF (Highest Common Factor) of the given numbers. */

public class Q11_HCF_OR_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("______Finding GCD or HCF of two numbers______");
        System.out.println("Enter 1st number: ");
        long num1 = Math.abs(sc.nextLong());
        System.out.println("Enter 2nd number: ");
        long num2 = Math.abs(sc.nextLong());

        if (num1 == 0 && num2 == 0) {
            System.out.println("HCF is undefined for 0 and 0.");
            sc.close();
            return;
        } else if (num1 == 0) {
            System.out.println("HCF or GCD is: " + num2);
            sc.close();
            return;
        } else if (num2 == 0) {
            System.out.println("HCF or GCD is: " + num1);
            sc.close();
            return;
        }

        long min = 0;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        long i = min;

        do {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print("HCF or GCD is: " + i);
                break;
            }
            i--;
        } while (i > 0);
        sc.close();
    }
}
