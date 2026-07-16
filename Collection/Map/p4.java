import java.util.*;

public class p4 {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Ravi", 123456789);
        contacts.put("Priya", 987654321);
        contacts.put("Kiran", 456789123);
        contacts.put("Sai", 789123456);

        // a) Check if a particular key exists
        String name = "Priya";

        if (contacts.containsKey(name)) {
            System.out.println(name + " exists in the Contact List.");
        } else {
            System.out.println(name + " does not exist in the Contact List.");
        }

        // b) Check if a particular value exists
        int phone = 456789123;

        if (contacts.containsValue(phone)) {
            System.out.println(phone + " exists in the Contact List.");
        } else {
            System.out.println(phone + " does not exist in the Contact List.");
        }

        // c) Iterate through the HashMap using Iterator
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}