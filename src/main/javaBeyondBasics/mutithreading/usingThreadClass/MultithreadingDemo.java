package mutithreading.usingThreadClass;

public class MultithreadingDemo extends Thread{
    //overriding the run method
    public void run(){
        try{
            //Displaying the current thread
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
            Thread.sleep(1000);
            System.out.println("Thread after sleep "+Thread.currentThread().getId()+" is running");
        }
        catch (Exception e){
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
