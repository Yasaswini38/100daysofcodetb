import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        String result = (n > 0) ? "positive" : (n < 0) ? "negative" : "neither negative nor positive (it is zero)";
        System.out.println(n + " is " + result);
        sc.close();
    }}


/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        double n = sc.nextDouble();
        if (n > 0) {           
                System.out.print(n + " is a positive number");          
        } else if (n<0) {
            System.out.println( n + " is a negative number");
        } else {
            System.out.println( n + " is neither -ve nor +ve ");
        }
        sc.close();
    }
}*/
