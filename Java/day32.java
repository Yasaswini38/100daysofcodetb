public class RemoveVowels {
    public static String removeVowels(String input) {
        return input.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        String result = removeVowels(input);
        System.out.println("String without vowels: " + result);
    }
}
