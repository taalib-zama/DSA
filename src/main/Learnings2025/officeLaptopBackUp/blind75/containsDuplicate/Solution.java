package blind75.containsDuplicate;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }



    public static  boolean containsDuplicateUsingStreams(int[] nums) {
        return java.util.Arrays.stream(nums).distinct().count() < nums.length;
    }
}
