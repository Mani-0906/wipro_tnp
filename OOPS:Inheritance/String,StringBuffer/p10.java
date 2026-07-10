import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        String last = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            System.out.print(last);
        }
    }
}