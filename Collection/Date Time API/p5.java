import java.time.*;

public class p5 {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime after25Minutes = currentTime.plusMinutes(25);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time after 25 minutes: " + after25Minutes);
    }
}