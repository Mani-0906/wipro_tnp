import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0, str.length() / 2));
        } else {
            System.out.println("null");
        }
    }
}