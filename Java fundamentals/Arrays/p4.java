import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the ASCII values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Corresponding Characters:");
        for (int i = 0; i < n; i++) {
            System.out.print((char) arr[i] + " ");
        }
    }
}