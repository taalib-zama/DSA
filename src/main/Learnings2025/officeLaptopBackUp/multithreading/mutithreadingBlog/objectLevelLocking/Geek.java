package multithreading.mutithreadingBlog.objectLevelLocking;

// Java program to illustrate
// Object lock concept

// Class
// Extending Runnable interface
class Geek implements Runnable {

    // Method of this class
    public void run() { Lock(); }

    // Synchronization of non-static methods
    // (object lock) as different synchronized
    // non-static methods are called in both threads

    // Then both threads need to acquire the object lock
    // After one is acquired, the other thread must wait
    // for one thread to finish the executing
    // before the other thread starts to execute.
    public void Lock()
    {
        System.out.println(
                Thread.currentThread().getName());
        synchronized (this)
        {
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName());
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName()
                            + " end");
        }
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of above class
        // in the main() method
        Geek g = new Geek();

        // Sharing the same object across two Threads

        // Here, t1 takes g
        Thread t1 = new Thread(g);

        // Here, t2 takes g
        Thread t2 = new Thread(g);

        // Creating another object of above class
        Geek g1 = new Geek();

        // Here, t3 takes g1
        Thread t3 = new Thread(g1);

        // setname() method is used to change
        // name of the thread
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        // start() method beginning the execution of threads
        // as JVM calls the run() method of thread
        t1.start();
        t2.start();
        t3.start();
    }
}