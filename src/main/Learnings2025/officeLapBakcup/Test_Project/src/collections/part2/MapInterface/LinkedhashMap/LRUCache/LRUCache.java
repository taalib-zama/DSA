package collections.part2.MapInterface.LinkedhashMap.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    // Constructor to initialize the cache with a fixed capacity
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // true for access order
        this.capacity = capacity;
    }

    // Override removeEldestEntry to implement LRU eviction policy
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity; // Remove the eldest entry if size exceeds capacity
    }

    public static void main(String[] args) {
        // Create an LRU Cache with a capacity of 3
        LRUCache<Integer, String> lruCache = new LRUCache<>(3);

        // Add some entries
        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");

        // Access some entries
        lruCache.get(1); // Access key 1 to make it recently used
        lruCache.put(4, "Four"); // Add a new entry, causing the least recently used (key 2) to be removed

        // Print the cache
        lruCache.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value)
        );
    }
}