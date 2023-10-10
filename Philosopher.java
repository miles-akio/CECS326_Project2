/**
 * Philosopher.java
 *
 * This class represents each philosopher thread.
 * Philosophers alternate between eating and thinking.
 *
 */
import java.util.Random;

public class Philosopher implements Runnable
{
    private int philoNum; //number for each philosopher
    private DiningServer diningServer;
    private Random random = new Random(); //each philosopher sleeps between 1-3 seconds (chosen randomly)

    public Philosopher(int philoNum, DiningServer diningServer)
    {
        this.philoNum = philoNum;
        this.diningServer = diningServer;
    }

    @Override
    public void run()
    {
        try
        {
            while(true)
            {
                think(); //Philosopher thinks
                diningServer.takeForks(philoNum);
                eat(); //Philosopher eats
                diningServer.returnForks(philoNum);
            }
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();

        }
    }

    private void think() throws InterruptedException
    {
        int thinkTime = (random.nextInt(3) + 1) * 1000;
        System.out.println("Philosopher #" + philoNum + " took " + thinkTime + "ms thinking");
        //Sleep between 1 and 3 seconds 
        Thread.sleep(thinkTime); 
    }

    private void eat() throws InterruptedException
    {
        int eatTime = (random.nextInt(3) + 1) * 1000;
        System.out.println("Forks are with Philosopher #" + philoNum);
        System.out.println("Philosopher #" + philoNum + " took " + eatTime + "ms eating");
        Thread.sleep(eatTime); 
    }
}
