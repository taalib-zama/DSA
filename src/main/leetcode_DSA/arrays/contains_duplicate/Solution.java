package arrays.contains_duplicate;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        //arr = [1,2,3,1]
        for(int i = 0 ; i < nums.length ; i ++){
            int pivot = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(nums[j]==pivot){
                    return true;
                }
                else{
                    //do nothing
                }
            }
        }
        return false;
    }

}
