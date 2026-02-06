package collections.part2.MapInterface.hashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapExample {
    private static final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        // Initialize the cache with some data
        cache.put("user1", "John Doe");
        cache.put("user2", "Jane Smith");

        // Create a thread pool
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Simulate multiple threads accessing the cache
        for (int i = 0; i < 10; i++) {
            int threadId = i;
            executor.submit(() -> {
                String key = "user" + (threadId % 3); // Access keys "user0", "user1", "user2"
                cache.compute(key, (k, v) -> {
                    if (v == null) {
                        System.out.println(Thread.currentThread().getName() + " adding new value for " + k);
                        return "New User " + threadId;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " updating value for " + k);
                        return v + " (updated by thread " + threadId + ")";
                    }
                });
            });
        }

        // Shutdown the executor
        executor.shutdown();

        // Wait for all tasks to complete
        while (!executor.isTerminated()) {
            // Busy-wait
        }

        // Print the final cache state
        System.out.println("Final Cache: " + cache);
    }
}
