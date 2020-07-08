import java.util.*;
public class SumofArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // Use for each loop to print the array.
        for(int items:array) {
            System.out.print(items + " ");
        }
        // Sum the array elements.
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        System.out.println("\nsum of the array elements is: "+sum);
    }
}
