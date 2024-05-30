package twoPointer;

public class Solution {
    public static int[] sortedSquares(int[] nums) {
        int[] resultArray = new int[nums.length];
        int i = 0;
        int j = nums.length -1;
        int resultArrayIndex = nums.length-1;
        while(i <= j){
            int absValue = Math.abs(nums[i]);
            int absValue2 = Math.abs(nums[j]);
            if(absValue < absValue2){
                //increment left pointer.
                j--;
                resultArray[resultArrayIndex] = absValue2*absValue2;
                resultArrayIndex--;
            }
            else{
                //decrease right pointer.
                i++;
                resultArray[resultArrayIndex] = absValue*absValue;
                resultArrayIndex--;
            }
        }
        return resultArray;
    }

}
