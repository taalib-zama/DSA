package backlog.leetcodeMustDo150.removeDuplicates;

public class Tester {
    public static void main(String[] args) {
        int[] nums= {1,1,2};
        int k = Solution.removeDuplicates(nums);
        // Output the result
        System.out.println("Number of unique elements: " + k);
        System.out.print("The unique elements are: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
