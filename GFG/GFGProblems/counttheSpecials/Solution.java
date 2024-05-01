package GFGProblems.counttheSpecials;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        HashMap <Integer, Integer> elementCount = new HashMap<>();
        for (int element : a)
        {
            if(elementCount.containsKey(element))
            {
                int count = elementCount.get(element);
                elementCount.put(element, ++count);
            }
            else
            {
                elementCount.put(element,1);
            }
        }
        int count= 0 ;
        //now we have a hashmap with elements and its occurrences.
        //iterate the hashmap.//using Entry interface.
        for(Map.Entry<Integer, Integer> entry : elementCount.entrySet()){
            if(entry.getValue() == f){
                count++;
            }
            else {
                //do nothing
            }
        }
        return count;

    }
}
