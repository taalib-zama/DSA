package hashmaps.twosums.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (dic.containsKey(complement)) { // This operation is O(1)!
                return new int[] { i, dic.get(complement) };
            }
            dic.put(num, i);
        }

        return new int[] { -1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7,10,3,9};
        int n = 8;
        System.out.println(twoSum(arr,n));
    }
}

