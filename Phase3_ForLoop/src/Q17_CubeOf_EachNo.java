import java.util.Scanner;

/* Print the cube of each number from 1 to n. */

public class Q17_CubeOf_EachNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range you want to print cube of each number: ");
        long range = sc.nextLong();

        if (range <= 0){
            System.out.println("Please entera positive range");
            sc.close();
            return;
        }

        for (long i = 1; i <= range; i++) {
            long power = i * i * i;
            System.out.println(i + " * " + i + " * " + i + " is: " + power);
        }
        sc.close();
    }
}
