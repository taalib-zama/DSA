package slidingWindow.numberOfSubarrays;



public class Tester {
    public static void main(String[] args) {
        int[] nums = {3,-1,4,12,-8,5,6};
        int k = 4;
        System.out.println(Solution.numSubarrayProductLessThanK(nums,k));

        System.out.println(Solution.findBestSubarray(nums,k));
    }
}
