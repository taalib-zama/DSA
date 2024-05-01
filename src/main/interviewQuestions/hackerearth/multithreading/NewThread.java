package hackerearth.multithreading;

public class NewThread extends Thread{
    Thread t;
    String name;
    NewThread(String threadName){
        name = threadName;
        t = new Thread(this,name);
        t.start();
    }

    public void run(){
    }

}
