import java.util.*;

public class p2 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("Australia", "Canberra");

        // a) Check if a particular key exists
        String key = "India";

        if (map.containsKey(key)) {
            System.out.println(key + " exists as a key.");
        } else {
            System.out.println(key + " does not exist as a key.");
        }

        // b) Check if a particular value exists
        String value = "Tokyo";

        if (map.containsValue(value)) {
            System.out.println(value + " exists as a value.");
        } else {
            System.out.println(value + " does not exist as a value.");
        }

        // c) Iterate through the HashMap using Iterator
        System.out.println("\nHashMap Elements:");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}