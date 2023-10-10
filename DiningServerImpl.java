/**
 * DiningServer.java
 *
 * This class contains the methods called by the  philosophers.
 *
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class DiningServerImpl implements DiningServer 
{
    private Lock[] forks;
    private Condition[] conditions;

    public DiningServerImpl(int numofPhilo) 
	{
        forks = new ReentrantLock[numofPhilo]; // Array of locks
        conditions = new Condition[numofPhilo]; // Array of conditions

        // Initialize the locks and conditions for each of the philosopher's forks
        for (int i = 0; i < numofPhilo; i++) 
		{
            // Initialize a lock for each fork
            forks[i] = new ReentrantLock();

            // Initialize the condition for each fork
            conditions[i] = forks[i].newCondition();
        }
    }

    public void takeForks(int Philo) 
	{
        forks[Philo].lock(); // Take the left fork
        forks[(Philo + 1) % forks.length].lock(); // Take the right fork
    }

    public void returnForks(int Philo) 
	{
        forks[Philo].unlock(); // Put away the left fork
        forks[(Philo + 1) % forks.length].unlock(); // Put away the right fork
    }
}
