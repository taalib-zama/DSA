package mutithreading.multithreadingPart2.Multithreading.executorFramework;

import java.util.concurrent.CompletableFuture;

import static java.lang.Thread.sleep;

public class UsingCompletableFeature {
    public static void main(String[] args) {
        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return 10;
                });

        future.thenApply(result -> result * 2)
                .thenAccept(System.out::println);

    }
}
