import java.util.Scanner;

/* Find the LCM (Least Common Multiple) of two given numbers. */

public class Q27_LCM_Of_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("____Enter a number to find LCM____");
        System.out.println("Enter first number: ");
        int num1 = Math.abs(sc.nextInt());
        System.out.println("Enter second number: ");
        int num2 = Math.abs(sc.nextInt());

        int max = 0;

        if (num1 == 0 && num2 == 0) {
            System.out.println("LCM is undefined for 0 and 0.");
            sc.close();
            return;
        }

        if (num1 > num2){
            max = num1;
        }else {
            max = num2;
        }

        int i = max;
        while (true){
            if (i % num1 == 0 && i % num2 == 0){
                System.out.print("LCM is: " + i);
                break;
            }
            i++;
        }
        sc.close();
    }
}
