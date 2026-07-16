import java.util.*;
import java.util.function.Consumer;

public class p6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("Spring");
        list.add("React");
        list.add("Oracle");
        list.add("Angular");
        list.add("SQL");

        Consumer<ArrayList<String>> reverseWords = l -> {
            for (int i = 0; i < l.size(); i++) {
                String rev = new StringBuilder(l.get(i)).reverse().toString();
                l.set(i, rev);
            }
        };

        reverseWords.accept(list);

        System.out.println("Updated ArrayList:");
        list.forEach(System.out::println);
    }
}