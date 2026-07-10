import java.util.*;
public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}