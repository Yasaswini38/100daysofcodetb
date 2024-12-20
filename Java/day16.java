import java.util.Scanner;
public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false; 
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }      
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's a perfect number: ");
        int number = scanner.nextInt();
        
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
        scanner.close();
    }
}
