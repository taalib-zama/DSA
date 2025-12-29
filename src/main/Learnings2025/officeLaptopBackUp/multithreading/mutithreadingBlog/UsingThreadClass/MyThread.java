package multithreading.mutithreadingBlog.UsingThreadClass;

public class MyThread extends Thread{

    public void run(){
        System.out.println("New Thread is running" + this.getName());
    }
}
