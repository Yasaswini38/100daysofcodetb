import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = sc.nextLine(); 
        System.out.print("Enter year: ");
        int year = sc.nextInt(); 
        switch(month.toLowerCase()) {
            case "january": case "march": case "may": case "july":
            case "august": case "october": case "december":
                System.out.println(month + " " + year + " has 31 days.");
                break;
            case "april": case "june": case "september": case "november":
                System.out.println(month + " " + year + " has 30 days.");
                break;
            case "february":
                if (isLeapYear(year)) {
                    System.out.println("February " + year + " has 29 days.");
                } else {
                    System.out.println("February " + year + " has 28 days.");
                }
                break;
            default:
                System.out.println("Invalid month.");
        }
        
        sc.close();
    }
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}
