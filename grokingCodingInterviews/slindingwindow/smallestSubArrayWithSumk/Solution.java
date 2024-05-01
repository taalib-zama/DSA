package slindingwindow.smallestSubArrayWithSumk;

public class Solution {

    public static int minSubArrayLen(int target, int[] arr) {
        ///since here we have to find the smallest contigious subarray the length of window is not fixed.
        //1. add up elements from beginning till the end until their sum becomes greater than or equal to target.
        //2. These elements will constitute our sliding window. We are asked to find the smallest such window
        //having a sum greater than or equal to ‘S’. We will remember the length of this window as the smallest
        //window so far.

        //3. After this, we will keep adding one element in the sliding window (i.e. slide the window ahead), in a
        //stepwise fashion.

        //4. In each step, we will also try to shrink the window from the beginning. We will shrink the window until
        //the window’s sum is smaller than ‘S’ again. This is needed as we intend to find the smallest window. This
        //shrinking will also happen in multiple steps; in each step we will do two things:
        //  Check if the current window length is the smallest so far, and if so, remember its length.
            //Subtract the first element of the window from the running sum to shrink the sliding window.

        int windowSum = 0, minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd]; // add the next element
// shrink the window as small as possible until the 'windowSum' is smaller than 'S'
            while (windowSum >= target) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart]; // subtract the element going out
                windowStart++; // slide the window ahead
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}
