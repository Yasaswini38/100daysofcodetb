import java.util.Scanner;

public class SumNaturals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Only natural numbers are allowed.");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
        sc.close();
    }
}
