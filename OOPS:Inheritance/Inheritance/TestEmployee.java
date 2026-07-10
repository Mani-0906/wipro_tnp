import java.util.*;

public class TestEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Annual Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Year Started: ");
        int year = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Insurance Number: ");
        String insurance = sc.nextLine();

        Employee emp = new Employee(name, salary, year, insurance);

        System.out.println("\nEmployee Details");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("Insurance Number: " + emp.getInsuranceNumber());
    }
}