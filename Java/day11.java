import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("0 1");
        } else {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            while (b <= n) {
                int next = a + b;
                if (next > n) {
                    break;
                }
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }
    }
}
