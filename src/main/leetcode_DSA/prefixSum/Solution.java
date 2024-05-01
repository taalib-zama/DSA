package prefixSum;

public class Solution {
    public static int[] printPrefix(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        return prefix;
    }



    public static int waysToSplitArray(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int n = nums.length;
        int ans = 0;
        for(int i = 0; i <n-1;i++){
            int leftSection = prefix[i];
            int rightSection = prefix[n-1] - prefix[i];
            if(leftSection >=rightSection){
                ans++;
            }
        }
        return ans;
    }

}
