package arrays.twoSum;

public class Tester {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = new int[2];
        result = Solution.twoSum(nums, target);
        for(int i : result){
            System.out.println(i);
        }
    }
}
