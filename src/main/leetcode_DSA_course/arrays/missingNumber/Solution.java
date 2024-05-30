package arrays.missingNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int missingNumber(int[] nums) {
//        //get the max element along with sum.
//        //edge case.
//        if(nums.length == 2){
//            for(int i : nums){
//                if(i == 0 || i == 1){
//                    return 2;
//                }
//                if(i ==0 || i ==2){
//                    return 1;
//                }
//                if(i ==1 || i ==2){
//                    return 0;
//                }
//            }
//        }
//
//        int max = Integer.MIN_VALUE;
//        int sum1 = 0;
//        for (int element : nums) {
//            sum1 += element;
//            if(element > max) {
//                max = element;
//            }
//        }
//        //find the sum using formula.
//        int sum2 = (max * (max + 1))/2;
//        int missingElement = sum2 - sum1;
//        return missingElement;

            Set<Integer> numSet = new HashSet<>();
            for (int num : nums) numSet.add(num);

            int expectedNumCount = nums.length + 1;
            for (int number = 0; number < expectedNumCount; number++) {
                if (!numSet.contains(number)) {
                    return number;
                }
            }
            return -1;
    }
}
