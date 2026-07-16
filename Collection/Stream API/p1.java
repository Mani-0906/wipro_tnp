import java.util.*;
import java.util.stream.*;

public class p1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-10);
        list.add(5);
        list.add(-8);
        list.add(12);
        list.add(-3);
        list.add(-6);
        list.add(9);
        list.add(-2);
        list.add(15);
        list.add(20);

        ArrayList<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Original List:");
        System.out.println(list);

        System.out.println("\nNegative Even Numbers:");
        System.out.println(result);
    }
}