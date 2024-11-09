import java.util.*;
public class dou {
    /* Write a program to find the double of the given 
    number without using arithmetic operator */
    public static int doubleNumber(int n) {
        return n << 1;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        int otp = doubleNumber(n);
        System.out.println(otp);
    }
    
}
