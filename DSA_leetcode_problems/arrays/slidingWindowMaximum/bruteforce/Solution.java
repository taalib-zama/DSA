package arrays.slidingWindowMaximum.bruteforce;

public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];

        for(int i = 0 ; i < nums.length - k ; i++){
            int maxTemp = nums[i];
            for(int j = i ; j < i+k ; j++){
                maxTemp = Math.max(maxTemp, nums[j]);
            }
            result[i] = maxTemp;
        }
        return result;
    }
}
