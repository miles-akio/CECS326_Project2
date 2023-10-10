Miles Shinmachi
Alina Anwar
CECS 326 SEC 02
CECS 326 - Project 2

For Project 2, we are given the problem regarding the implementation of philosophers where we must find a solution using either POSIX mutex locks and condition variables or Java condition variables:

In this case, my partner and I decided to go toward the Java condition variable route where we divided it up into 4 separate files: DiningPhilosopher, DiningServerImpl, DiningServer, Philosopher

For DiningPhilosophers.java:

    - We created this file which essentially creates the DiningPhilosophers class to help create the layout in which the dining server and philosophers were interacting once the program began to compile.

For DiningServer.java:

    - We created this file which essentially creates the DiningServer interface where we will call and utilize the philosopher class to help to determine whether they are wish to eat or are finished eating

For DiningServerImpl.java:
    - We created this file which essentially creates the DiningServerImpl class which is an extension of the DiningServer class once implemented. 
    - Within it we identify many voids such as takeForcks and returnForks which helps to determine and keep count of what type of action each philosopher did
    - In addition, we created a DiningServerImpl class at the beginning to identify the values of forks and conditions to identify the state that the fork is in

    Philsopher.java:
    - 
