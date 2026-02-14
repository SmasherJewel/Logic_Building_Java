import java.util.Scanner;

/* Print the Fibonacci series up to n terms */

public class Q19_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms to print Fibonacci: ");
        int num = Math.abs(sc.nextInt());

        int a = 0, b = 1;
        int i = 1;
        System.out.println("Fibonacci Series: ");
        while (i <= num){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        sc.close();
    }
}
