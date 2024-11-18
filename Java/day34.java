/* Write a Program to Remove brackets from an algebraic expression */
import java.util.Scanner;

public class rembraces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the algebraic expression: ");
        String exp = scanner.nextLine();
        String result = exp.replaceAll("[(){}\\[\\]]", "");
        System.out.println("Expression without brackets: " + result);
    }
}
