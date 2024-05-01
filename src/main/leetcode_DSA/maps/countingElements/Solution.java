package maps.countingElements;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static int countElements(int[] arr) {
        //prepare the occourence v/s element count hashmap.
        HashMap<Integer, Integer> countIndex= new HashMap<>();
        for(int element : arr){
            if(countIndex.containsKey(element)){
                countIndex.put(element, countIndex.get(element)+1);
            }
            else{
                countIndex.put(element, 1);
            }
        }

        //iterate the hashmap to count the maximum occourence of a number.
        int max=0; //max occourence of a number.
        int ans=0; //number with max occourence.
        for(Map.Entry<Integer, Integer> entry : countIndex.entrySet()){
            if(entry.getValue() > max){
                max= entry.getValue();
                ans= entry.getKey();
            }
        }
        return ans;
    }
}


        //iterate the hasmap to count.
        // using iterators
//        Iterator<Map.Entry<Integer, Integer>> itr = countIndex.entrySet().iterator();
//        int ans = 0;    //count
//        while(itr.hasNext())
//        {
//            Map.Entry<Integer, Integer> entry = itr.next();
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
//            if(entry.getValue() > max){
//                max= entry.getValue();
//                ans= entry.getKey();
//            }
//        }
//        return ans;
/*         return 0;
    }

}
 */