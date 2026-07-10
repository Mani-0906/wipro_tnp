import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            System.out.println((s1 + s2.substring(1)).toLowerCase());
        } else {
            System.out.println((s1 + " " + s2).toLowerCase());
        }
    }
}