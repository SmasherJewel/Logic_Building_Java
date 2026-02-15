import java.util.Scanner;

/* Create a menu-driven program that allows
    the user to choose and perform different operations. */

public class Q12_MenuDriven_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Check Prime");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter 1st number: ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter 2nd number: ");
                    int num2 = sc.nextInt();
                    System.out.print("Addition of two numbers are: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Enter 1st number: ");
                    int num3 = sc.nextInt();
                    System.out.println("Enter 2nd number: ");
                    int num4 = sc.nextInt();
                    System.out.print("Substraction of two numbers are: " + (num3 - num4));
                    break;
                case 3:
                    System.out.println("Enter 1st number: ");
                    int num5 = sc.nextInt();
                    System.out.println("Enter 2nd number: ");
                    int num6 = sc.nextInt();
                    System.out.print("Multiplication of two numbers are: " + (num5 * num6));
                    break;
                case 4:
                    System.out.print("Enter a number to check whether it is Prime or Not: ");
                    int num = sc.nextInt();

                    if (num < 2) {
                        System.out.println(num + " is not a prime number.");
                        break;
                    }

                    int i = 2;
                    boolean isPrime = true;
                    while (i * i <= num) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                        i++;
                    }
                    if (isPrime) {
                        System.out.println(num + " is a Prime number");
                    } else {
                        System.out.println(num + " is not a Prime number");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}
