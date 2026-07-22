class NumberThread extends Thread
{
    private final int delay;

    public NumberThread(String name, int priority, int delay)
    {
        super(name);
        this.setPriority(priority);
        this.delay = delay;
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 6; i++)
        {
            System.out.println(getName() + " -> " + i);

            if (i % 2 == 0)
            {
                Thread.yield();
            }

            try
            {
                Thread.sleep(delay);
            }
            catch (InterruptedException e)
            {
                System.out.println(getName() + " interrupted");
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println(getName() + " finished");
    }
}

public class p1
{
    public static void main(String[] args) throws InterruptedException
    {
        NumberThread lowPriorityThread = new NumberThread("Low-Priority", Thread.MIN_PRIORITY, 300);
        NumberThread highPriorityThread = new NumberThread("High-Priority", Thread.MAX_PRIORITY, 200);

        lowPriorityThread.start();
        highPriorityThread.start();

        highPriorityThread.join();
        lowPriorityThread.join();

        System.out.println("Main thread finished");
    }
}