import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int inputNumber = sc.nextInt();
        int reverse = 0;
        int element = inputNumber;
        while(inputNumber!=0) {
            int digit = inputNumber%10;
            reverse = reverse*10+digit;
            inputNumber = inputNumber/10;
        }
        System.out.println("reverse of a number is: "+reverse);
        if(element==reverse) {
            System.out.println("number is palindrome");
        }else {
            System.out.println("number is not palindrome");
        }
    }
}
