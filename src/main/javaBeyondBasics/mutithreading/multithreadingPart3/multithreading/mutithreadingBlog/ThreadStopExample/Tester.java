package mutithreading.multithreadingPart3.multithreading.mutithreadingBlog.ThreadStopExample;


public class Tester {
    public static void main(String[] args) {
        ThreadStopExample thread = new ThreadStopExample();
        Thread myThread = new Thread(thread);
        myThread.start();

        try{
            Thread.sleep(10L * 1000L);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
