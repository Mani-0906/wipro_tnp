import java.time.*;
import java.time.temporal.*;

public class p2 {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate secondSunday = today
                .plusMonths(1)
                .withDayOfMonth(1)
                .with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));

        System.out.println("Second Sunday of Next Month: " + secondSunday);
    }
}