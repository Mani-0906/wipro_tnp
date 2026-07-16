import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class p1 {
    public static void main(String[] args) {

        Employee emp = new Employee(
                "Manikanta",
                new Date(),
                "CSE",
                "Software Engineer",
                50000.0
        );

        // Serialization
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"));
            oos.writeObject(emp);
            oos.close();

            System.out.println("Employee object serialized successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }

        // Deserialization
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"));
            Employee e = (Employee) ois.readObject();
            ois.close();

            System.out.println("\nEmployee Details:");
            System.out.println("Name: " + e.getName());
            System.out.println("Date of Birth: " + e.getDateOfBirth());
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Designation: " + e.getDesignation());
            System.out.println("Salary: " + e.getSalary());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}