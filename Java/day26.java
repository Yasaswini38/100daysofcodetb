import java.util.Scanner;
/*Get the number of people in the room as input from the user. 
Then calculate the maximum number of handshakes possible among that people.
For e.g. If there are N people in the room then the first person 
has to shake hand with N-1 people and second person has to shake hand 
with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.
So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0 */
public class handshakes {
    public static int totalHandshakes(int n) {
        return (n * (n- 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people in the room: ");
        int N = scanner.nextInt();
        System.out.println("The maximum number of handshakes possible is: " 
        + totalHandshakes(N));
        scanner.close();
    }
}

