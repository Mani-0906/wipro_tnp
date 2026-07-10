import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String msg) {
        super(msg);
    }
}

public class p3 {

    public static void main(String[] args) {

        Employee emp = null;

        Optional<Employee> obj = Optional.ofNullable(emp);

        try {
            if (!obj.isPresent()) {
                throw new InvalidEmployeeException("Invalid Employee");
            }

            System.out.println("Employee is valid: " + obj.get().id + " " + obj.get().name);

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}