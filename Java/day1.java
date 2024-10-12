import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().toLowerCase().charAt(0);
        if ("aeiou".indexOf(n) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        sc.close();
    }
}

/*"aeiou" is a string containing all the vowels.
indexOf(n) returns the position of the character n in the string. If n is found, it returns its index (which is a number), and if it is not found, it returns -1.
The condition != -1 means that if n is found in the vowels, the condition is true (it is a vowel).*/
