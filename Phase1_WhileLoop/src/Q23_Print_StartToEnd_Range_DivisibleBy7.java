import java.util.Scanner;

/* Print all numbers between a and b that are divisible by 7. */

public class Q23_Print_StartToEnd_Range_DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Range: ");
        int startingRange = Math.abs(sc.nextInt());
        System.out.println();
        System.out.print("Enter Ending Range: ");
        int endingRange = Math.abs(sc.nextInt());
        System.out.println();

        // If start > end --> swape the values
        if (startingRange > endingRange){
            int temp = startingRange;
            startingRange = endingRange;
            endingRange = temp;
        }

        System.out.println("Numbers that are divisible by 7 is: ");
        while (startingRange <= endingRange){
            if (startingRange % 7 == 0){
                System.out.print(startingRange + " ");
            }
            startingRange++;
        }
        sc.close();
    }
}