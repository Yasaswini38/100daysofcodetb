import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter-even/odd number: ");
        double n = sc.nextDouble();
        String result = (n % 2== 0) ? "Even" : "Odd" ;
        System.out.println(n + " is " + result);
        sc.close();
    }}
