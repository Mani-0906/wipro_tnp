class RaceThread extends Thread
{
    private static boolean winner = false;
    private boolean hareSleep;

    public RaceThread(String name, boolean hareSleep)
    {
        super(name);
        this.hareSleep = hareSleep;
    }

    public void run()
    {
        for(int i = 1; i <= 100 && !winner; i++)
        {
            System.out.println(getName() + " covered " + i + " meters");

            if(getName().equals("Hare") && hareSleep && i == 60)
            {
                try
                {
                    System.out.println("\nHare is sleeping for 1 second...\n");
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }

            try
            {
                Thread.sleep(20);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }

        if(!winner)
        {
            winner = true;
            System.out.println("\n***************");
            System.out.println(getName() + " WINS THE RACE!");
            System.out.println("***************");
        }
    }
}
