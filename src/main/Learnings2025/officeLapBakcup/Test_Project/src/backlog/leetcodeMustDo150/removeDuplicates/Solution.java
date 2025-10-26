package backlog.leetcodeMustDo150.removeDuplicates;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;         //edge case.
        int lastUnique = 0;         //to keep track of the element where the next unique element should be placed.
        //given array : {1,1,2};
        //iterate over initial nums array
        for (int current = 1; current < nums.length; current++) {
            if (nums[current] != nums[lastUnique]) {
                // Increment lastUnique before copying to ensure we don't overwrite a unique value
                lastUnique++;
                nums[lastUnique] = nums[current];       //in place modification of array
            }
        }

        return lastUnique + 1;    //return the number of unique elements.  +1 because the index starts from 0.

    }
}
