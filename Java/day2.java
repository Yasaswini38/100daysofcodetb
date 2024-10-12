import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char n = sc.next().toLowerCase().charAt(0);
        if (n>='a' && n<='z') {           
                System.out.print(n + " is an alphabet ");            
        } else {
            System.out.println("Not an alphabet");
        }
        sc.close();
    }
}
