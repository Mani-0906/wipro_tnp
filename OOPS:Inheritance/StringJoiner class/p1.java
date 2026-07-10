import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }
        StringJoiner sj = new StringJoiner(",", "{", "}");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj);
    }
}