import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {

    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class p1 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ravi", "Pune", 50000));
        list.add(new Employee(102, "Priya", "Hyderabad", 55000));
        list.add(new Employee(103, "Kiran", "Chennai", 60000));
        list.add(new Employee(104, "Sai", "Bangalore", 65000));
        list.add(new Employee(105, "Anjali", "Pune", 70000));

        Function<Employee, String> f = e -> e.location;

        ArrayList<String> locations = list.stream()
                .map(f)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Employee Locations:");
        locations.forEach(System.out::println);
    }
}