import java.util.*;

public class pro6 {

    static ArrayList<String> operations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // 1. Replace every alternate character with S2
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                sb1.append(s2);
            else
                sb1.append(s1.charAt(i));
        }
        list.add(sb1.toString());

        // 2. Replace last occurrence of S2 with reverse(S2)
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String result = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(result);
        } else {
            list.add(s1 + s2);
        }

        // 3. Delete first occurrence of S2 if it appears more than once
        if (first != last) {
            list.add(s1.replaceFirst(s2, ""));
        } else {
            list.add(s1);
        }

        // 4. Split S2 and add halves to beginning and end
        int mid = (s2.length() + 1) / 2;
        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);
        list.add(firstHalf + s1 + secondHalf);

        // 5. Replace characters of S1 that are present in S2 with *
        StringBuilder sb2 = new StringBuilder();
        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) != -1)
                sb2.append("*");
            else
                sb2.append(ch);
        }
        list.add(sb2.toString());

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter S1: ");
        String s1 = sc.next();

        System.out.print("Enter S2: ");
        String s2 = sc.next();

        ArrayList<String> result = operations(s1, s2);

        System.out.println(result);
    }
}