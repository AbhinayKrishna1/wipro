import java.util.Scanner;
public class StringAssignmentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringUtility su = new StringUtility();
        char continueChoice;

        do {
            System.out.println("\n********** STRING MENU **********");
            System.out.println("1. Count Vowels");
            System.out.println("2. Count Consonants");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Reverse String");
            System.out.println("5. Convert to Uppercase");
            System.out.println("6. Convert to Lowercase");
            System.out.println("7. Replace Word");
            System.out.println("8. Exit");
            System.out.println("*********************************");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str = sc.nextLine();
                    System.out.println("Vowels: " + su.countVowels(str));
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    System.out.println("Consonants: " + su.countConsonants(str));
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    System.out.println("Palindrome? " + su.isPalindrome(str));
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    System.out.println("Reversed: " + su.reverseString(str));
                    break;
                case 5:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    System.out.println("Uppercase: " + su.toUpperCase(str));
                    break;
                case 6:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    System.out.println("Lowercase: " + su.toLowerCase(str));
                    break;
                case 7:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    System.out.print("Enter word to replace: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Enter new word: ");
                    String newWord = sc.nextLine();
                    System.out.println("Updated: " + su.replaceWord(str, oldWord, newWord));
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Back to Menu? (Y/N): ");
            continueChoice = sc.next().charAt(0);
        } while (Character.toUpperCase(continueChoice) == 'Y');
    }
}