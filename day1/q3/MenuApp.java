import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations mo = new MathOperations();
        char continueChoice;

        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Print Table");
            System.out.println("2. Factorial");
            System.out.println("3. Check Prime");
            System.out.println("4. Fibonacci");
            System.out.println("5. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    mo.printTable(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    mo.calculateFactorial(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    mo.checkPrime(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter number of terms: ");
                    mo.printFibonacci(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please select an option from 1 to 5.");
                    break;
            }

            System.out.print("Back to Menu? (Y/N): ");
            continueChoice = sc.next().charAt(0);
        } while (Character.toUpperCase(continueChoice) == 'Y');
    }
}