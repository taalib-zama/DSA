package blind75.twoSUm;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = Solution.twoSumUsingStream(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
