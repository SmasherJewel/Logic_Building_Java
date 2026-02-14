import java.util.Scanner;

/* Find and print the sum of all factors of the given number. */

public class Q25_SumOf_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find sum of factor of that number: ");
        int num = Math.abs(sc.nextInt());

        int i = 1;
        int sum = 0;
        System.out.println("Factor of " + num + " are: ");
        while (i <= num){
            if (num % i == 0){
                sum += i;
            }
            i++;
        }
        sc.close();
        System.out.println("Sum of that number factor is: " + sum);
    }
}
