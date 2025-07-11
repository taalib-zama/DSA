package Multithreading;

public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem(){
        System.out.println("Item Produced");
        isItemPresent = true;
        System.out.println("Producer thread calling the notify method");
        notifyAll();

    }

    public synchronized void consumeItem(){
        System.out.println("Consumer thread inside consume item thread");
        while(!isItemPresent){
            try {
                System.out.println("Consumer thread is waiting for the item to be produced");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isItemPresent = false;
        System.out.println("Consumer thread consumed the item");
    }
}
