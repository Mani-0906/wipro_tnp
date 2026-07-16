import java.util.*;
import java.util.function.Predicate;

class Employee {

    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class p4 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ravi", 8000));
        list.add(new Employee(102, "Priya", 15000));
        list.add(new Employee(103, "Kiran", 9500));
        list.add(new Employee(104, "Sai", 12000));
        list.add(new Employee(105, "Anjali", 7000));

        Predicate<Employee> p = e -> e.getSalary() < 10000;

        System.out.println("Employees with Salary less than 10000:");

        list.stream()
            .filter(p)
            .forEach(e -> System.out.println(e.getName()));
    }
}