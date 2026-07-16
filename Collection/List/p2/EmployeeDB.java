import java.util.*;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {

        Iterator<Employee> it = list.iterator();

        while(it.hasNext()) {
            Employee e = it.next();

            if(e.empId == empId) {
                it.remove();
                return true;
            }
        }

        return false;
    }

    String showPaySlip(int empId) {

        for(Employee e : list) {

            if(e.empId == empId) {
                return "Pay Slip\nEmployee Name : " + e.empName +
                        "\nEmployee ID : " + e.empId +
                        "\nSalary : " + e.salary;
            }
        }

        return "Employee Not Found";
    }

    void displayEmployees() {

        for(Employee e : list) {
            e.getEmployeeDetails();
            System.out.println();
        }
    }
}