package collections.part2.MapInterface.LinkedhashMap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // Create a list of key-value pairs
        List<Map.Entry<Integer, String>> entries = List.of(
                Map.entry(1, "Apple"),
                Map.entry(2, "Banana"),
                Map.entry(3, "Cherry"),
                Map.entry(4, "Date"),
                Map.entry(5, "Elderberry")
        );
        Map<Integer, String> linkedHashMap = entries.stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, // Merge function (not needed here)
                        LinkedHashMap::new // Supplier for LinkedHashMap
                ));

        linkedHashMap.forEach((key, value) ->
            System.out.println("Key: " + key + ", Value: " + value)
        );
        // Make this linkedHashMap threadSafe

        Map<Integer, String> linkedHashMapWithNulls = Collections.synchronizedMap(new LinkedHashMap<>());
        linkedHashMapWithNulls.put(1, "Apple");
        linkedHashMapWithNulls.put(2, "Banana");
        linkedHashMapWithNulls.put(3, "Cherry");
        linkedHashMapWithNulls.put(null, "Date"); // Adding null key
        linkedHashMapWithNulls.put(null, null); // Adding null value


        //Access the values from hashmap using mutiple threads to show synchronized is working.
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: " + linkedHashMapWithNulls.get(1));
            System.out.println("Thread 1: " + linkedHashMapWithNulls.get(null));
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2: " + linkedHashMapWithNulls.get(2));
            System.out.println("Thread 2: " + linkedHashMapWithNulls.get(null));
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }







    };

}
