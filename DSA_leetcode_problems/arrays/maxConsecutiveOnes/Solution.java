package arrays.maxConsecutiveOnes;

import java.util.Arrays;
 class Tester {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        System.out.println(Solution.findMaxConsecutiveOnes(arr));

    }
}
class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int countArr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            while (nums[i] == 1) {
                counter++;
                if (i == nums.length-1) {
                    break;
                }
                i++;
            }
            countArr[i] = counter;
            counter = 0;
        }

        return Arrays.stream(countArr).max().getAsInt();
    }
}



