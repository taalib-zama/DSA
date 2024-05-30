package prefixSum.runningSum;

public class Tester {
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        int[] result = Solution.runningSum(nums);
        for(int i : result){
            System.out.print(i + ",");
        }
    }
}
