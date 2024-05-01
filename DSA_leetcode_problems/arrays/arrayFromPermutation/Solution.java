package arrays.arrayFromPermutation;

public class Solution {
    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length  ; i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] permutatedArr = buildArray(arr);
        for(int a : permutatedArr){
            System.out.println(a);
        }
    }
}
