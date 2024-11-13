import java.util.*;
public class toggle {
    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an input: ");
        String input = sc.nextLine();
        String toggled = toggleCase(input);
        System.out.println("Toggled String: " + toggled);
    }
}
