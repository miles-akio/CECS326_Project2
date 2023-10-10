/**
 * DiningPhilosophers.java
 *
 * This program starts the dining philosophers problem.
 *
 */

public class DiningPhilosophers {
  public static void main(String[] args) {
    int numPhilo = 5; // Number of philosophers
    DiningServer diningServer = new DiningServerImpl(numPhilo); // Creates the dining server

    // Create an array of philosophers using threads
    Thread[] philosopherThreads = new Thread[numPhilo];
    for (int i = 0; i < numPhilo; i++) {
      philosopherThreads[i] = new Thread(new Philosopher(i, diningServer));
    }

    // Start the philosopher threads to simulate dining philosophers problem
    for (Thread thread : philosopherThreads) {
      thread.start();
    }
  }
}
