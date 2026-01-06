package blind75.twoSUm;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    public static int[] twoSumUsingStream(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        return IntStream.range(0, nums.length)
                .filter(i -> numToIndex.containsKey(target - nums[i]) || (numToIndex.put(nums[i], i) == null))
                .mapToObj(i -> new int[]{numToIndex.get(target - nums[i]), i})
                .findFirst()
                .orElse(new int[]{-1, -1});


    }

}
