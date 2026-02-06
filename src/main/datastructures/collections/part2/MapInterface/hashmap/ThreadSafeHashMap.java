package collections.part2.MapInterface.hashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadSafeHashMap {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> cricketTeamScore = new ConcurrentHashMap<>();
        cricketTeamScore.put("Australia", 349);
        cricketTeamScore.put("India", 250);

        //create executor service with thread size of 10.
        ExecutorService ex = Executors.newFixedThreadPool(10);

// Create a Runnable object that increments the value associated with a given key in the HashMap by one.
        Runnable task = () -> {
            incrementTeamScore(cricketTeamScore, "India");
        };

        Runnable task2 = () -> {
            incrementTeamScore(cricketTeamScore, "Australia");
        };

        // Submit the Runnable object to the executorService 100 times to test concurrent modifications
        for(int i = 0; i < 100; i++) {
            ex.submit(task);
            ex.submit(task2);
        }

        ex.shutdown();
        ex.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final Score of Team India : " + cricketTeamScore.get("India"));
    }

    // Increment the score of a team by one
    private static void incrementTeamScore(Map<String, Integer> cricketTeamScore, String team) {
        synchronized (cricketTeamScore) {
            Integer score = cricketTeamScore.get(team);
            cricketTeamScore.put(team, score + 1);
        }
    }

}
