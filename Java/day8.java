import java.util.Scanner;

public class Rootzzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d> 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real roots: " + r1 + " and " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("One real root: " + r);
        } else {
            double r = -b / (2 * a);
            double img = Math.sqrt(-d) / (2 * a);
            System.out.println("Two complex roots: " + r+ " + " + img + "i and " + r + " - " + img + "i");
        }

        sc.close();
    }
}
