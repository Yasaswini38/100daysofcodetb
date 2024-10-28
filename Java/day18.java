import java.util.Scanner;

public class FractionAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator for the first fraction: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the denominator for the first fraction: ");
        int den1 = scanner.nextInt();

        System.out.print("Enter the numerator for the second fraction: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the denominator for the second fraction: ");
        int den2 = scanner.nextInt();

        int resultNum = num1 * den2 + num2 * den1; 
        int resultDen = den1 * den2; 
        int gcd = findGCD(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;

        System.out.println("The sum of the fractions is: " + resultNum + "/" + resultDen);

        scanner.close();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
