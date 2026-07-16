import java.util.*;

class Student {

    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public String toString() {
        return "Roll No: " + rollNo +
               ", Name: " + name +
               ", Mark: " + mark;
    }
}

public class p3 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Ravi", 65));
        list.add(new Student(102, "Priya", 45));
        list.add(new Student(103, "Kiran", 78));
        list.add(new Student(104, "Sai", 50));
        list.add(new Student(105, "Anjali", 38));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Number of Students Cleared = " + count);
    }
}