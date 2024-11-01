import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculateHandshakes(int n) {
        return n * (n - 1) / 2; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people in the room: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("The number of people cannot be negative.");
        } else {
            int totalHandshakes = calculateHandshakes(n);
            System.out.println("The maximum number of handshakes possible among " + n + " people is: " + totalHandshakes);
        }
    }
}
