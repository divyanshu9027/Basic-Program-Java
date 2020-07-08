import java.util.*;
public class RecursionPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
    static int pow(int a,int b) {
        if(b==0) {
            return 1;
        }return a * pow(a,b-1);
    }
}
