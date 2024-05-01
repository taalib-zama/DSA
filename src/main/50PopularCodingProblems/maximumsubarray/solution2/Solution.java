package maximumsubarray.solution2;

public class Solution {             //TIME COMPLEXITY O(n). Also called Kadane's algorithm.
    public static  int maxSubarraySum(int[] arr){
        int globalSum = Integer.MIN_VALUE;
        int localSum = 0;
        for(int element : arr){
            localSum = Math.max(element, localSum + element);
            globalSum  = Math.max(globalSum, localSum);
        }
        return globalSum;
    }


    //an alternate way is to use Dynamic programming to store values ina n array for maxSum at each index.
    public static int[] maxSubarray(int[] arr){
        if(arr.length == 0) return new int[]{0};
        int[] dp = new int[arr.length];
        int maxSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            dp[i] = Math.max(arr[i],dp[i-1 + arr[i]]);
            maxSum = Math.max(maxSum, dp[i]);
        }
        for(int i : dp){
            System.out.print(i + " ");
        }
        return(dp);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-8,4,1};
        System.out.println(maxSubarraySum(arr));


    }
}
