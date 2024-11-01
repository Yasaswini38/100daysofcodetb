import java.util.Scanner;

public class SumOfTwoPrimes {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void findTwoPrimes(int number) {
        for (int i = 2; i < number; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " can be expressed as the sum of " + i + " and " + (number - i) + ", which are both prime.");
                return;
            }
        }
        System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        findTwoPrimes(number);
    }
}
