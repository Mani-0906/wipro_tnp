import java.util.*;
public class p1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Alice"; // initialize first element to avoid always-null
        Optional<String> value = Optional.ofNullable(names[0]);
        System.out.println(value.map(String::length).orElse(0));
    }
}