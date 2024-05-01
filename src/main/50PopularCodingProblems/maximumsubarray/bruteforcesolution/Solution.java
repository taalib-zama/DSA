package maximumsubarray.bruteforcesolution;

public class Solution {
    public static int maximumSumOfSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;             // to be sure that the next subarray would be greater.
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j < arr.length ; j++) {
                int actualSum = 0;
                for (int k = 0; k <= j; k++) {          //loop to calculate sum of subarray till index j
                    actualSum += arr[k];
                }
                maxSum = Math.max(maxSum, actualSum);
            }
        }
        return maxSum;
    }



    public static void main(String[] args) {
        int[] arr = {4,-7,1,5};
        System.out.println(maximumSumOfSubArray(arr));

    }
}
