import java.util.*;
public class RecursionFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        System.out.println(fact(num));

    }
    static int fact(int num) {
        if(num==0) {
            return 1;
        }return num*fact(num-1);
    }
}
