package mutithreading.multithreadingPart2.Multithreading.basics.UsingRunnable;


public class Test {
    public static void main(String[] args) {
        MyRunnable customThread = new MyRunnable();
        customThread.run();
    }
}
