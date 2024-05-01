package hashmaps.countingelements;

import java.util.*;

public class Solution {
    public static int countElements(int[] arr) {
        int counter = 0;
        //step 1 : store the elements in arr in set.
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int element : arr) {
            // If the element is already in the map, update its count
            if (occurrenceMap.containsKey(element)) {
                occurrenceMap.put(element, occurrenceMap.get(element) + 1);
            } else {
                // If the element is not in the map, add it with count 1
                occurrenceMap.put(element, 1);
            }
        }

            //iterate the hashmap, checking if x+1 is there, if yes make count flag +1.considering the repeated,
            //where we will pick the value of hashmap against key as count
        Iterator<Map.Entry<Integer, Integer>> itr = occurrenceMap.entrySet().iterator();
        while (itr.hasNext()) {
                Map.Entry<Integer, Integer> entry = itr.next();
                if (occurrenceMap.containsKey(entry.getKey()+1)) {
                    counter = counter + entry.getValue();
                }
            }
            return counter;
        }
    }

