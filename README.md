Miles Shinmachi
Alina Anwar
CECS 326 SEC 02
CECS 326 - Project 2

For Project 2, we are given the problem regarding the implementation of philosophers where we must find a solution using either POSIX mutex locks and condition variables or Java condition variables:

In this case, my partner and I decided to go toward the Java condition variable route where we divided it up into 4 separate files: DiningPhilosopher, DiningServerImpl, DiningServer, Philosopher

For DiningPhilosophers.java:

    - We created this file which essentially creates the DiningPhilosophers class to help create the layout in which the dining server and philosophers were interacting once the program began to compile.

For DiningServer.java:

    - We created this file which essentially creates the DiningServer interface where we will call and utilize the philosopher class to help determine whether they wish to eat or are finished eating

For DiningServerImpl.java:

    - We created this file which essentially creates the DiningServerImpl class which is an extension of the DiningServer class once implemented. 
    - Within it, we identify many voids such as takeForcks and returnForks which help to determine and keep count of what type of action each philosopher did
    - In addition, we created a DiningServerImpl class at the beginning to identify the values of forks and conditions to identify the state that the fork is in

For Philsopher.java:

    - This file is where the compiling of the program takes place
    - We identify many private variables that can only be accessed within this file upon compiling rate including philoNum (number of each Philosopher), DiningServer (identifies what a dining server is), and Random (Determines that each philosopher waits 1-3 seconds for each)
    - Within the public Philosopher class, we create a public run function that runs the takeFork and returnFork functions within DiningServerImpl as well as catches any exception if it does not match the program-specific requirements
    - Finally, we have private classes, think & eat, which identifies and inserts the amount of time each philosopher took to eat or think during the program's compiling time.

Overall, when running the program, you would run the code entirely not each individual file:

    - Once it runs, the program will continue to run in a constant loop, however, this is a good sign
    - As long as there is a common pattern being outputted, there should be no errors found
    - Once there is a good pattern, you can stop the program from compiling and show that the code runs perfectly.
