package prefixSum.KradiesSubarrayAvg;

import java.util.Arrays;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        //get the prefix Sum of array.
        //edge case.
        int[] result=  new int[nums.length];
        if(nums.length < k+k+1){
            for(int res= 0; res < nums.length; res++){
                result[res] = -1;
            }
        }
        else {
            int[] prefix = new int[nums.length];
            prefix[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefix[i] = prefix[i - 1] + nums[i];
            }


            for (int l = 0; l < k; l++) {
                result[l] = -1;
            }
            for (int m = nums.length - 1; m > nums.length - k - 1; m--) {
                result[m] = -1;
            }

            for (int j = k; j < nums.length - k; j++) {
                int curr = prefix[j + k] - prefix[j - k] + nums[j - k];
                int avg = curr / (k + k + 1);
                result[j] = avg;
            }
            return result;
        }
        return result;
    }



    //optimized solution
    public static int[] getAverages1(int[] nums, int k) {
        // When a single element is considered then its averafge will be the number itself only.
        if (k == 0) {
            return nums;
        }

        int n = nums.length;
        int[] averages = new int[n];
        Arrays.fill(averages, -1);

        // Any index will not have 'k' elements in it's left and right.
        if (2 * k + 1 > n) {
            return averages;
        }

        // Generate 'prefix' array for 'nums'.
        // 'prefix[i + 1]' will be sum of all elements of 'nums' from index '0' to 'i'.
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // We iterate only on those indices which have atleast 'k' elements in their left and right.
        // i.e. indices from 'k' to 'n - k'
        for (int i = k; i < (n - k); ++i) {
            int leftBound = i - k, rightBound = i + k;
            long subArraySum = prefix[rightBound + 1] - prefix[leftBound];
            int average = (int) (subArraySum / (2 * k + 1));
            averages[i] = average;
        }

        return averages;
    }


    //sliding window approach.

}
