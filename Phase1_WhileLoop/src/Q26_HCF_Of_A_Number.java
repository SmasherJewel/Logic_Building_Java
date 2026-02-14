import java.util.Scanner;

/* Find the HCF (Highest Common Factor) or GCD of two given numbers. */

public class Q26_HCF_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("____Enter a number to find HCF____");
        System.out.println("Enter first number: ");
        int num1 = Math.abs(sc.nextInt());
        System.out.println("Enter second number: ");
        int num2 = Math.abs(sc.nextInt());

        int min = 0;

        if (num1 == 0 && num2 == 0) {
            System.out.println("HCF is undefined for 0 and 0.");
            sc.close();
            return;
        }

        if (num1 > num2){
            min = num2;
        }else {
            min = num1;
        }

        int i = min;
        while (i > 0){
            if (num1 % i == 0 && num2 % i == 0){
                System.out.print("HCF is: " + i);
                break;
            }
            i--;
        }
        sc.close();
    }
}
