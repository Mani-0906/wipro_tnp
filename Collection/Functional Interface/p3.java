import java.util.*;
import java.util.function.Predicate;

public class p3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("python");
        list.add("radar");
        list.add("hello");
        list.add("malayalam");
        list.add("world");
        list.add("noon");
        list.add("apple");

        Predicate<String> palindrome = str -> {
            String rev = new StringBuilder(str).reverse().toString();
            return str.equals(rev);
        };

        System.out.println("Palindrome Words:");

        list.stream()
            .filter(palindrome)
            .forEach(System.out::println);
    }
}