package collections.part1.ListInterface.ArrayLIst.multithreadedArrayListExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnsafeArrayListExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> unsafeArrayList = new ArrayList<>();
        unsafeArrayList.add(1);
        unsafeArrayList.add(2);
        unsafeArrayList.add(3);

        // Create a thread pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Create a Runnable task that increments each element of the ArrayList by one
        Runnable task = () -> {
            incrementArrayList(unsafeArrayList);
        };

        // Submit the task to the executor service 100 times.
        // All the tasks will modify the ArrayList concurrently
        for(int i = 0; i < 100; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(unsafeArrayList);
    }

    // Increment all the values in the ArrayList by one
    private static void incrementArrayList(List<Integer> unsafeArrayList) {
        for(int i = 0; i < unsafeArrayList.size(); i++) {
            Integer value = unsafeArrayList.get(i);
            unsafeArrayList.set(i, value + 1);
        }
    }
}



///The final output of the above program should be equal to [101, 102, 103]
// because we’re incrementing the values in the ArrayList 100 times.
// But if you run the program, it will produce different output every time it is run -
//Running the above program multiple times and see how it produces different outputs
