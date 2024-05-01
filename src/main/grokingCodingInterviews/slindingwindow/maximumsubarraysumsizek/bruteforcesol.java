package slindingwindow.maximumsubarraysumsizek;

public class bruteforcesol {
    //TIME COMPLEXITY O(n*k)

    //A basic brute force solution will be to calculate the sum of all ‘k’ sized subarrays
    // of the given array, to find the subarray with the highest sum. We can start from every
    // index of the given array and add the next ‘k’ elements to find the sum of the subarray.
    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0, windowSum;
        for (int i = 0; i <= arr.length - k; i++) {
            windowSum = 0;
            for (int j = i; j < i + k; j++) {           //subarray of size k so sum will go till k from i
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
                + bruteforcesol.findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
        System.out.println("Maximum sum of a subarray of size K: "
                + +bruteforcesol.findMaxSumSubArray(2, new int[]{2, 3, 4, 1, 5}));
    }
}



