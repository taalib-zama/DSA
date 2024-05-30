package slidingWindow.numberOfSubarrays;

public class Solution {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int curr = 0;
        int left = 0;
        int right = k;
        int maxSum = 0;
        int sum = 0;
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
        return maxSum;
    }



    public static int findBestSubarray(int[] nums, int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        int ans = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}
