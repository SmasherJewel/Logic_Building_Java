import java.util.Scanner;

/* Keep taking numbers from the user until a negative number is entered,
    then count how many positive numbers were entered. */

public class Q13_Count_PositiveNo_Until_NegativeNoEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        long count = 0;

        do {
            System.out.println("Enter a number: ");
            num = sc.nextLong();
            if (num > 0){
                count++;
            }
        } while (num >= 0);
        System.out.println("Total positive numbers entered: " + count);
        sc.close();
    }
}
