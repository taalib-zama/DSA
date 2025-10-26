package mutithreadingBlog.ProducerConsumerExample;

public class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait(); // Wait until the resource is consumed
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait until the resource is produced
        }
        available = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify the producer
        return data;
    }
}
