import java.time.*;

public class p3 {

    public static void main(String[] args) {

        // Enter your Wipro joining date
        LocalDate joiningDate = LocalDate.of(2023, 7, 1);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Joining Date : " + joiningDate);
        System.out.println("Today's Date : " + today);

        System.out.println("\nExperience:");
        System.out.println(experience.getYears() + " Years");
        System.out.println(experience.getMonths() + " Months");
        System.out.println(experience.getDays() + " Days");
    }
}