import java.time.*;

public class p6 {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime beforeTime = currentTime.minusHours(5).minusMinutes(30);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time before 5 hours 30 minutes: " + beforeTime);
    }
}