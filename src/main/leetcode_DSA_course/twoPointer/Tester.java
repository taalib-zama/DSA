package twoPointer;

public class Tester {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] result = Solution.sortedSquares(nums);
        for(int i : result){
            System.out.print(i + " ");
        }

    }
}
