package mutithreading.multithreadingPart3.multithreading.mutithreadingBlog;

public class TheradExample {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<10; i++){
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
            try {
                System.out.println("Thread: " + Thread.currentThread().getName() + " sleeping");
                Thread.sleep(10L * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
