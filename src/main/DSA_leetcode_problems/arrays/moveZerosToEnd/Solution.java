package arrays.moveZerosToEnd;

public class Solution {
    public static void moveZeroes(int[] nums) {
        //approach:
        //give arr= [0,1,0,3,12]
        //start searching the non zero element
        //iterate through arr and replace the first index with first non zero element and so on.
        //the last non zero elelemnet should be the last index after that fill all remaining index with 0's

        int current = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[current] = nums[i];
                current++;
            }
        }
        for(int j = current; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}
