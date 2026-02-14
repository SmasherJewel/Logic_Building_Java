import java.util.Scanner;

/* Find and print the sum of the Fibonacci series up to n terms. */

public class Q20_SumOf_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms to print Fibonacci: ");
        int num = Math.abs(sc.nextInt());
        int a = 0, b = 1;
        int i = 1,sum = 0;

        while (i <= num){
            sum += a;
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        sc.close();
        System.out.println("Sum of Fibonacci Series: " + sum);
    }
}
