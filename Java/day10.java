import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= scanner.nextInt();
        long fact = 1;

        if (num < 0) {
            System.out.println("negative number.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + num + " is " + fact);
  }}}
