package slidingWindow.maximumSubArrayAvg1;



public class Tester {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double result = Solution.findMaxAverage(nums, k);
        System.out.format("%.5f",result);
    }
}
