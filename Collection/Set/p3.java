import java.util.*;

public class p3 {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");
        ts.add("Canada");

        // a) Reverse the elements
        System.out.println("Reverse Order:");
        Iterator<String> rev = ts.descendingIterator();

        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        // b) Iterate using Iterator
        System.out.println("\nNormal Order:");
        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // c) Check if a particular element exists
        String country = "India";

        if (ts.contains(country)) {
            System.out.println("\n" + country + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + country + " does not exist in the TreeSet.");
        }
    }
}