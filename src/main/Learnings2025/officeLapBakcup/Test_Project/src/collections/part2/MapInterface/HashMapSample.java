package collections.part2.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        Map<Integer, String> customMap = new HashMap<>();
        // Adding key-value pairs to the HashMap
        customMap.put(1, "Apple");
        customMap.put(2, "Banana");
        customMap.put(3, "Cherry");
        customMap.put(4, "Date");
        customMap.put(5, "Elderberry");



        // Displaying the HashMap
        System.out.println("HashMap contents:");
        for (Map.Entry<Integer, String> entry : customMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            System.out.println(customMap.values());
        }
        // Checking if a key exists
        for (Map.Entry<Integer, String> entry : customMap.entrySet()) {
            if (entry.getKey() == 3) {
                System.out.println("Key 3 exists with value: " + entry.getValue());
            }
        }



        Map<Integer, String> map2 = new HashMap<>();
        //adding null and duplicate values to check the functions.
        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Cherry");
        map2.put(null, "Date");
        map2.put(null, null);  // this will override the existing one.
        map2.put(2, "overriden banana");   //overries the existing value of 2

        //printing the hashmap.
        System.out.println("HashMap with null and duplicate values:");
        for (Map.Entry<Integer, String> entries : map2.entrySet()) {
            System.out.println("Key : " + entries.getKey() + "   value : " + entries.getValue());
        }
    }
}
