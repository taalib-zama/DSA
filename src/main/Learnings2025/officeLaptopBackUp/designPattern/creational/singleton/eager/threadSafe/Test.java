package designPattern.creational.singleton.eager.threadSafe;

public class Test {
    public static void main(String[] args) {
        // Create multiple threads to test the thread-safe singleton
        Thread thread1 = new Thread(() -> {
            SingletonThreadSafe instance1 = SingletonThreadSafe.getSingletonThreadSafeInstance();
            System.out.println("Instance 1: " + instance1);
        });

        Thread thread2 = new Thread(() -> {
            SingletonThreadSafe instance2 = SingletonThreadSafe.getSingletonThreadSafeInstance();
            System.out.println("Instance 2: " + instance2);
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
