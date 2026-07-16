import java.util.*;
import java.util.stream.*;

class Employee {

    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return "EmpNo: " + empNo +
               ", Name: " + name +
               ", Age: " + age +
               ", Location: " + location;
    }
}

public class p2 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ravi", 25, "Pune"));
        list.add(new Employee(102, "Priya", 28, "Hyderabad"));
        list.add(new Employee(103, "Kiran", 30, "Pune"));
        list.add(new Employee(104, "Sai", 27, "Chennai"));
        list.add(new Employee(105, "Anjali", 26, "Pune"));

        ArrayList<Employee> puneEmployees = list.stream()
                .filter(e -> e.location.equals("Pune"))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}