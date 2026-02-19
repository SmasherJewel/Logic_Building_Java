import java.util.Scanner;

/* Search for a specific number in a list of inputs, and
    terminate the loop immediately when the number is found.*/

public class Q4_LinearSearchBreak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Enter positive number of elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Number found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the list.");
        }

        sc.close();
    }
}
