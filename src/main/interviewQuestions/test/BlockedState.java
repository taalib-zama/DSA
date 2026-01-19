package test;

public class BlockedState {
    public static void main(String[] args) throws
       InterruptedException {
            Thread t1 = new Thread(new DemoBlockedRunnable());
            Thread t2 = new Thread(new DemoBlockedRunnable());

            t1.start();
            t2.start();
        System.out.println("State of therad T2 : " + t2.getState());

            Thread.sleep(1000);

            System.out.println(t2.getState());
            System.exit(0);
        }
    }
    class DemoBlockedRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Inititated the run menthod for thread : "+Thread.currentThread().getName());
            commonResource();
        }

        public static synchronized void commonResource () {
            while(true) {

                System.out.println("Enteted common resource :" +Thread.currentThread().getName());
                //System.out.println("Thread t1 state : " +t2.getState());
                // Infinite loop to mimic heavy processing
                // ‘t1’ won’t leave this method
                // when ‘t2’ tries to enter this
            }
        }

}
