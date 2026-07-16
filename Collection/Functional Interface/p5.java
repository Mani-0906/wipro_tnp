import java.util.*;
import java.util.function.Predicate;

public class p5 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(16);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(36);
        list.add(50);

        Predicate<Integer> perfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        System.out.println("Perfect Square Numbers:");

        list.stream()
            .filter(perfectSquare)
            .forEach(System.out::println);
    }
}