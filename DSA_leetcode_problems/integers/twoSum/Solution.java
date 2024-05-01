package integers.twoSum;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer, Integer> visited= new HashMap<Integer, Integer>();
        for(int index = 0 ; index <=nums.length; index++) {
            if (visited.containsKey(target - nums[index])) {
                indices[1] = index;
                indices[0] = visited.get(target - nums[index]);
                return indices;
            } else {
                visited.put(nums[index], index);
            }
        }
        return indices;

    }
}
