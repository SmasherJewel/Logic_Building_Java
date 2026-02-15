import java.util.Scanner;

/* Keep taking numbers from the user until 0 is entered,
    then print the largest number among all inputs. */

public class Q4_LargestNo_Until_ZeroEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        Long largest = null;

        do {
            System.out.println("Enter a number: ");
            num = sc.nextLong();
            if (num != 0){
                if (largest == null || num > largest){
                    largest = num;
                }
            }
        }while (num != 0);
        sc.close();

        if (largest == null){
            System.out.println("No numbers were entered.");
        }else {
            System.out.println("Largest number among them is: " + largest);
        }
    }
}
