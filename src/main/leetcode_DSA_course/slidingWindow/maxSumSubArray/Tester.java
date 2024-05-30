package slidingWindow.maxSumSubArray;

public class Tester {
    public static void main(String[] args) {
//        //maximum average subarray 1.
//        int[] nums = {3,1,2,7,4,2,1,1,5};
//        int k = 8;

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(Solution.findMaxAverage(nums,k));
    }
}
