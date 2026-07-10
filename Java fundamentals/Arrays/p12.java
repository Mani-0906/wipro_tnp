import java.util.*;
public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[2];
        System.out.println("Enter 3 elements for first array:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter 3 elements for second array:");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        c[0] = a[1];
        c[1] = b[1];
        System.out.println("Result Array:");
        for (int i = 0; i < 2; i++) {
            System.out.print(c[i] + " ");
        }
    }
}