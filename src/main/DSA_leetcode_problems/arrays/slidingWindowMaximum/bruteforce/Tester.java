package arrays.slidingWindowMaximum.bruteforce;

public class Tester {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        for(int i : Solution.maxSlidingWindow(nums, k)){
            System.out.println(i);
        }
    }
}
