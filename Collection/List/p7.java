import java.util.*;

class Employee {

    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String toString() {
        return empId + " " + empName;
    }
}

public class p7 {

    public static void main(String[] args) {

        Vector<Employee> v = new Vector<>();

        v.add(new Employee(101,"Ravi"));
        v.add(new Employee(102,"Priya"));
        v.add(new Employee(103,"Kiran"));

        System.out.println("Using Iterator");

        Iterator<Employee> it = v.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing Enumeration");

        Enumeration<Employee> e = v.elements();

        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}