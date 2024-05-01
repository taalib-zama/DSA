package arrays.contains_duplicate;

import java.util.HashSet;

public class Solution_enhanced {
    public static boolean containsDuplicate(int[] nums){
        //using set (Hashset-   does not store duplicate elememts). Before storing an Object, HashSet checks whether there is an existing entry
        // using hashCode() and equals() methods.

        HashSet<Integer> unique = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            if(unique.contains(nums[i])){
                return true;
            }
            unique.add(nums[i]);
        }
        return false;
    }
}
