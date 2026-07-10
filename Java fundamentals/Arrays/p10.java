import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        System.out.println("Array after rearranging:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}