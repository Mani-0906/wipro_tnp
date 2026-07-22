import java.util.*;

class ColourTask implements Runnable
{
    public void run()
    {
        String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

        Random r = new Random();

        while (true)
        {
            int index = r.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red"))
            {
                break;
            }
        }
    }
}

public class p2
{
    public static void main(String[] args)
    {
        Thread t = new Thread(new ColourTask());

        t.start();
    }
}