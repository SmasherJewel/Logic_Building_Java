import java.util.Scanner;

/* Check whether the given number is an Armstrong number. */

public class Q15_ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is Armstrong or not: ");
        int num = Math.abs(sc.nextInt());
        if (num == 0){
            System.out.println("0 is an armstrong number");
            return;
        }

        int storeNum = num;

        int count = 0;
        while (storeNum > 0){
            count++;
            storeNum /= 10;
        }

        storeNum = num;
        int sum = 0;
        while (storeNum > 0){
            int digit = storeNum % 10;
            int power = 1;
            int i = 1;
            while (i <= count){
                power *= digit;
                i++;
            }
            sum += power;
            storeNum /= 10;
        }
        sc.close();
        if (sum == num){
            System.out.print(num + " is an Armstrong number");
        }else {
            System.out.print(num + " is not an Armstrong number");
        }
    }
}
