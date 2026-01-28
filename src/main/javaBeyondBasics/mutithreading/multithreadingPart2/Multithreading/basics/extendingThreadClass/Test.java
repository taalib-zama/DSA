package mutithreading.multithreadingPart2.Multithreading.basics.extendingThreadClass;

public class Test {
    public static void main(String[] args) {
        System.out.println("Main thread started" + Thread.currentThread().getName());

        Thread t1  = new MyCustomThread();
        t1.setName("MyThread-1");
        t1.start();


    }
}
