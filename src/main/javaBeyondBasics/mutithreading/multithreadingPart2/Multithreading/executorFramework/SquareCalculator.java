package mutithreading.multithreadingPart2.Multithreading.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class SquareCalculator {

    private ExecutorService executor
            = Executors.newFixedThreadPool(2);

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("Current thread name " +Thread.currentThread().getName());
            return input * input;
        });
    }

    public void shutdown() {
        executor.shutdown();
    }
}
