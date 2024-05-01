package maps.majorityElementHashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static int majorityElement(int[] nums) {
        //[2,2,1,1,1,2,2]
        //2222 = 7/2 = 3 since 4 > 3
        HashMap<Integer, Integer> countIndex= new HashMap<>();
        for(int element : nums){
            if(countIndex.containsKey(element)){
                countIndex.put(element, countIndex.get(element)+1);
            }
            else{
                countIndex.put(element, 1);
            }
        }

        // using iterators
        Iterator<Map.Entry<Integer, Integer>> itr = countIndex.entrySet().iterator();
        int max = nums.length/2;
        int ans = 0;
        while(itr.hasNext())
        {
            Map.Entry<Integer, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
            if(entry.getValue() > max){
                max= entry.getValue();
                ans= entry.getKey();
            }
        }
        return ans;
    }
}
