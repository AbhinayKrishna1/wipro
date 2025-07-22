import java.util.Scanner;

public class MathMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("********** MENU **********");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number: ");
                    int num = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + num * i);
                    }
                    break;
                case 2:
                    System.out.print("Enter the number: ");
                    int factNum = sc.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial: " + factorial);
                    break;
                case 3:
                    System.out.print("Enter the number: ");
                    int primeNum = sc.nextInt();
                    boolean isPrime = primeNum > 1;
                    int i = 2;
                    while (i <= primeNum / 2) {
                        if (primeNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                        i++;
                    }
                    System.out.println(primeNum + (isPrime ? " is a Prime Number." : " is not a Prime Number."));
                    break;
                case 4:
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt();
                    int a = 0, b = 1;
                    System.out.print("Fibonacci Series: ");
                    for (int j = 0; j < terms; j++) {
                        System.out.print(a + " ");
                        int next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.print("Back to Menu? (Y/N): ");
            continueChoice = sc.next().charAt(0);
        } while (Character.toUpperCase(continueChoice) == 'Y');
    }
}