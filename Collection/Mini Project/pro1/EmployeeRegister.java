import java.util.*;

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<Employee> employees = new TreeSet<>();

        System.out.println("Enter the Number of Employees");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String first = sc.nextLine();

            System.out.println("Enter the Lastname");
            String last = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            employees.add(new Employee(first, last, mobile, email, address));
        }

        System.out.println("\nEmployee List:\n");

        System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee e : employees) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                    e.firstName,
                    e.lastName,
                    e.mobile,
                    e.email,
                    e.address);
        }
    }
}