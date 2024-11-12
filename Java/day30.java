import java.util.Scanner;
public class withoutlen {
    /*Write a Program to print Length of the string without using strlen() function */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int length = 0;
        for (int i=0;i<=input.length();i++) {
            length++;
        }
        
        System.out.println("Length of the string: " + length);
    
}

}
