package slidingWindow.maxConsecutiveOnes3;



public class Tester {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 2;
        System.out.println(Solution.longestOnes(nums,k));
    }
}
