import java.util.Scanner;

/* Count and print the total number of digits in a given number. */

public class Q11_Count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count digits: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0){
            System.out.println("Total number of digits: 1");
            sc.close();
            return;
        }

        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        sc.close();
        System.out.println("Total number of digits: " + count);
    }
}