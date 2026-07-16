
public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101,"Ravi","ravi@gmail.com","Male",35000));
        db.addEmployee(new Employee(102,"Priya","priya@gmail.com","Female",42000));
        db.addEmployee(new Employee(103,"Kiran","kiran@gmail.com","Male",39000));

        System.out.println("Employee Details");
        db.displayEmployees();

        System.out.println(db.showPaySlip(102));

        db.deleteEmployee(101);

        System.out.println("\nAfter Deletion");

        db.displayEmployees();
    }
}