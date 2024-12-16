import java.util.Scanner;

public class CapitalizeFirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String output = capitalizeFirstLast(input);
        System.out.println("Modified String: " + output);
    }

    public static String capitalizeFirstLast(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() == 1) {
                result.append(word.toUpperCase());
            } else {
                String newWord = word.substring(0, 1).toUpperCase() +
                                 word.substring(1, word.length() - 1) +
                                 word.substring(word.length() - 1).toUpperCase();
                result.append(newWord);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}
