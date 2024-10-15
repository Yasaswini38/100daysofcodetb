import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter-x coord: ");
        double x = sc.nextDouble();
        System.out.print("enter-y coord: ");
        double y = sc.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ") is in Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ") in Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ") in Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ") in Q4");
        } else if (x == 0 && y != 0) {
            System.out.println("(" + x + ", " + y + ") on the y-axis");
        } else if (x != 0 && y == 0) {
            System.out.println("(" + x + ", " + y + ") on the x-axis");
        } else {
            System.out.println("(" + x + ", " + y + ") at origin");
        }
        sc.close();
    }
}
