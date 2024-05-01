package arrays.slidingWindowMaximum;

public class Tester {
    public static void main(String[] args) {
        int[]  nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Solution.maxSlidingWindow(nums,k));
    }
}
