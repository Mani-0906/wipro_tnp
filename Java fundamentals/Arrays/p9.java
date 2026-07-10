import java.util.*;
public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < n) {
            arr[index] = 0;
            index++;
        }
        System.out.println("Array after removing 10:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}