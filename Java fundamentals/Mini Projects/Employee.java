import java.util.*;
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] empNo = new int[7];
        String[] empName = new String[7];
        char[] desCode = new char[7];
        String[] dept = new String[7];
        int[] basic = new int[7];
        int[] hra = new int[7];
        int[] it = new int[7];

        System.out.println("Enter Employee Details:");
        for (int i = 0; i < 7; i++) {
            System.out.println("\nEmployee " + (i + 1));
            
            System.out.print("Employee Number: ");
            empNo[i] = sc.nextInt();

            System.out.print("Employee Name: ");
            empName[i] = sc.next();

            System.out.print("Designation Code (e/c/k/r/m): ");
            desCode[i] = sc.next().charAt(0);

            sc.nextLine();   // consume newline

            System.out.print("Department: ");
            dept[i] = sc.nextLine();

            System.out.print("Basic Salary: ");
            basic[i] = sc.nextInt();

            System.out.print("HRA: ");
            hra[i] = sc.nextInt();

            System.out.print("IT: ");
            it[i] = sc.nextInt();
        }

        System.out.print("\nEnter Employee ID to Search: ");
        int id = sc.nextInt();

        int index = -1;

        for (int i = 0; i < 7; i++) {
            if (empNo[i] == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("There is no employee with empid : " + id);
            return;
        }

        String designation = "";
        int da = 0;

        switch (desCode[index]) {
            case 'e':
                designation = "Engineer";
                da = 20000;
                break;

            case 'c':
                designation = "Consultant";
                da = 32000;
                break;

            case 'k':
                designation = "Clerk";
                da = 12000;
                break;

            case 'r':
                designation = "Receptionist";
                da = 15000;
                break;

            case 'm':
                designation = "Manager";
                da = 40000;
                break;
        }

        int salary = basic[index] + hra[index] + da - it[index];

        System.out.println("\nEmp No\tEmp Name\tDepartment\tDesignation\tSalary");
        System.out.println(empNo[index] + "\t" + empName[index] + "\t\t" +
                dept[index] + "\t\t" + designation + "\t\t" + salary);
    }
}