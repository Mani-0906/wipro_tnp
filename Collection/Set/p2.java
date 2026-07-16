import java.util.*;

public class p2 {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Ravi");
        employees.add("Priya");
        employees.add("Kiran");
        employees.add("Sai");
        employees.add("Anjali");

        System.out.println("Employee Names:");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}