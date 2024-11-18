import java.util.Scanner;
public class countnumstr {
    /*  Write a Program to Count the sum of numbers in a string*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();int sum = 0;
        String temp = "";
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp += ch; 
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp); 
                    temp = ""; 
                }
            }
        }
        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        System.out.println("Sum of numbers in the string: " + sum);
    }

}
