import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String input = sc.nextLine();
        String rev = "";
        for(int i=input.length()-1;i>=0;i--) {
            rev = rev + input.charAt(i);
        }
        System.out.println("reverse of a string is: "+rev);
        if(rev.equals(input)) {
            System.out.println("string is palindrome");
        }else {
            System.out.println("string is not palindrome");
        }
    }
}
