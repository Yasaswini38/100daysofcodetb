import java.util.Scanner;

public class CircleArea {
    public static double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = calculateAreaOfCircle(radius);
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
    }
}
