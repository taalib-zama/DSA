package slidingWindow.maximumSubArrayAvg1;

public class Solution {
    public static double findMaxAverage(int[] nums, int k) {

        int left = 0;
        int right = k;
        int maxSum = 0;
        int sum = 0;
        double result = 0;
        if(k > nums.length){
            return 0;
        }
        for(int i =0 ; i <k; i++){
            sum = sum + nums[i];
        }
        maxSum = sum;

        while(right < nums.length){
            sum = sum +nums[right];
            sum = sum - nums[left];
            left++;
            right++;
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        result = (double)maxSum/k;
        return result;

    }
}
