import java.util.Scanner;

/* Keep taking numbers from the user until 0 is entered,
    then print the sum of all entered numbers. */

public class Q3_TakingNo_Until_ZeroEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long num;

        do {
            System.out.println("Enter a number: ");
            num = sc.nextLong();
            if (num != 0){
                sum += num;
            }
        }while (num != 0);
        sc.close();
        System.out.println("Sum of entered numbers is: " + sum);
    }
}
