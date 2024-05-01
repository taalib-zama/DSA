package subsets;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<List<Integer>> result = Solution.subsets(new int[] { 1, 3 });
        System.out.println("Here is the list of subsets: " + result);
    }
}
