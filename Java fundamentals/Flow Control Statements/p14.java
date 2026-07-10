import java.util.*;
public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        System.out.println(sum);
    }
}