package mutithreading.usingThreadClass;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Printing the main thread" + Thread.currentThread().getName());
        int n= 8; //deinfing the number of threads
        for (int i = 0; i < n; i++) {
            //creeating object of the class MultithreadingDemo
            MultithreadingDemo myThread = new MultithreadingDemo();
            myThread.start(); //triggers the run method
        }
    }
}
