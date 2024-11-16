import java.util.Scanner;

public class PalindromeWithoutBuiltIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isPalindrome = true;
        int n = inputString.length();
        for (int i = 0; i < n / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + inputString + "\" is a palindrome!");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
