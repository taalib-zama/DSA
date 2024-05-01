package slindingwindow.maximumSumSubarraySizeK;

public class Solution {
    public static int maxSumSubarray(int target, int[] nums) {
        if (nums.length < target) {
            System.out.println("Invalid");
            return -1;
        }
        //using sliding window technique.
        //1. get the window sum. window sizer = target.
        int max_window_sum = 0;
        for (int i = 0; i < target; i++) {
            max_window_sum += nums[i];
        }

        //compute sums of subsequent windows
        int window_sum = max_window_sum;
        for (int i = target; i < nums.length; i++) {
            window_sum += nums[i] - nums[i - target];     //removing first element and adding first in each iteration.
            max_window_sum = Math.max(max_window_sum, window_sum);
        }
        return max_window_sum;
    }
}
