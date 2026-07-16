import java.util.*;

public class p3 {

    ArrayList<String> list = new ArrayList<>();

    void printAll() {

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

        p3 obj = new p3();

        obj.list.add("Java");
        obj.list.add("Python");
        obj.list.add("C");
        obj.list.add("C++");

        obj.printAll();
    }
}