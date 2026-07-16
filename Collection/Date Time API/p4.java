import java.time.*;

public class p4 {

    public static void main(String[] args) {

        Year year = Year.now();

        if (year.isLeap()) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}