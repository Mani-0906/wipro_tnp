import java.util.*;

public class Race
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== HARE AND TORTOISE RACE =====");
        System.out.println("1. Normal Race");
        System.out.println("2. Hare High Priority");
        System.out.println("3. Hare Sleeps at 60 meters");
        System.out.print("Enter your choice : ");

        int choice = sc.nextInt();

        RaceThread hare;
        RaceThread tortoise;

        switch(choice)
        {
            case 1:
                hare = new RaceThread("Hare", false);
                tortoise = new RaceThread("Tortoise", false);
                hare.start();
                tortoise.start();
                break;

            case 2:
                hare = new RaceThread("Hare", false);
                tortoise = new RaceThread("Tortoise", false);
                hare.setPriority(Thread.MAX_PRIORITY);
                tortoise.setPriority(Thread.MIN_PRIORITY);
                hare.start();
                tortoise.start();
                break;

            case 3:
                hare = new RaceThread("Hare", true);
                tortoise = new RaceThread("Tortoise", false);
                hare.setPriority(Thread.MAX_PRIORITY);
                tortoise.setPriority(Thread.MIN_PRIORITY);
                hare.start();
                tortoise.start();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
