import java.util.Scanner;

public class Q2_CountDivisible {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int count = 0;

        for (int i = start; i <= end; i++) {

            if (i % 7 == 0 && i % 5 != 0) {
                count++;
            }
        }

        System.out.println("Total numbers: " + count);

        sc.close();
    }
}