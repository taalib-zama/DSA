package prefixSum.minValStepSumPositive;

public class Solution {
    public static int minStartValue(int[] nums) {

        int minVal = 0;
        int total = 0;

        // Iterate over the array and get the minimum step-by-step total.
        for (int num : nums) {

            total += num;
            minVal = Math.min(minVal, total);
        }

        // We have to let the minimum step-by-step total equals to 1,
        // by increasing the startValue from 0 to -minVal + 1,
        // which is just the minimum startValue we want.
        return -minVal + 1;
    }
}
