import java.util.Scanner;

/*
Question:
Print the following centered alphabet pyramid pattern using nested loops.

Letters should continue sequentially starting from 'A'.
Each row contains increasing numbers of letters following the pattern:
1, 3, 5, 7, 9 ...

Example (for n = 5):

Output:
         A
       B C D
     E F G H I
    J K L M N O P
   Q R S T U V W X Y

*/


public class Q16_AlphabetPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input!");
            sc.close();
            return;
        }

        char ch = 'A';

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }

        sc.close();
    }
}