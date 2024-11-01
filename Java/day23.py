import java.util.Scanner;

public class ReplaceZeros {

    public static int replaceZeros(int number) {
        String resultString = Integer.toString(number).replace('0', '1');
        return Integer.parseInt(resultString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Result after replacing all 0's with 1's: " + replaceZeros(number));
    }
}
